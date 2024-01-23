package com.globant.screens;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SwipeScreen extends BaseScreen {
    private static final String TITLE_SWIPE_HORIZONTAL = "new UiSelector().text(\"Swipe horizontal\")";
    @AndroidFindBy(uiAutomator = TITLE_SWIPE_HORIZONTAL)
    private WebElement title;    

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }

    @Override
    public Boolean checkScreen() {
        return elementExists(title);
    }
}  
