import pages.TricentsForm;
import steps.Steps;

public class MainTemp {

    public static void main(String[] args) {

        TricentsForm form = new TricentsForm();
        Steps steps = new Steps();
        steps.openTricentisForm();

        //Preenchendo TricentsFormTabEnterVehicleData para Automobile
        form.getTabEnterVehicleData().selectMenuNavAutomobile();
        form.getTabEnterVehicleData().openTabEnterVehicleData();
        form.getTabEnterVehicleData().setSelectMake("Ford");
        form.getTabEnterVehicleData().setEnginePerformance("1200");
        form.getTabEnterVehicleData().setDateOfManufacture("01/01/2000");
        form.getTabEnterVehicleData().setNumberOfSeats("3");
        form.getTabEnterVehicleData().setSelectFuelType("Diesel");
        form.getTabEnterVehicleData().setListPrice("40000");
        form.getTabEnterVehicleData().setLicensePlateNumber("ABC1C23");
        form.getTabEnterVehicleData().setAnnualMileage("25000");
        form.getTabEnterVehicleData().clickNext();
        
        //Preenchendo TricentsFormTabEnterInsurantData para Automobile
        form.getFormTabEnterInsurantData().setFirstName("Phillip");
        form.getFormTabEnterInsurantData().setLastName("Andrade");
        form.getFormTabEnterInsurantData().setGender("Male");
        form.getFormTabEnterInsurantData().setStreetAddress("Rua Das Ostras");
        form.getFormTabEnterInsurantData().setSelectCountry("Brazil");
        form.getFormTabEnterInsurantData().setZipCode("5500000");
        form.getFormTabEnterInsurantData().setCity("Recife");
        form.getFormTabEnterInsurantData().setOccupation("Employee");
        form.getFormTabEnterInsurantData().selectHobbieSpeeding();
        form.getFormTabEnterInsurantData().selectHobbieBungeeJumping();
        form.getFormTabEnterInsurantData().selectHobbieCliffDiving();
        form.getFormTabEnterInsurantData().selectHobbieSkyDiving();
        form.getFormTabEnterInsurantData().selectHobbieOther();
        form.getFormTabEnterInsurantData().clickNext();
        
        //Preenchendo TricentsFormTabEnterProductData para Automobile
        form.getFormTabEnterProductData().setStartDate("11/16/2024");
        form.getFormTabEnterProductData().setInsuranceSum("7000000");
        form.getFormTabEnterProductData().setMeritRating("Super Bonus");
        form.getFormTabEnterProductData().setDamageInsurance("Full Coverage");
        form.getFormTabEnterProductData().setEuroProtection();
        form.getFormTabEnterProductData().setLegalDefenseInsurance();
        form.getFormTabEnterProductData().setCourtesyCar("Yes");
        form.getFormTabEnterProductData().clickNext();
        
        //Preenchendo TricentsFormTabSelectPriceOption para Automobile
        form.getFormTabSelectPriceOption().setSelectGold();
        form.getFormTabSelectPriceOption().selectViewQuote();
        form.getFormTabSelectPriceOption().selectDownloadQuote();
        form.getFormTabSelectPriceOption().clickNext();

    }

}