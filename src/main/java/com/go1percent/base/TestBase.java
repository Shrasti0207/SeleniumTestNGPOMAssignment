package com.go1percent.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static  Properties prop;

    public TestBase(){
        try{
            prop = new Properties();

            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/go1percent/config/config.properties");
            prop.load(ip);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static  void initialization(){
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")){
            System.getProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        driver.get(prop.getProperty("url"));
    }
}
