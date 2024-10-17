package functions;

import pages.TricentsForm;

public class EnterProductDataAutomobile {
	
	public void setEnterProductDataAutomobile(EnterProductData productData, TricentsForm form, 
			String date, String insuranceSum, String meritRating, String damageInsurance, 
			String courtesyCar) throws InterruptedException {
		productData.setEnterProductData(form, date, insuranceSum, damageInsurance);
		form.getFormTabEnterProductData().setMeritRating("Super Bonus");
		form.getFormTabEnterProductData().setCourtesyCar("Yes");
	}

}
