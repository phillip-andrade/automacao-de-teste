package functions;

import pages.TricentsForm;

public class EnterProductData {
	public void setEnterProductData(TricentsForm form, String date, String insuranceSum,
			String damageInsurance) throws InterruptedException {
		form.getFormTabEnterProductData().setStartDate(date);
		form.getFormTabEnterProductData().setInsuranceSum(insuranceSum);
		form.getFormTabEnterProductData().setDamageInsurance(damageInsurance);
		form.getFormTabEnterProductData().setEuroProtection();
		form.getFormTabEnterProductData().setLegalDefenseInsurance();
	}

}
