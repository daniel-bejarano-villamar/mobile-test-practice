package com.globant.tests;

import org.testng.annotations.Test;

import com.globant.screens.GeneralScreen;
import com.globant.utils.tests.BaseTest;

public class NavigationTest extends BaseTest {
    GeneralScreen generalScreen;
    @Test
    public void navigationTest(){
        generalScreen = generateGeneralScreen();
    }
}
