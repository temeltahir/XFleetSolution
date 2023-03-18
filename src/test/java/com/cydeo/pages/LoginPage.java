package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(),this);
    }

    @FindBy(name = "_username")
    public WebElement usernameField;
    @FindBy(name = "_password")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordFieldType;

    @FindBy(id = "_submit")
    public WebElement logInButton;
    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotPasswordLink;
    @FindBy(id = "remember_me")
    public WebElement rememberMeBox;

    @FindBy(className = "custom-checkbox__text")
    public WebElement getRememberMeText;

    @FindBy(xpath = "//span[@class='custom-checkbox__text']")
    public WebElement rememberMeText;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement invalidLoginWarning;



}
