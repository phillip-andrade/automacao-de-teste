package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import pages.TricentsForm;
import util.TestRule;

public class Steps {

    TricentsForm form = new TricentsForm();

    @Dado(("que acesso o formulario"))
    public void openTricentisForm() {
        String tricentisUrl = "https://sampleapp.tricentis.com/101/app.php";
        TestRule.openBrowserChrome(tricentisUrl);
    }

    @Quando("clicar na primeira aba")
    public void openFirstTab() {
        form.getTabEnterVehicleData().openTabEnterVehicleData();
    }

    @E("preencher todos campos na primeira aba")
    public void setAllFieldFirstTab() {
        form.getTabEnterVehicleData().setEnginePerformance("Teste via Cucumber");
    }

    @E("clique em next na primeira aba")
    public void clickNextFirstTab() throws InterruptedException {
        form.getTabEnterVehicleData().clickNext();
    }
}