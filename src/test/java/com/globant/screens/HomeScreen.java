package com.globant.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen{
    private static final String WEBDRIVER_TITLE = "new UiSelector().text(\"WEBDRIVER\")";
    @AndroidFindBy(uiAutomator = WEBDRIVER_TITLE)
    private WebElement title;
    
    @Override
    public Boolean checkScreen() {
        return elementExists(title);
    }
    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }
}
