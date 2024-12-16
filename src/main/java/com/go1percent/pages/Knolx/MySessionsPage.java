package com.go1percent.pages.Knolx;

import com.go1percent.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MySessionsPage extends TestBase {
    @FindBy (css = ".newTabs")
    WebElement myUpcomingSessionLink;

    @FindBy(css = "a[href*='my-past-sessions']")
    WebElement myPastSessionsLink;

    public MySessionsPage(){
        PageFactory.initElements(driver, this);
    }

    public void validateMySessionsNavigationPage(){
        myUpcomingSessionLink.isDisplayed();
        myPastSessionsLink.isEnabled();
    }
}
