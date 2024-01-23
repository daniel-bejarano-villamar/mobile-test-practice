package com.globant.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }
    private String email = "example@example.com";
    private String email2 = "example2@example.com";
    private String pwd = "passwordForTesting123.";

    private static final String MAIL_INPUT = "new UiSelector().description(\"input-email\")";
    @AndroidFindBy(uiAutomator = MAIL_INPUT)
    private WebElement mailInput;

    private static final String PASSWORD_INPUT = "new UiSelector().description(\"input-password\")";
    @AndroidFindBy(uiAutomator = PASSWORD_INPUT)
    private WebElement pwdInput;

    private static final String REPEAT_PASSWORD_INPUT = "new UiSelector().descriptionContains(\"input-repeat-password\")";
    @AndroidFindBy(uiAutomator = REPEAT_PASSWORD_INPUT)
    private WebElement repeatPwdInput;

    private static final String LOGIN_BTN = "new UiSelector().text(\"LOGIN\")";
    @AndroidFindBy(uiAutomator = LOGIN_BTN)
    private WebElement logInBtn;

    private static final String LOGIN_CONFIRMATION = "new UiSelector().text(\"You are logged in!\")";
    @AndroidFindBy(uiAutomator = LOGIN_CONFIRMATION)
    private WebElement logInConfirmationText;

    private static final String TITLE = "new UiSelector().text(\"Login / Sign up Form\")";
    @AndroidFindBy(uiAutomator = TITLE)
    private WebElement title;
    
    private static final String LOGIN_SUCCESS = "new UiSelector().text(\"You are logged in!\")";
    @AndroidFindBy(uiAutomator = LOGIN_SUCCESS)
    private WebElement loginSuccessTxt;

    private static final String SIGNUP_SUCCESS = "new UiSelector().text(\"You successfully signed up!\")";
    @AndroidFindBy(uiAutomator = SIGNUP_SUCCESS)
    private WebElement signupSuccessTxt;

    private static final String OK_BTN = "new UiSelector().text(\"OK\")";
    @AndroidFindBy(uiAutomator =  OK_BTN)
    private WebElement okBtn;

    private static final String SIGNUP_BTN = "new UiSelector().text(\"SIGN UP\")";
    @AndroidFindBy(uiAutomator = SIGNUP_BTN)
    private WebElement signUpBtn;

    @Override
    public Boolean checkScreen() {
        return elementExists(title);
    }

    public void enterMail(String mail){
        mailInput.sendKeys(mail);
    }
    public void enterPwd(String pwd){
        pwdInput.sendKeys(pwd);
    }

    public void clickOnLogInBtn(){
        logInBtn.click();
    }

    public void signUpAndLogInScreenExists(){
        clickOnLogInBtn();
        softAssert.assertTrue(elementExists(title));
    }

    public void logIn(){
        softAssert.assertTrue(elementExists(logInBtn));
        logInBtn.click();
        softAssert.assertTrue(elementExists(mailInput));
        mailInput.sendKeys(email);
        softAssert.assertTrue(elementExists(pwdInput));
        pwdInput.sendKeys(pwd);
        logInBtn.click();
        softAssert.assertTrue(elementExists(loginSuccessTxt));
        okBtn.click();
        softAssert.assertAll();
    }

    public void register() {
        softAssert.assertTrue(elementExists(signUpBtn));
        mailInput.sendKeys(email2);
        pwdInput.sendKeys(pwd);
        repeatPwdInput.sendKeys(pwd);
        signUpBtn.click();
        softAssert.assertTrue(elementExists(signupSuccessTxt));
        okBtn.click();
        softAssert.assertAll();
    }

}
