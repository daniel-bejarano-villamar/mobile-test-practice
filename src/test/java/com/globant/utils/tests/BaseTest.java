package com.globant.utils.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.globant.screens.GeneralScreen;
import com.globant.screens.LoginScreen;
import com.globant.screens.SwipeScreen;

public class BaseTest {
    private static final String PROPERTIES_FILE = "src/test/resources/config.properties";
    private static final Properties properties = new Properties();
    private AndroidDriver driver;
    
    @BeforeClass
    public void setEnvironment(){
        loadPropertiesFile();
        UiAutomator2Options capabilities = new UiAutomator2Options();
        setCapabilities(capabilities);
        try{
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        } catch (MalformedURLException exception){
            System.out.println(exception.getMessage());
        }
    }
    private void setCapabilities(UiAutomator2Options capabilities){
        capabilities.setPlatformName(getCapability("platformName"));
        capabilities.setDeviceName(getCapability("deviceName"));
        capabilities.setAppPackage(getCapability("appPackage"));
        capabilities.setAppActivity(getCapability("appActivity"));
    }

    private void loadPropertiesFile(){
    try {
        FileInputStream fileInputStream = new FileInputStream(PROPERTIES_FILE);
        properties.load(fileInputStream);
    }catch (IOException e){
        throw new RuntimeException("Couldn't load properties files" + PROPERTIES_FILE);
    }
    }

    private static String getCapability(String variable){ return properties.getProperty(variable);}
    
    public GeneralScreen generateGeneralScreen(){
        return new GeneralScreen(driver);
    }
    public LoginScreen generateLoginScreen(){
        return new LoginScreen(driver);
    }
    public SwipeScreen generateSwipeScreen(){
        return new SwipeScreen(driver);
    }

    @AfterClass
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
    
}