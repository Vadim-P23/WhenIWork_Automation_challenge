package com.when_i_work.step_definitions;

import com.when_i_work.pages.BasePage;
import static com.when_i_work.utilities.ConfigurationReader.*;

import com.when_i_work.pages.LoginPage;
import com.when_i_work.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login_StepDef {

    WebDriver driver = Driver.getDriver();
    BasePage page;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get(getProperty("url"));
    }
    @When("User enters username {string} and password {string} on the {string} page")
    public void userEntersValidAndOnThePage(String email, String password, String pageName) {
            page = BasePage.returnPage(pageName);
        ((LoginPage) page).inputEmail.sendKeys(email);
        ((LoginPage) page).inputPassword.sendKeys(password);
    }

    @And("User clicks on the {string} button on the {string} page")
    public void userClicksOnTheButtonOnThePage(String button, String pageName) {
        page = BasePage.returnPage(pageName);
        page.wait.until(ExpectedConditions.elementToBeClickable(page.clickOnAnyButton(button)));
        page.clickOnAnyButton(button).click();
    }

    @Then("page title on the {string} page should be {string}")
    public void pageTitleOnThePageShouldBe(String pageName, String expectedTitle) {
        page = BasePage.returnPage(pageName);
        page.wait.until(ExpectedConditions.titleIs(expectedTitle));
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title mismatch", expectedTitle, actualTitle);
    }

    @Then("message should appeared on the {string} page")
    public void warningMessageShouldAppearedOnThePage(String pageName) {
        page = BasePage.returnPage(pageName);
        page.wait.until(ExpectedConditions.visibilityOf(((LoginPage) page).alertMessage));
        Assert.assertTrue("Message did not appeared", ((LoginPage) page).alertMessage.isDisplayed());
    }


}
