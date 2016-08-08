package com.endava.pageObjects.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by lconstantin on 8/8/2016.
 */
public class ProfilePage {
    //span[@data-text='true']
    WebDriver webDriver;

    public ProfilePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "(//div[@data-testid='react-composer-root']//div[@class='clearfix'])[2]")
    private WebElement clickPostWall;

    @FindBy(xpath = "//textarea[contains(@placeholder,'on your mind')]")
    private WebElement writePost;

    //textarea[contains(@title,'What's on your mind?')]
    @FindBy(xpath = "//button[@data-testid='react-composer-post-button']")
    private WebElement postOnWall;

   @FindBy (xpath = "(//a[contains(@class,'share_action')])[1]")
    private WebElement shareButton;

    public void clickPostWall(){
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     //   clickPostWall.click();
        // WebDriverWait wait = new WebDriverWait(webDriver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(writePost));
        writePost.click();
        writePost.sendKeys("hello");

        postOnWall.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //click option arrow
    @FindBy(xpath = "(//div[@class=\"_4r_y\"])[1]/div")
    private WebElement clickOptionArrow;

    //click edit post
    @FindBy(xpath = "//li[@data-feed-option-name='FeedEditOption']/a")
    private WebElement editOption;

    @FindBy(xpath = "//a[@title='Profile']")
    private WebElement clickProfile;

    @FindBy(xpath = "//p[contains(text(),\"hello\")]")
    private WebElement messagePost;

    @FindBy(xpath = "//div[@class=\"_1mf _1mj\"]/span/span")
    private WebElement editPost;

    @FindBy(xpath = "//button[@data-testid=\"react-composer-post-button\"]")
    private WebElement saveEditPost;

    public void editPost(){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(messagePost));
        clickOptionArrow.click();

        editOption.click();
        editPost.clear();
        //editPost.sendKeys(Keys.BACK_SPACE);
        editPost.sendKeys(" word");
        saveEditPost.click();
    }

    //xpath click share button
    @FindBy(xpath = "(//a[contains(@class,\"share_action\")])[1]")
    private WebElement clickShare;
  //  (//a[contains(@title,'Send this')])[2]

    @FindBy(xpath = "(//ul[@class='_54nf'])[3]/li[1]/a")
    //
    private WebElement shareWithFriends;

    public void shareButton(){


      //  WebElement we = webDriver.findElement(By.xpath("(//a[contains(@class,'share_action')])[1]"));
        Actions action = new Actions(webDriver);
        action.moveToElement(shareButton).build().perform();

        shareButton.click();

        Actions actions = new Actions(webDriver);
        actions.moveToElement(shareWithFriends).build().perform();

      shareWithFriends.click();
    }



}
