package com.when_i_work.step_definitions;

import com.when_i_work.pages.BasePage;
import com.when_i_work.pages.SchedulerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddEmployee_StepDef {

    BasePage page;

    @And("User enters firstname {string}, lastname {string}, email {string}, mobile number {string}, role {string} on the {string} page")
    public void userEntersFirstnameLastnameEmailMobileNumberRoleOnThePage(String firstName, String lastName, String email, String mobileNumber, String role, String pageName) {
        page = BasePage.returnPage(pageName);
        page.wait.until(ExpectedConditions.visibilityOf(((SchedulerPage) page).firstName));
        ((SchedulerPage) page).firstName.sendKeys(firstName);
        ((SchedulerPage) page).lastName.sendKeys(lastName);
        ((SchedulerPage) page).email.sendKeys(email);
        ((SchedulerPage) page).phoneNumber.sendKeys(mobileNumber);
        ((SchedulerPage) page).role.click();
        page.js.executeScript("arguments[0].innerHTML='" + role + "'", ((SchedulerPage) page).role);
    }

    @Then("successful message should appear")
    public void successfulMessageShouldAppear() {
        page.wait.until(ExpectedConditions.visibilityOf(((SchedulerPage)page).alertMessage));
        Assert.assertTrue(((SchedulerPage)page).alertMessage.isDisplayed());
    }
}
