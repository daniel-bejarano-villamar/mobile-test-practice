package com.globant.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragScreen extends BaseScreen {
    public DragScreen(AndroidDriver driver) {
        super(driver);
    }
    private static final String DRAG_AND_DROP_TITLE = "new UiSelector().text(\"Drag and Drop\")";
    @AndroidFindBy(uiAutomator = DRAG_AND_DROP_TITLE)
    private WebElement title;
    
    @Override
    public Boolean checkScreen() {
        return elementExists(title);
    }
}
