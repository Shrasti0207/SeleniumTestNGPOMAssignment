package com.go1percent.pages;

import com.go1percent.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage extends TestBase {
    @FindBy(css = "app-help-videos > div  > div:nth-child(2)")
    WebElement radarDropdown;

    @FindBy(css = "app-help-videos > div  > div:nth-child(3)")
    WebElement contributionsDropdown;

    @FindBy(css = "app-help-videos > div  > div:nth-child(4)")
    WebElement techhubDropdown;
    public HelpPage(){
        PageFactory.initElements(driver, this);
    }

    public void validateHelpNavigationPage(){
        radarDropdown.isDisplayed();
        contributionsDropdown.isDisplayed();
        techhubDropdown.isDisplayed();
    }
}
