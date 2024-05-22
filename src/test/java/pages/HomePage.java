package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@id='myAccount']")
    public WebElement giris_yapHome;

    @FindBy(id = "login")
    public WebElement girisYapLinkGirisYapVeyaUyeOlHome;


}
