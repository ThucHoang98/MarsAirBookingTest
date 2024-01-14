package com.Automation.stepDefinations;

import com.Automation.contexts.TestContext;
import com.Automation.driverFactory.PageFactoryManager;
import com.Automation.pages.MarsAirHomePage.MarsAirHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MarsAirHomePageStepDefs {
    private final MarsAirHomePage marsAirHomePage;
    private final TestContext context;

    public MarsAirHomePageStepDefs(TestContext context) {
        this.context = context;
        marsAirHomePage = PageFactoryManager.getMarsAirHomePage(context.driver);
    }

    @Given("I'm on Mars Air Homepage")
    public void iMOnMarsAirHomepage() {
        marsAirHomePage.load("https://marsair.recruiting.thoughtworks.net/ThucHoang");
    }

    @When("I add promotion code as {string}")
    public void iAddPromotionCodeAs(String pro_code) {
        marsAirHomePage.addPromotion(pro_code);
    }

    @Then("I got the result")
    public void iGotTheResult() {
        marsAirHomePage.clickSearch();
    }


    @And("I verify the content is {string}")
    public void iVerifyTheContentIs(String arg0) {
        Assert.assertEquals(marsAirHomePage.getPromotionContent(), arg0);
    }

    @When("I select departure date as {string}")
    public void iSelectDepartureDateAs(String arg0) {
        marsAirHomePage.selectDeparting(arg0);
    }

    @And("I select return date as {string}")
    public void iSelectReturnDateAs(String arg0) {
        marsAirHomePage.selectReturning(arg0);
    }

    @And("I verify the seat is {string}")
    public void iVerifyTheSeatIs(String arg0) {
        Assert.assertTrue(marsAirHomePage.getContentResults().contains(arg0));
    }

}
