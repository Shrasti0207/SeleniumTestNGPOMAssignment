package com.go1percent.pages.Approvals;

import com.go1percent.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContributionPage extends TestBase {

    @FindBy(css = "div.align-items-center > span")
    WebElement contributionHeading;

    @FindBy(css = "a[class='cursor-pointer']")
    WebElement allContributionsLink;

    public ContributionPage(){
        PageFactory.initElements(driver, this);
    }

    public void validateContributionsPage(){
        contributionHeading.isDisplayed();
        allContributionsLink.isEnabled();
    }
}
