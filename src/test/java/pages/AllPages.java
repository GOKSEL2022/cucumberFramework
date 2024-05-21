package pages;

public class AllPages {

    public AllPages() {
    }
    private HomePage homePage;
    private LoginPage loginPage;


    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }


}
