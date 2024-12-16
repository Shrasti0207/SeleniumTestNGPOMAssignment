package com.go1percent.pages.HelpDesk;

import com.go1percent.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketsRaisedByMePage extends TestBase {
    @FindBy(css = "a[class='cursor-pointer newTabs']")
    WebElement openTicketLink;

    @FindBy(css = "a[class='cursor-pointer']")
    WebElement closeTicketLink;
    public TicketsRaisedByMePage(){
        PageFactory.initElements(driver, this);
    }

    public void validateTicketsRaisedByMeNavigation(){
        openTicketLink.isDisplayed();
        closeTicketLink.isEnabled();
    }
}
