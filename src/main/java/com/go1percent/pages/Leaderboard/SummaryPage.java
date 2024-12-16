package com.go1percent.pages.Leaderboard;

import com.go1percent.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage extends TestBase {

    @FindBy(css = "app-leading-knolder  h4")
    WebElement leadingNashersHeading;

    public SummaryPage() {
        PageFactory.initElements(driver, this);
    }

    public void validateSummaryPageNavigation(){
        leadingNashersHeading.isDisplayed();
    }
}

