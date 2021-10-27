package com.when_i_work.pages;

import com.when_i_work.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public static final String DASHBOARD = "Dashboard";
    public static final String LOGIN_PAGE = "Log In";
    public static final String SCHEDULER = "Scheduler";


    public static BasePage returnPage(String page) {
        switch (page) {
            case DASHBOARD:
                return new DashboardPage();
            case LOGIN_PAGE:
                return new LoginPage();
            case SCHEDULER:
                return new SchedulerPage();
            default:
                System.out.println("BasePage --> return() --> wrong input " + page);
                throw new NoSuchElementException(page);
        }
    }

    public abstract WebElement clickOnAnyButton(String clickable);

    public WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    public JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

}
