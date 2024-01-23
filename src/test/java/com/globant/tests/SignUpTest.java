package com.globant.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.globant.screens.LoginScreen;
import com.globant.utils.tests.BaseTest;

public class SignUpTest extends BaseTest{
    private LoginScreen loginScreen;
    //Should have used DataProviders
    @BeforeTest
    public void generateSignUpScreen(){
        loginScreen = generateLoginScreen();
        loginScreen.signUpAndLogInScreenExists();
    }

    @Test
    public void signUpTest(){
        loginScreen.register();
    }
}
