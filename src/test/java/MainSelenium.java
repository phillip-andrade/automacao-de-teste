import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import functions.EnterInsurantData;
import functions.EnterProductData;
import functions.EnterProductDataAutomobile;
import functions.EnterVehicleData;
import functions.EnterVehicleDataCamper;
import functions.EnterVehicleDataMotorcycle;
import functions.EnterVehicleDataTruck;
import functions.SelectPriceOption;
import functions.SendQuote;
import pages.TricentsForm;
import steps.Steps;
import util.Page;

public class MainSelenium {

	public static void main(String[] args) throws InterruptedException {

		TricentsForm form = new TricentsForm();
		Steps steps = new Steps();
		steps.openTricentisForm();
		form.getTabEnterVehicleData().selectMenuNavAutomobile();
		EnterVehicleData vehicleData = new EnterVehicleData();

		String typeVehicle = "Truck";
		switch (typeVehicle){
		case "Automobile": {
			//teste para Automobile
			form.getTabEnterVehicleData().selectMenuNavAutomobile();
			form.getTabEnterVehicleData().openTabEnterVehicleData();
			vehicleData.setEnterVehicleData(form, "Toyota", "1500", "01/01/2022", "5", "Petrol", "45000", "ABC1D23", "10000");
			form.getTabEnterVehicleData().clickNext();
			break;
		}
		case "Truck": {
			//teste para Truck
			EnterVehicleDataTruck vehicleTruck = new EnterVehicleDataTruck();
			form.getTabEnterVehicleData().selectMenuNavTruck();
			vehicleTruck.setEnterVehicleDataTruck(vehicleData, form, "Ford", "2000", "01/01/2024", "3", "Petrol", "90000", "ABC1D23", "100000", "1000", "40000");
			form.getTabEnterVehicleData().clickNext();
			break;
		}
		case "Motorcycle": {
			//teste para Motorcycle
			EnterVehicleDataMotorcycle vehicleMotocycle = new EnterVehicleDataMotorcycle();
			form.getTabEnterVehicleData().selectMenuNavMotorcycle();
			vehicleMotocycle.setEnterVehicleDataMotorcycle(form, "BMW","Scooter", "400", "200", "01/01/2023", "2", "25000", "6000");
			form.getTabEnterVehicleData().clickNext();
			break;
		}
		case "Camper": {
			//teste para Camper
			EnterVehicleDataCamper vehicleCamper = new EnterVehicleDataCamper();
			form.getTabEnterVehicleData().selectMenuNavCamper();
			vehicleCamper.setEnterVehicleDataCamper(vehicleData, form, "Ford", "1800", "01/01/2020", "9", "Diesel", "100000", "ABC1D23", "90000", "1000", "2500", "Yes");
			form.getTabEnterVehicleData().clickNext();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + typeVehicle);
		}

		//Preenchendo TricentsFormTabEnterInsurantData.
		EnterInsurantData insurantData = new EnterInsurantData();
		insurantData.setEnterInsurantData(form, "Fulano", "Tal", "01/01/1980", "Male", "Rua Logo Ali", "Brazil", "50000000", "Recife", "Employee");
		form.getFormTabEnterInsurantData().clickNext();

		//Preenchendo TricentsFormTabEnterProductData.
		EnterProductData productData = new EnterProductData();
		EnterProductDataAutomobile productDataAutomobile = new EnterProductDataAutomobile();
		if(typeVehicle.equalsIgnoreCase("Automobile")) {
			productDataAutomobile.setEnterProductDataAutomobile(productData, form, "11/18/2024", "7000000", "Super Bonus", "Full Coverage", "Yes");
		} else {
			productData.setEnterProductData(form, "11/18/2024", "7000000", "Full Coverage");
		}
		form.getFormTabEnterProductData().clickNext();

		//Preenchendo TricentsFormTabSelectPriceOption.
		SelectPriceOption priceOption = new SelectPriceOption();
		priceOption.setSelectPriceOption(form);
		form.getFormTabSelectPriceOption().clickNext();

		//Preenchendo TricentsFormTabSendQuote.
		SendQuote quote = new SendQuote();
		quote.setSendQuote(form, "fulano@detal.com.br","99987654321", "Fulano", "Ft12345", "Ft12345");
		form.getFormTabSendQuote().clickSend();
	
		Thread.sleep(20000);
		Assert.assertEquals("Sending e-mail success!", form.getSweetAlertOK().getAlertMessage());

	}

}