package com.go1percent.pages.Leaderboard;

import com.go1percent.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RewardsPage extends TestBase {

    @FindBy(css = "a[class='cursor-pointer newTabs']")
    WebElement forIndividualTab;

    @FindBy(css = "a[class='cursor-pointer']")
    WebElement forCompetencyTab;

    public RewardsPage() {
        PageFactory.initElements(driver, this);
    }

    public void validateRewardsPage(){
        forIndividualTab.isEnabled();
        forCompetencyTab.isEnabled();
        forCompetencyTab.isDisplayed();
    }
}
