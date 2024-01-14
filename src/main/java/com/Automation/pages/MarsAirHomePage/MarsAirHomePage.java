package com.Automation.pages.MarsAirHomePage;
import com.Automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MarsAirHomePage extends BasePage {
    @FindBy(how= How.ID, using="departing")
    private WebElement departing;

    @FindBy(how= How.ID, using="returning")
    private WebElement returning;

    @FindBy(how= How.ID, using="promotional_code")
    private WebElement promotion_code;

    @FindBy(how= How.XPATH, using="//input[@value='Search']")
    private WebElement submit;

    @FindBy(how= How.XPATH, using="//*[contains(@class, 'promo_code')]")
    private WebElement promo_code;

    @FindBy(how= How.ID, using="content")
    private WebElement result_content;
    public MarsAirHomePage(WebDriver driver) {
        super(driver);
    }

    public void selectDeparting(String dvalue) {
        waitForElementToBeClickable(departing).click();
        Select dropdown= new Select(departing);
        dropdown.selectByVisibleText(dvalue);
    }

    public void selectReturning(String rvalue) {
        waitForElementToBeClickable(returning).click();
        Select dropdown= new Select(returning);
        dropdown.selectByVisibleText(rvalue);
    }

    public void addPromotion(String value) {
        clearAndSendKeys(promotion_code,value);
    }

    public void clickSearch() {
        click(submit);
    }

    public String getPromotionContent() {
        return promo_code.getText();
    }

    public String getContentResults() {
        return result_content.getText();
    }
}
