package com.go1percent.pages.Knolx;

import com.go1percent.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage extends TestBase {

    @FindBy(css = "div.inline div.row h5")
    WebElement topKnolxSessionsHeading;

    @FindBy(css = ".descriptions h5")
    WebElement monthlyAnalysisHeading;

    public ReportsPage(){
        PageFactory.initElements(driver,this);
    }

    public void validateReportsPageNavigation(){
        topKnolxSessionsHeading.isDisplayed();
        monthlyAnalysisHeading.isDisplayed();
    }
}
