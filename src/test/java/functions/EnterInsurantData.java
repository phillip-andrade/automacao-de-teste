package functions;

import pages.TricentsForm;

public class EnterInsurantData {
	
	public void setEnterInsurantData(TricentsForm form, String firstName, String lastName, String date,
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
	}

}
