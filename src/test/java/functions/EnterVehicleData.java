package functions;

import pages.TricentsForm;

public class EnterVehicleData {
	
	public void setEnterVehicleData(TricentsForm form, String make, String performace, String date, 
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
