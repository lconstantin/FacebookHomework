package com.endava.pageObjects.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by lconstantin on 8/8/2016.
 */
public class HomePage {

    WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }



    //click option arrow
    @FindBy(xpath = "(//a[@aria-label=\"Story options\"])[1]")
    private WebElement clickOptionArrow;

    //click edit post
    @FindBy(xpath = "//ul[@role='menu']/li[@data-feed-option-name='FeedEditOption']")
    private WebElement editOption;

    @FindBy(xpath = "//a[@title='Profile']")
    private WebElement clickProfile;



//    public void editPost(){
//        WebDriverWait wait = new WebDriverWait(webDriver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(clickOptionArrow));
//        clickOptionArrow.click();
//        WebDriverWait wait1 = new WebDriverWait(webDriver, 10);
//        wait1.until(ExpectedConditions.elementToBeClickable(editOption));
//        editOption.click();
//    }

    public ProfilePage timeline(){
        clickProfile.click();

        ProfilePage profilePage = PageFactory.initElements(webDriver, ProfilePage.class);
        return  profilePage;
    }
}
