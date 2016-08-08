package com.endava.pageObjects;

import com.endava.pageObjects.pageObjects.RegisterPage;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by lconstantin on 8/8/2016.
 */

    public class TestBaseClass {
        private  static WebDriver webDriver;
        protected RegisterPage registerPage;


        @BeforeClass
        public static void setUp(){
            webDriver = new FirefoxDriver();
            webDriver.manage().window().maximize();
            webDriver.get("https://www.facebook.com/");


        }

        @Before
        public void initPageObj() {
            registerPage = PageFactory.initElements(webDriver, RegisterPage.class);
        }

      //  @AfterClass
      //  public static void tearDown() {
//
      //      webDriver.close();
       // }
    }


