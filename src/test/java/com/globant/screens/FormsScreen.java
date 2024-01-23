package com.globant.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormsScreen extends BaseScreen {

    private static final String FORM_COMPONENTS_TITLE = "new UiSelector().text(\"Form components\")";
    @AndroidFindBy(uiAutomator = FORM_COMPONENTS_TITLE)
    private WebElement title;
        
    @Override
    public Boolean checkScreen() {
        return elementExists(title);
    }
    
    public FormsScreen(AndroidDriver driver) {
        super(driver);
    }
}
