package com.go1percent.pages.Knolx;

import com.go1percent.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SessionsPage extends TestBase {
    @FindBy(css = "div.table_header_section div span.heading")
    WebElement knolxSessionsHeading;

    @FindBy(css = "a[class='cursor-pointer']")
    WebElement pastSessionsLink;

    public SessionsPage(){
        PageFactory.initElements(driver, this);
    }

    public void validateSessionsNavigationPage(){
        knolxSessionsHeading.isDisplayed();
        pastSessionsLink.isEnabled();
    }
}
