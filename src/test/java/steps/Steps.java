package steps;

import org.junit.Assert;

import functions.EnterInsurantData;
import functions.EnterProductData;
import functions.EnterProductDataAutomobile;
import functions.EnterVehicleData;
import functions.SelectPriceOption;
import functions.SendQuote;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.TricentsForm;
import util.TestRule;

public class Steps {

	TricentsForm form = new TricentsForm();
	EnterVehicleData vehicleData = new EnterVehicleData();
	EnterInsurantData insurantData = new EnterInsurantData();
	EnterProductData productData = new EnterProductData();
	EnterProductDataAutomobile productDataAutomobile = new EnterProductDataAutomobile();
	SelectPriceOption priceOption = new SelectPriceOption();
	SendQuote quote = new SendQuote();

	@Dado("o usuario tem acesso ao sistema")
	public void openTricentisForm() {
		String tricentisUrl = "https://sampleapp.tricentis.com/101/app.php";
		TestRule.openBrowserChrome(tricentisUrl);
	}

	@E("o usuario seleciona o tipo de veiculo automovel")
	public void selectMenuNavAutomobile() {
		form.getTabEnterVehicleData().selectMenuNavAutomobile();
	}

	@E("seleciona a primeira aba")
	public void openFirstTab() {
		form.getTabEnterVehicleData().openTabEnterVehicleData();
	}

	@E("preenche todos campos da primeira aba")
	public void setAllFieldFirstTab() throws InterruptedException {
		vehicleData.setEnterVehicleData(form, "Toyota", "1500", "01/01/2022", "5", "Petrol", "45000", "ABC1D23", "10000");
	}

	@Quando("clica em next na primeira aba")
	public void clickNextFirstTab() throws InterruptedException {
		form.getTabEnterVehicleData().clickNext();
	}
	
	@Entao("a segunda aba sera exibida")
	public void verifySecondTab() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(form.getFormTabEnterInsurantData().isTabSelected());
	}
	
	@E("preenche todos campos da segunda aba")
	public void setAllFieldSecondTab() throws InterruptedException {
		insurantData.setEnterInsurantData(form, "Fulano", "Tal", "01/01/1980", "Male", "Rua Logo Ali", "Brazil", "50000000", "Recife", "Employee");
	}
	
	@Quando("clica em next na segunda aba")
	public void clickNextSecondTab() throws InterruptedException {
		form.getFormTabEnterInsurantData().clickNext();
	}
	
	@Entao("a terceira aba sera exibida")
	public void verifyThirdTab() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(form.getFormTabEnterInsurantData().isTabSelected());
	}
	
	@E("preenche todos campos da terceira aba")
	public void setAllFieldThirdTab() throws InterruptedException {
		productDataAutomobile.setEnterProductDataAutomobile(productData, form, "11/18/2024", "7000000", "Super Bonus", "Full Coverage", "Yes");
	}
	
	@Quando("clica em next na terceira aba")
	public void clickNextThirdTab() throws InterruptedException {
		form.getFormTabEnterProductData().clickNext();
	}
	
	@Entao("a quarta aba sera exibida")
	public void verifyFourthTab() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(form.getFormTabSelectPriceOption().isTabSelected());
	}
	
	@E("seleciona a opcao de preco")
	public void setSelectOptionFourthTab() throws InterruptedException {
		priceOption.setSelectPriceOption(form);
	}
	
	@Quando("clica em next na quarta aba")
	public void clickNextFourthTab() throws InterruptedException {
		form.getFormTabSelectPriceOption().clickNext();
	}
	
	@Entao("a quinta aba sera exibida")
	public void verifyFifthTab() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(form.getFormTabSendQuote().isTabSelected());
	}
	
	@E("preenche todos campos da quinta aba")
	public void setAllFieldFifthTab() throws InterruptedException {
		quote.setSendQuote(form, "fulano@detal.com.br","99987654321", "Fulano", "Ft12345", "Ft12345");
	}
	
	@Quando("clica em send na quinta aba")
	public void clickNextFifthTab() throws InterruptedException {
		form.getFormTabSendQuote().clickSend();
	}
	
	@Entao("mensagem sucesso foi exibido")
	public void verifySweetAlertOK() throws InterruptedException {
		Thread.sleep(20000);
		Assert.assertEquals("Sending e-mail success!", form.getSweetAlertOK().getAlertMessage());
	}
}