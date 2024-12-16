package com.go1percent.pages;

import com.go1percent.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadarPage extends TestBase {

    @FindBy(css = "input[placeholder='Search by Name']")
    WebElement searchByNameInput;

    public RadarPage() {
        PageFactory.initElements(driver, this);
    }

    public void validateRadarPageNavigation(){
        searchByNameInput.isDisplayed();
    }
}
