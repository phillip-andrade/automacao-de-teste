package steps;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.TricentsForm;
import util.TestRule;

public class Steps {

	TricentsForm form = new TricentsForm();

	@Dado("que acesso o formulario")
	public void openTricentisForm() {
		String tricentisUrl = "https://sampleapp.tricentis.com/101/app.php";
		TestRule.openBrowserChrome(tricentisUrl);
	}

	@Quando("selecionar tipo de veiculo automovel")
	public void selectMenuNavAutomobile() {
		form.getTabEnterVehicleData().selectMenuNavAutomobile();
	}

	@E("clicar na primeira aba")
	public void openFirstTab() {
		form.getTabEnterVehicleData().openTabEnterVehicleData();
	}

	@E("preencher todos campos na primeira aba")
	public void setAllFieldFirstTab() throws InterruptedException {
		setEnterVehicleData(form, "Toyota", "1500", "01/01/2022", "5", "Petrol", "45000", "ABC1D23", "10000");
	}

	@E("clique em next na primeira aba")
	public void clickNextFirstTab() throws InterruptedException {
		form.getTabEnterVehicleData().clickNext();
	}

	@Entao("avancou para a segunda aba")
	public void verifyNextTab() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(form.getFormTabEnterInsurantData().isTabSelected());
	}


	private void setEnterVehicleData(TricentsForm form, String make, String performace, String date, 
			String numberSeats, String fuelType, String price, String plateNumber, String mileage) throws InterruptedException {
		form.getTabEnterVehicleData().setSelectMake(make);
		form.getTabEnterVehicleData().setEnginePerformance(performace);
		form.getTabEnterVehicleData().setDateOfManufacture(date);
		form.getTabEnterVehicleData().setNumberOfSeats(numberSeats);
		form.getTabEnterVehicleData().setSelectFuelType(fuelType);
		form.getTabEnterVehicleData().setListPrice(price);
		form.getTabEnterVehicleData().setLicensePlateNumber(plateNumber);
		form.getTabEnterVehicleData().setAnnualMileage(mileage);
	}
}