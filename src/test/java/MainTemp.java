import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

import pages.TricentsForm;
import steps.Steps;

public class MainTemp {

	public static void main(String[] args) throws InterruptedException {

		TricentsForm form = new TricentsForm();
		Steps steps = new Steps();
		steps.openTricentisForm();

		//Preenchendo TricentsFormTabEnterVehicleData para Automobile
		enterVehicleData(form, "Ford", "15", "01/01/2022", "5", "Petrol", "45000", "ABC1D23", "10000");

		//Preenchendo TricentsFormTabEnterInsurantData para Automobile
		enterInsurantData(form, "Fulano", "Tal", "01/01/1980", "Male", "Rua Logo Ali", "Brazil", "50000000", "Recife", "Employee");

		//Preenchendo TricentsFormTabEnterProductData para Automobile
		enterProductData(form, "11/17/2024", "7000000", "Super Bonus", "Full Coverage", "Yes");

		//Preenchendo TricentsFormTabSelectPriceOption para Automobile
		selectPriceOption(form);

		//Preenchendo TricentsFormTabSendQuote para Automobile
		sendQuote(form, "fulano@detal.com.br","99987654321", "Fulano", "Ft12345", "Ft12345");
	}

	private static void enterVehicleData(TricentsForm form, String make, String performace, String date, 
			String numberSeats, String fuelType, String price, String plateNumber, String mileage) throws InterruptedException {
		form.getTabEnterVehicleData().selectMenuNavAutomobile();
		form.getTabEnterVehicleData().openTabEnterVehicleData();
		form.getTabEnterVehicleData().setSelectMake(make);
		form.getTabEnterVehicleData().setEnginePerformance(performace);
		form.getTabEnterVehicleData().setDateOfManufacture(date);
		form.getTabEnterVehicleData().setNumberOfSeats(numberSeats);
		form.getTabEnterVehicleData().setSelectFuelType(fuelType);
		form.getTabEnterVehicleData().setListPrice(price);
		form.getTabEnterVehicleData().setLicensePlateNumber(plateNumber);
		form.getTabEnterVehicleData().setAnnualMileage(mileage);
		form.getTabEnterVehicleData().clickNext();
	}
	
	private static void enterInsurantData(TricentsForm form, String firstName, String lastName, String date,
			String gender, String streetAddress, String country, String zipCode, String city, String occupation) throws InterruptedException {
		form.getFormTabEnterInsurantData().setFirstName(firstName);
		form.getFormTabEnterInsurantData().setLastName(lastName);
		form.getFormTabEnterInsurantData().setBirthDate(date);
		form.getFormTabEnterInsurantData().setGender(gender);
		form.getFormTabEnterInsurantData().setStreetAddress(streetAddress);
		form.getFormTabEnterInsurantData().setSelectCountry(country);
		form.getFormTabEnterInsurantData().setZipCode(zipCode);
		form.getFormTabEnterInsurantData().setCity(city);
		form.getFormTabEnterInsurantData().setOccupation(occupation);
		form.getFormTabEnterInsurantData().selectHobbieSpeeding();
		form.getFormTabEnterInsurantData().selectHobbieBungeeJumping();
		form.getFormTabEnterInsurantData().selectHobbieCliffDiving();
		form.getFormTabEnterInsurantData().selectHobbieSkyDiving();
		form.getFormTabEnterInsurantData().selectHobbieOther();
		form.getFormTabEnterInsurantData().clickNext();
	}

	private static void enterProductData(TricentsForm form, String date, String insuranceSum, String meritRating,
			String damageInsurance, String courtesyCar) throws InterruptedException {
		form.getFormTabEnterProductData().setStartDate("11/17/2024");
		form.getFormTabEnterProductData().setInsuranceSum("7000000");
		form.getFormTabEnterProductData().setMeritRating("Super Bonus");
		form.getFormTabEnterProductData().setDamageInsurance("Full Coverage");
		form.getFormTabEnterProductData().setEuroProtection();
		form.getFormTabEnterProductData().setLegalDefenseInsurance();
		form.getFormTabEnterProductData().setCourtesyCar("Yes");
		form.getFormTabEnterProductData().clickNext();
	}

	private static void selectPriceOption(TricentsForm form) throws InterruptedException {
		form.getFormTabSelectPriceOption().setSelectGold();
//		form.getFormTabSelectPriceOption().selectViewQuote();
//		form.getFormTabSelectPriceOption().selectDownloadQuote();
		form.getFormTabSelectPriceOption().clickNext();
	}

	private static void sendQuote(TricentsForm form, String email, String phone, String username, 
			String password, String confirmPassword) throws InterruptedException {
		form.getFormTabSendQuote().setEmail(email);
		form.getFormTabSendQuote().setPhone(phone);
		form.getFormTabSendQuote().setUsername(username);
		form.getFormTabSendQuote().setPassword(password);
		form.getFormTabSendQuote().setConfirmPassword(confirmPassword);
		form.getFormTabSendQuote().clickSend();
	}
}