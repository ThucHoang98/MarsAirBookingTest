package com.Automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.Automation.constants.Constants.EXPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        PageFactory.initElements(driver, this);
    }

    public void load(String url) {
        driver.get(url);
    }

    public void clearAndSendKeys(WebElement element, String value) {
        element = waitForElementVisibility(element);
        element.clear();
        element.sendKeys(value);
    }

    public void click(WebElement element) {
        waitForElementToBeClickable(element).click();
    }

    public WebElement waitForElementVisibility(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
