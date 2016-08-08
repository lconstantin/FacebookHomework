package com.endava.pageObjects;


import com.endava.pageObjects.pageObjects.HomePage;
import com.endava.pageObjects.pageObjects.PhotoPage;
import com.endava.pageObjects.pageObjects.ProfilePage;
import com.endava.pageObjects.pageObjects.RegisterPage;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

/**
 * Created by lconstantin on 8/8/2016.
 */
public class FacebookTest extends TestBaseClass{

    @Test
    public void validate() throws AWTException {

    HomePage homePage =registerPage.register();
      ProfilePage profilePage =  homePage.timeline();
        homePage.timeline();
    profilePage.clickPostWall();

    profilePage.editPost();

      profilePage.shareButton();

      PhotoPage photoPage =  profilePage.uploadPhoto();
       photoPage.selectPhoto();



    }

    @Test
    public void invalidCredemtials(){
        //Boolean isTrue = registerPage.invalidRegister();
        Assert.assertTrue(registerPage.invalidRegister("laura.costica@endava.com","Test123123"));
    }

    @Test
    public void validCredentials(){
        //Boolean isTrue = registerPage.invalidRegister();
        Assert.assertFalse(registerPage.invalidRegister("laura.constantin@endava.com","Test123123"));
    }

}
