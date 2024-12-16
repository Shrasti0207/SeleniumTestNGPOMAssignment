package com.go1percent.pages;

import com.go1percent.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(id="username")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="kc-login")
    WebElement loginButton;


    @FindBy(id="input-error")
    WebElement usernameOrPasswordError;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateUsernameOrPasswordError(){
        return usernameOrPasswordError.getText();
    }

    public DashboardPage login(String user_name, String pass_word){
        username.sendKeys(user_name);
        password.sendKeys(pass_word);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
        loginButton.click();

        return new DashboardPage();
    }
}
