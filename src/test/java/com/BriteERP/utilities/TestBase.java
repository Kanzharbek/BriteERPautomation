package com.BriteERP.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

    public class TestBase {

        //should be public/protected

        public  WebDriver driver;

        public   Actions action;



        @BeforeMethod

        public void setup(){

            driver = Driver.getDriver();

            action = new Actions(driver);

            driver.manage().timeouts().implicitlyWait(Long.valueOf(ConfigurationReader.getProperty("implicitwait")), TimeUnit.SECONDS);

            driver.manage().window().maximize();

            driver.get(ConfigurationReader.getProperty("url"));

        }



        @AfterMethod

        public void teardown(){

            Driver.closeDriver();

        }





    }
