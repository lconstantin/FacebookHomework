package com.endava.pageObjects.pageObjects;

import com.sun.glass.events.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

/**
 * Created by lconstantin on 8/8/2016.
 */
public class PhotoPage {
    WebDriver webDriver;

    public PhotoPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "(//a[@rel='ignore'])[2]")
    private WebElement clickUploadPhoto;

    @FindBy(xpath = "//div[@class='clearfix']/ul/li[2]/button")
    private WebElement clickPost;

    //button[@data-testid='album-uploader-publish-button']

    public void selectPhoto() throws AWTException {
        clickUploadPhoto.click();


        StringSelection ss = new StringSelection("C:\\Users\\lconstantin\\Desktop\\bee.png"); //clickUploadPhoto.sendKeys("C:\\Users\\lconstantin\\Desktop\bee.png");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //imitate mouse events like ENTER, CTRL+C, CTRL+V
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        WebDriverWait wait = new WebDriverWait(webDriver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(clickPost));
        clickPost.click();



    }
}
