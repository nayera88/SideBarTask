package pom;

import org.testng.Assert;
import utils.SeleniumActions;
import utils.Locators;

public class SignInPage {
    public void signpage(){
        Locators signinLocators = new Locators();
        SeleniumActions action = new SeleniumActions();
        action.sendKey(signinLocators.signinEmail,"n.sabry+9+9+@converted.in");
        action.sendKey(signinLocators.signinPassword,"nayera888");
        action.click(signinLocators.signinButton);
        String signin = action.getText(signinLocators.assertSignin);
        Assert.assertEquals(signin, "Dashboard", "login successfully");
        Assert.assertNotEquals(signin ,"assertion login is null");
}
}
