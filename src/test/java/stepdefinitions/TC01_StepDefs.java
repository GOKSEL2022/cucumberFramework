package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;
import static utilities.ReusableMethods.clickByJS;

public class TC01_StepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici url ye gider")
    public void kullaniciUrlYeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("kullanici anasayfanin acildigini dogrular")
    public void kullaniciAnasayfaninAcildiginiDogrular() {
        //assert allPages.homePage().giris_yapHome.isDisplayed();
        //assert Driver.getDriver().getCurrentUrl().contains("hepsiburada");
        assert Driver.getDriver().getTitle().contains("Hepsiburada.com");
    }
    @And("kullanici giris yap veya uye ol butonun gorunurlugunu dogrular")
    public void kullaniciGirisYapVeyaUyeOlButonunGorunurlugunuDogrular() {
        assert allPages.homePage().giris_yapHome.isDisplayed();
    }
    @And("kullanici giris yap veya uye ol butonun uzerine gelir")
    public void kullaniciGirisYapVeyaUyeOlButonunUzerineGelir() {
        actions.moveToElement(allPages.homePage().giris_yapHome).perform();
    }
    @And("kullanici giris yap linke tiklar")
    public void kullaniciGirisYapLinkeTiklar() {
        clickByJS(allPages.homePage().girisYapLinkGirisYapVeyaUyeOlHome);
    }
    @And("kullanici uye giris sayfasinin acildigini dogrular")
    public void kullaniciUyeGirisSayfasininAcildiginiDogrular() {
        assert allPages.girisPage().hepsiBuradaGirisYap_UyeOlAlaniGiris.isDisplayed();
    }
}
