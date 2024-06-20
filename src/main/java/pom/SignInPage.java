package pom;

import org.testng.Assert;
import utils.SeleniumActions;
import utils.SignInLocators;

public class SignInPage {
    public void signpage(){
        SignInLocators signinLocators = new SignInLocators();
        SeleniumActions action = new SeleniumActions();
        action.sendKey(signinLocators.signinEmail,"n.sabry+6+6@converted.in");
        action.sendKey(signinLocators.signinPassword,"nayera888");
        action.click(signinLocators.signinButton);
        String signin = action.getText(signinLocators.assertSignin);
        Assert.assertEquals(signin, "Dashboard", "login successfully");
        Assert.assertNotEquals(signin ,"assertion login is null");
}
}
