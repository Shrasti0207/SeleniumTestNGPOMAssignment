package com.go1percent.pages.Approvals;

import com.go1percent.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechhubPage extends TestBase {

    @FindBy(css = "div.d-flex.align-items-center > span")
    WebElement techHubsHeading;

    @FindBy(css = "a[class = 'cursor-pointer']")
    WebElement allTechhubsLink;
    public TechhubPage(){
        PageFactory.initElements(driver, this);
    }

    public void validateTechhubsNavigation(){
        techHubsHeading.isDisplayed();
        allTechhubsLink.isEnabled();
    }
}
