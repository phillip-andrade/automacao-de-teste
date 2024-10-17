package functions;

import pages.TricentsForm;

public class EnterVehicleDataTruck {
	
	public void setEnterVehicleDataTruck(EnterVehicleData vehicleDate, TricentsForm form, String make, String performace, String date, 
			String numberSeats, String fuelType, String price, String plateNumber, String mileage,
			String payload, String totalWeight) throws InterruptedException {
		vehicleDate.setEnterVehicleData(form, make, performace, date, numberSeats, fuelType, price, plateNumber, mileage);
		form.getTabEnterVehicleData().setPayload(payload);
		form.getTabEnterVehicleData().setTotalWeight(totalWeight);
	}

}
