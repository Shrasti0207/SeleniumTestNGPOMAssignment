package com.go1percent.testcases;

import com.go1percent.base.TestBase;
import com.go1percent.pages.*;
import com.go1percent.pages.Approvals.ContributionPage;
import com.go1percent.pages.Approvals.TechhubPage;
import com.go1percent.pages.HelpDesk.TicketsAssignedToMePage;
import com.go1percent.pages.HelpDesk.TicketsRaisedByMePage;
import com.go1percent.pages.Knolx.BookASessionPage;
import com.go1percent.pages.Knolx.MySessionsPage;
import com.go1percent.pages.Knolx.ReportsPage;
import com.go1percent.pages.Knolx.SessionsPage;
import com.go1percent.pages.Leaderboard.RewardsPage;
import com.go1percent.pages.Leaderboard.SummaryPage;
import com.go1percent.pages.Leaderboard.WallOfFamePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class DashboardNavigation extends TestBase {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    RadarPage radarPage;
    SummaryPage summaryPage;
    WallOfFamePage wallOfFamePage;
    RewardsPage rewardsPage;
    ContributionPage contributionPage;
    TechhubPage techhubPage;
    ReportsPage reportsPage;
    SessionsPage sessionsPage;
    BookASessionPage bookASessionPage;
    MySessionsPage mySessionsPage;
    TicketsRaisedByMePage ticketsRaisedByMePage;
    TicketsAssignedToMePage ticketsAssignedToMePage;
    HelpPage helpPage;
    public DashboardNavigation(){
        super();
    }

    @BeforeTest
    public void setup(){
        initialization();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        radarPage = new RadarPage();
        summaryPage = new SummaryPage();
        wallOfFamePage = new WallOfFamePage();
        rewardsPage = new RewardsPage();
        contributionPage = new ContributionPage();
        techhubPage = new TechhubPage();
        reportsPage = new ReportsPage();
        sessionsPage = new SessionsPage();
        bookASessionPage = new BookASessionPage();
        mySessionsPage = new MySessionsPage();
        ticketsRaisedByMePage = new TicketsRaisedByMePage();
        ticketsAssignedToMePage = new TicketsAssignedToMePage();
        helpPage = new HelpPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test
    public void testRadarNavigationLink(){
        dashboardPage.navigateRadarLink();
        radarPage.validateRadarPageNavigation();
    }

    @Test
    public void testLeaderboardNavigationLinks(){
        dashboardPage.navigateSummaryPageLink();
        summaryPage.validateSummaryPageNavigation();
        dashboardPage.wallOfFrameLink.click();
        wallOfFamePage.validateWallOfFamePage();
        dashboardPage.rewardsLink.click();
        rewardsPage.validateRewardsPage();
    }

    @Test
    public void testApprovalsNavigationLinks(){
        dashboardPage.navigateApprovalsContributionLink();
        contributionPage.validateContributionsPage();
        dashboardPage.techhubTabLink.click();
        techhubPage.validateTechhubsNavigation();
    }

    @Test
    public void testKnolxNavigationLinks(){
        dashboardPage.navigateKnolxReportsLink();
        reportsPage.validateReportsPageNavigation();
        dashboardPage.sessionsTabLink.click();
        sessionsPage.validateSessionsNavigationPage();
        dashboardPage.bookASessionTabLink.click();
        bookASessionPage.validateBookASessionNavigationPage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dashboardPage.mySessionsTabLink);
        dashboardPage.mySessionsTabLink.click();
        mySessionsPage.validateMySessionsNavigationPage();
    }

    @Test
    public void testHelpDeskNavigationLinks(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dashboardPage.helpDeskTab);
        dashboardPage.navigateHelpdeskTicketsRaisedByMeLink();
        ticketsRaisedByMePage.validateTicketsRaisedByMeNavigation();
        dashboardPage.ticketsAssignedToMeTabLink.click();
        ticketsAssignedToMePage.validateTicketsAssignedToMeNavigations();
    }

    @Test
    public void testHelpNavigationLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dashboardPage.helpTabLink);
        dashboardPage.helpTabLink.click();
        helpPage.validateHelpNavigationPage();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
