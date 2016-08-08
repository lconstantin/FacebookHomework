package com.endava.pageObjects;


import com.endava.pageObjects.pageObjects.HomePage;
import com.endava.pageObjects.pageObjects.ProfilePage;
import com.endava.pageObjects.pageObjects.RegisterPage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lconstantin on 8/8/2016.
 */
public class FacebookTest extends TestBaseClass{

    @Test
    public void validate(){

    HomePage homePage =registerPage.register();
      ProfilePage profilePage =  homePage.timeline();
       // homePage.timeline();
        profilePage.clickPostWall();
   // homePage.editPost();
      profilePage.editPost();

        profilePage.shareButton();



    }

    @Test
    public void invalid(){
        //Boolean isTrue = registerPage.invalidRegister();
        Assert.assertTrue(registerPage.invalidRegister());
    }

}
