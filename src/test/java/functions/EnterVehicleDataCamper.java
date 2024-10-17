package functions;

import pages.TricentsForm;

public class EnterVehicleDataCamper {

	public void setEnterVehicleDataCamper(EnterVehicleData vehicleDate, TricentsForm form, String make, String performace, String date, 
			String numberSeats, String fuelType, String price, String plateNumber, String mileage,
			String payload, String totalWeight, String rightHandDrive) throws InterruptedException {
		vehicleDate.setEnterVehicleData(form, make, performace, date, numberSeats, fuelType, price, plateNumber, mileage);
		form.getTabEnterVehicleData().setPayload(payload);
		form.getTabEnterVehicleData().setTotalWeight(totalWeight);
		form.getTabEnterVehicleData().setRightHandDrive(rightHandDrive);
	}

}
