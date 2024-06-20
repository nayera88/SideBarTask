import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.SignInPage;
import utils.SeleniumBase;

public class testSideBar {
    @BeforeTest
    public void init(){
        SeleniumBase seleniumBase = new SeleniumBase();
        SignInPage signinPage=new SignInPage();
        seleniumBase.OpenBrowser();
        seleniumBase.SetupEnvironment();
        signinPage.signpage();
    }

    @Test
    public void OpenHomePage() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.openOverViewPage();
    }
    @Test
    public void OpenCreateEmailCampaign() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.openCreateEmailCampaign();
    }
}
