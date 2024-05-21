package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[text()='Giriş yap'])[1]")
    public WebElement girisYapButonUyeOlYaniGiris;

    @FindBy(xpath = "(//*[text()='Giriş yap'])[2]")
    public WebElement girisYapButonOnaylamaGiris;



}
