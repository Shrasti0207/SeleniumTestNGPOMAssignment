package com.go1percent.pages.Knolx;

import com.go1percent.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookASessionPage extends TestBase {

    @FindBy(css = "div.table_header_section h5")
    WebElement bookASessionHeading;

    @FindBy(css = "bs-datepicker-inline-container")
    WebElement calendar;

    public BookASessionPage(){
        PageFactory.initElements(driver, this);
    }

    public void validateBookASessionNavigationPage(){
        bookASessionHeading.isDisplayed();
        calendar.isDisplayed();
    }
}
