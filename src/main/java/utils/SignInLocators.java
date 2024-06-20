package utils;

import org.openqa.selenium.By;

public class SignInLocators {

    public By signinEmail = By.id("email");
    public By signinPassword = By.id("password");
    public By signinButton = By.xpath(" //button[contains(text(),'Login')]");

    public By assertSignin = By.xpath(" //h1[contains(text(),'Dashboard')]");

}
