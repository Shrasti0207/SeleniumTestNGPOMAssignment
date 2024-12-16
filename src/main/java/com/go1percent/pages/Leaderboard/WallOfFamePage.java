package com.go1percent.pages.Leaderboard;

import com.go1percent.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WallOfFamePage extends TestBase {
    @FindBy(css = "div.col-xl-5  div")
    WebElement wallOfFameHeading;

    public WallOfFamePage(){
        PageFactory.initElements(driver, this );
    }

    public void validateWallOfFamePage(){
        wallOfFameHeading.isDisplayed();
    }
}
