package com.Automation.driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.Automation.constants.Constants.BROWSER_CHROME;
public class DriverFactory {
    private static WebDriver driver;
    public static WebDriver initializeDriver(String browser) {
        switch (browser) {
            case BROWSER_CHROME: {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            default:
                throw new IllegalStateException("INVALID BROWSER: " + browser);
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
