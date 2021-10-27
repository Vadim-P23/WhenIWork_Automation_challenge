package com.when_i_work.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement dashboard;

    @FindBy(xpath = "//span[.='Scheduler']")
    public WebElement scheduler;

    public static final String DASHBOARD_BUTTON = "Dashboard";
    public static final String SCHEDULER_BUTTON = "Scheduler";

    @Override
    public WebElement clickOnAnyButton(String clickable) {
        switch (clickable) {
            case DASHBOARD_BUTTON:
                return dashboard;
            case SCHEDULER_BUTTON:
                return scheduler;
            default:
                System.out.println("Dashboard page --> wrong input " + clickable);
                throw new NoSuchElementException(clickable);
        }
    }
}
