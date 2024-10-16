package pages;

public class TricentsForm {

    private final TricentsFormTabEnterVehicleData tabEnterVehicleData = new TricentsFormTabEnterVehicleData();  
    private final TricentsFormTabEnterInsurantData tabEnterInsurantData = new TricentsFormTabEnterInsurantData();
    private final TricentsFormTabEnterProductData tabEnterProductData = new TricentsFormTabEnterProductData();
    private final TricentsFormTabSelectPriceOption tabSelectPriceOption = new TricentsFormTabSelectPriceOption();

    public TricentsFormTabEnterVehicleData getTabEnterVehicleData() {
        return tabEnterVehicleData;
    }
    
    public TricentsFormTabEnterInsurantData getFormTabEnterInsurantData() {
    	return tabEnterInsurantData;
    }
    
    public TricentsFormTabEnterProductData getFormTabEnterProductData() {
    	return tabEnterProductData;
    }
    
    public TricentsFormTabSelectPriceOption getFormTabSelectPriceOption() {
    	return tabSelectPriceOption;
    }
}