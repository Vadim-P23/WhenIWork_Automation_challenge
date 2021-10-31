package com.when_i_work.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public static final String LOGIN = "Log in";
    public static final String LOGIN_WITH_GOOGLE = "Log in with Google";

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Log in with Google']")
    public WebElement loginWithGoogle;

    @FindBy(xpath = "//span[contains(text(),'Incorrect')]")
    public WebElement alertMessage;

    @Override
    public WebElement clickOnAnyButton(String clickable) {
        switch (clickable) {
            case LOGIN:
                return loginButton;
            case LOGIN_WITH_GOOGLE:
                return loginWithGoogle;
            default:
                System.out.println("LoginPage --> wrong input " + clickable);
                throw new NoSuchElementException(clickable);
        }
    }
}
