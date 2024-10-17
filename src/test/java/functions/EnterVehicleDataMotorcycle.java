package functions;

import pages.TricentsForm;

public class EnterVehicleDataMotorcycle {
	
	public void setEnterVehicleDataMotorcycle(TricentsForm form, String make, String model, String cylinderCapacity,
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

}
