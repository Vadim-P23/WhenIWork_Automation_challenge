package com.when_i_work.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchedulerPage extends BasePage {

    @FindBy(xpath = "//span[.='Add Employees']")
    public WebElement addEmployees;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "phone_number")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//div[@class='Select__value-container Select__value-container--has-value css-1hwfws3'])[5]")
    public WebElement role;

    @FindBy(xpath = "//button[@type='submit']/div")
    public WebElement addEmployee;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertMessage;

    public static final String ADD_EMPLOYEE_BUTTON = "ADD EMPLOYEE";
    public static final String ADD_EMPLOYEES_BUTTON = "Add employees";

    @Override
    public WebElement clickOnAnyButton(String clickable) {
        switch (clickable) {
            case ADD_EMPLOYEE_BUTTON:
                return addEmployee;
            case ADD_EMPLOYEES_BUTTON:
                return addEmployees;
            default:
                System.out.println("SchedulerPage --> wrong input " + clickable);
                throw new NoSuchElementException(clickable);
        }
    }
}
