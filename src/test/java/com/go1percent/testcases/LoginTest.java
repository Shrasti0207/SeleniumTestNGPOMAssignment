package com.go1percent.testcases;

import com.go1percent.base.TestBase;
import com.go1percent.pages.DashboardPage;
import com.go1percent.pages.LoginPage;
import com.go1percent.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    public LoginTest(){
        super();
    }
    @BeforeMethod
    public void setup(){

        initialization();
        loginPage = new LoginPage();
    }

    @Test
    public void loginWithInvalidCredentials(){
        dashboardPage = loginPage.login(prop.getProperty("invalidUsername"), prop.getProperty("invalidPassword"));
        String errorMessage = loginPage.validateUsernameOrPasswordError();
        Assert.assertTrue(errorMessage.contains("Invalid username or password."), "error message");
    }

    @DataProvider(name = "LoginCredentials")
    public Object[][] getRepositoryData() throws Exception {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/testData.xlsx";
        return TestUtil.getExcelData(filePath, "techhubRepository");
    }

    @Test(dataProvider = "LoginCredentials")
    public void loginWithValidCredentials(String username, String password){
        dashboardPage = loginPage.login(username, password);
        String title = dashboardPage.validateTitle();
        Assert.assertEquals(title, "Knoldus Leaderboard");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
