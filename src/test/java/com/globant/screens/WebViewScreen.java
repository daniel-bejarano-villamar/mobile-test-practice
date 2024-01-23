package com.globant.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WebViewScreen extends BaseScreen {
    private static final String BROWSER_AUTOMATION_TITLE = "new UiSelector().text(\"Next-gen browser and mobile automation test framework for Node.js\")";
    @AndroidFindBy(uiAutomator = BROWSER_AUTOMATION_TITLE)
    private WebElement title;
    
    @Override
    public Boolean checkScreen() {
        return elementExists(title);
    }
    public WebViewScreen(AndroidDriver driver) {
        super(driver);
    }

}
