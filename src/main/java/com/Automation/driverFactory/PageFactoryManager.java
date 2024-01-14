package com.Automation.driverFactory;

import com.Automation.pages.MarsAirHomePage.MarsAirHomePage;
import org.openqa.selenium.WebDriver;

public class PageFactoryManager {

    private static MarsAirHomePage marsAirHomePage;

    public static MarsAirHomePage getMarsAirHomePage(WebDriver driver) {
        return marsAirHomePage == null ? new MarsAirHomePage(driver) : marsAirHomePage;
    }

}
