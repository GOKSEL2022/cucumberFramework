package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class GirisPage {
    public GirisPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='_1B2EtfCKK4gjcRyyLEUUT8']")
    public WebElement hepsiBuradaGirisYap_UyeOlAlaniGiris;




}
