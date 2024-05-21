package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_StepDefs {
    AllPages allPages=new AllPages();
    @Given("kullanici url ye gider")
    public void kullaniciUrlYeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("kullanici anasayfanin acildigini dogrular")
    public void kullaniciAnasayfaninAcildiginiDogrular() {
        assert allPages.homePage().giris_yapHome.isDisplayed();
    }
}
