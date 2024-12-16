package com.go1percent.pages;

import com.go1percent.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage extends TestBase {

    @FindBy(css = "div.sidenav-header > a")
    WebElement go1PercentLogo;

    @FindBy(css = "a[href*='radar']")
    WebElement radarNavigationLink;


    @FindBy(css = "#sidenav-collapse-main > ul > li:nth-child(3) > div.collapsed")
    WebElement leaderboardTab;

    @FindBy(css = "a[href='/dashboard']")
    WebElement leaderboardSummaryLink;

    @FindBy(css = "a[href='/hall-of-fame']")
    public WebElement wallOfFrameLink;

    @FindBy(css = "a[href*='/rewards']")
    public WebElement rewardsLink;

    @FindBy(css = "li:nth-child(4) div.collapsed")
    WebElement approvalsTab;

    @FindBy(css = "a[href*='contribution']")
    WebElement contributionTabLink;

    @FindBy(css = "a[href*='tech-hub']")
    public WebElement techhubTabLink;

    @FindBy(css = "li:nth-child(5)  div.collapsed")
    WebElement knolxTab;

    @FindBy(css = "a[href*='reports']")
    WebElement reportsTabLink;

    @FindBy(css = "a[href='/knolx/upcoming-sessions']")
    public WebElement sessionsTabLink;

    @FindBy(css = "a[href*='book-a-session']")
    public WebElement bookASessionTabLink;

    @FindBy(css = "li:nth-child(4) a[href*='upcoming-sessions']")
    public WebElement mySessionsTabLink;

    @FindBy(css = "li:nth-child(6) > div.collapsed")
    public WebElement helpDeskTab;

    @FindBy(css = "a[href*='my-tickets']")
    WebElement ticketsRaisedByMeTabLink;

    @FindBy(css = "a[href*='assigned-tickets']")
    public WebElement ticketsAssignedToMeTabLink;

    @FindBy(css = "a[href='/help']")
    public WebElement helpTabLink;

    @FindBy(css = "input[id='Search']")
    public WebElement searchInput;

    @FindBy(css = ".search-names .mt-3 .boxClass")
    WebElement searchResult;

    @FindBy(css = ".mt-5 .d-flex h3")
    public WebElement nasherName;

    @FindBy(css = ".d-flex h3 span.overall-txt-color")
    public WebElement redeemedRewardsText;

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }
    public String validateTitle(){
        go1PercentLogo.isDisplayed();
        return driver.getTitle();
    }

    public void navigateRadarLink(){
        radarNavigationLink.isEnabled();
        radarNavigationLink.click();
    }

    public void navigateSummaryPageLink(){
        leaderboardTab.click();
        leaderboardSummaryLink.click();
    }

    public void navigateApprovalsContributionLink(){
        approvalsTab.click();
        contributionTabLink.click();
    }

    public void navigateKnolxReportsLink(){
        knolxTab.click();
        reportsTabLink.click();
    }

    public void navigateHelpdeskTicketsRaisedByMeLink(){
        helpDeskTab.click();
        ticketsRaisedByMeTabLink.click();
    }

    public void searchNasher(){
        searchInput.isDisplayed();
        searchInput.sendKeys("Shrasti Gupta");
        searchResult.isEnabled();
        searchResult.click();
    }
}
