package com.globant.tests;

import org.testng.annotations.BeforeTest;

import com.globant.screens.SwipeScreen;
import com.globant.utils.tests.BaseTest;

public class SwipeTest extends BaseTest {
    SwipeScreen swipeScreen;

    @BeforeTest
    public void generateSignUpScreen(){
        swipeScreen = generateSwipeScreen();
    }

}
