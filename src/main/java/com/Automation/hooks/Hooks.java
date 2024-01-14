package com.Automation.hooks;

import com.Automation.contexts.TestContext;
import com.Automation.driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import static com.Automation.constants.Constants.BROWSER_CHROME;
import static com.Automation.constants.Constants.PARAMETER_BROWSER;

public class Hooks {
    private WebDriver driver;
    private final TestContext context;

    /**
     * Dependency Injection using Pico container
     */
    public Hooks(TestContext context) {
        this.context = context;
    }
    @Before
    public void before(Scenario scenario) {
        driver = DriverFactory.initializeDriver(System.getProperty(PARAMETER_BROWSER, BROWSER_CHROME));
        context.driver = driver;
    }
    @After
    public void after(Scenario scenario) {
        driver.quit();
    }


}
