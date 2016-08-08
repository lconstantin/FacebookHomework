package com.endava.pageObjects.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by lconstantin on 8/8/2016.
 */
public class RegisterPage {

    private WebDriver webDriver;

    public RegisterPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //xpath for email
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    //xpath for password
    @FindBy(xpath = "//input[@id='pass']")
    private WebElement passwordField;

    //xpath login button
    @FindBy(xpath = "//label[@id='loginbutton']")
    private WebElement logInButton;

    //xpath invalid credentials
    @FindBy(xpath = "//div[contains(text(),\"The email you’ve entered doesn’t match any account\")]")
    private WebElement invalidCredentials;


    public HomePage register(){
        emailField.sendKeys("laura.constantin@endava.com");
        passwordField.sendKeys("Test123123");
        logInButton.click();

        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        return  homePage;

    }

    public boolean invalidRegister(){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(invalidCredentials));

        emailField.sendKeys("laura.constantin@endava.com");
        passwordField.sendKeys("Test123");
        logInButton.click();

        if(invalidCredentials.isDisplayed()){
            System.out.println("Credentials are invalid");
        }

        return false;

    }


}
