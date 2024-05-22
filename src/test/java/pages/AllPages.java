package pages;

public class AllPages {

    public AllPages() {
    }
    private HomePage homePage;
    private GirisPage girisPage;


    public GirisPage girisPage() {
        if (girisPage == null) {
            girisPage = new GirisPage();
        }
        return girisPage;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }


}
