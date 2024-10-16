import pages.TricentsForm;
import steps.Steps;

public class MainSelenium {

	public static void main(String[] args) throws InterruptedException {

		TricentsForm form = new TricentsForm();
		Steps steps = new Steps();
		steps.openTricentisForm();
		String typeVehicle = "Camper";
		form.getTabEnterVehicleData().selectMenuNavAutomobile();

		switch (typeVehicle){
		case "Automobile": {
			//teste para Automobile
			form.getTabEnterVehicleData().selectMenuNavAutomobile();
			form.getTabEnterVehicleData().openTabEnterVehicleData();
			enterVehicleData(form, "Toyota", "1500", "01/01/2022", "5", "Petrol", "45000", "ABC1D23", "10000");
			form.getTabEnterVehicleData().clickNext();
			break;
		}
		case "Truck": {
			//teste para Truck
			form.getTabEnterVehicleData().selectMenuNavTruck();
			enterVehicleDataTruck(form, "Ford", "2000", "01/01/2024", "3", "Petrol", "90000", "ABC1D23", "100000", "1000", "40000");
			form.getTabEnterVehicleData().clickNext();
			break;
		}
		case "Motorcycle": {
			//teste para Motorcycle
			form.getTabEnterVehicleData().selectMenuNavMotorcycle();
			enterVehicleDataMotorcycle(form, "BMW","Scooter", "400", "200", "01/01/2023", "2", "25000", "6000");
			form.getTabEnterVehicleData().clickNext();
			break;
		}
		case "Camper": {
			//teste para Camper
			form.getTabEnterVehicleData().selectMenuNavCamper();
			enterVehicleDataCamper(form, "Ford", "1800", "01/01/2020", "9", "Diesel", "100000", "ABC1D23", "90000", "1000", "2500", "Yes");
			form.getTabEnterVehicleData().clickNext();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + typeVehicle);
		}

		//Preenchendo TricentsFormTabEnterInsurantData. 
		enterInsurantData(form, "Fulano", "Tal", "01/01/1980", "Male", "Rua Logo Ali", "Brazil", "50000000", "Recife", "Employee");

		//Preenchendo TricentsFormTabEnterProductData.
		if(typeVehicle.equalsIgnoreCase("Automobile")) {
			enterProductDataAutomobile(form, "11/17/2024", "7000000", "Super Bonus", "Full Coverage", "Yes");
			form.getFormTabEnterProductData().clickNext();
		} else {
			enterProductData(form, "11/17/2024", "7000000", "Full Coverage");
			form.getFormTabEnterProductData().clickNext();
		}

		//Preenchendo TricentsFormTabSelectPriceOption. 
		selectPriceOption(form);

		//Preenchendo TricentsFormTabSendQuote. 
		sendQuote(form, "fulano@detal.com.br","99987654321", "Fulano", "Ft12345", "Ft12345");

		//		form.getSweetAlertOK();
	}

	private static void enterVehicleData(TricentsForm form, String make, String performace, String date, 
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

	private static void enterVehicleDataTruck(TricentsForm form, String make, String performace, String date, 
			String numberSeats, String fuelType, String price, String plateNumber, String mileage,
			String payload, String totalWeight) throws InterruptedException {
		enterVehicleData(form, make, performace, date, numberSeats, fuelType, price, plateNumber, mileage);
		form.getTabEnterVehicleData().setPayload(payload);
		form.getTabEnterVehicleData().setTotalWeight(totalWeight);
	}

	private static void enterVehicleDataMotorcycle(TricentsForm form, String make, String model, String cylinderCapacity,
			String performace, String date, String numberSeats, String price, String mileage
			) throws InterruptedException {
		form.getTabEnterVehicleData().setSelectMake(make);
		form.getTabEnterVehicleData().setModel(model);
		form.getTabEnterVehicleData().setCylinderCapacity(cylinderCapacity);
		form.getTabEnterVehicleData().setEnginePerformance(performace);
		form.getTabEnterVehicleData().setDateOfManufacture(date);
		form.getTabEnterVehicleData().setNumberOfSeatsMotorcycle(numberSeats);
		form.getTabEnterVehicleData().setListPrice(price);
		form.getTabEnterVehicleData().setAnnualMileage(mileage);
	}

	private static void enterVehicleDataCamper(TricentsForm form, String make, String performace, String date, 
			String numberSeats, String fuelType, String price, String plateNumber, String mileage,
			String payload, String totalWeight, String rightHandDrive) throws InterruptedException {
		enterVehicleData(form, make, performace, date, numberSeats, fuelType, price, plateNumber, mileage);
		form.getTabEnterVehicleData().setPayload(payload);
		form.getTabEnterVehicleData().setTotalWeight(totalWeight);
		form.getTabEnterVehicleData().setRightHandDrive(rightHandDrive);
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

	private static void enterProductData(TricentsForm form, String date, String insuranceSum,
			String damageInsurance) throws InterruptedException {
		form.getFormTabEnterProductData().setStartDate(date);
		form.getFormTabEnterProductData().setInsuranceSum(insuranceSum);
		form.getFormTabEnterProductData().setDamageInsurance(damageInsurance);
		form.getFormTabEnterProductData().setEuroProtection();
		form.getFormTabEnterProductData().setLegalDefenseInsurance();
	}
	
	private static void enterProductDataAutomobile(TricentsForm form, String date, 
			String insuranceSum, String meritRating, String damageInsurance, 
			String courtesyCar) throws InterruptedException {
		enterProductData(form, date, insuranceSum, damageInsurance);
		form.getFormTabEnterProductData().setMeritRating("Super Bonus");
		form.getFormTabEnterProductData().setCourtesyCar("Yes");
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