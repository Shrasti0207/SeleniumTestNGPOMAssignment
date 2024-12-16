package com.go1percent.testcases;

import com.go1percent.base.TestBase;
import com.go1percent.pages.DashboardPage;
import com.go1percent.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchAndFilter extends TestBase {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    public SearchAndFilter(){
        super();
    }
    @BeforeTest
    public void setup(){

        initialization();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test
    public void testSearchFunctionality() {
        dashboardPage.searchNasher();
        dashboardPage.nasherName.isDisplayed();
        String redeemedText = dashboardPage.redeemedRewardsText.getText();
        Assert.assertEquals(redeemedText, "Redeemed");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
