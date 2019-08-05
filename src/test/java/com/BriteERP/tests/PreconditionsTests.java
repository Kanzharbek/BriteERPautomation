package com.BriteERP.tests;

import com.BriteERP.pages.CRMPage;
import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class PreconditionsTests extends TestBase {



    @Test(priority = 1)
    public void precondition1() {
        LoginPage loginPage = new LoginPage();
        CRMPage crmPage = new CRMPage();


        String username = ConfigurationReader.getProperty("scrummanagerusername");
        //  SeleniumUtils.waitPlease(2);
        String password = ConfigurationReader.getProperty("scrummanagerpassword");


        loginPage.login(username, password);


         SeleniumUtils.waitPlease(2);
        crmPage.CRMLocator.click();
        crmPage.FirstCreateLocator.click();
        crmPage.OpportunityTitleLocator.sendKeys("Book Brand new");
 SeleniumUtils.waitPlease(2);
        crmPage.CustomerLocator.click();
SeleniumUtils.waitPlease(2);
        crmPage.InsideCustomer1Locator.click();
SeleniumUtils.waitPlease(2);
        crmPage.ExpectedRevenueLocator.clear();
SeleniumUtils.waitPlease(2);
        crmPage.ExpectedRevenueLocator.sendKeys("300.00");
SeleniumUtils.waitPlease(2);

        crmPage.PriorityVeryHighLocator.click();
SeleniumUtils.waitPlease(2);
        crmPage.SecondCreateLocator.click();
        SeleniumUtils.waitPlease(2);
    }

    @Test(priority = 2)
            public void precondition2() {
        LoginPage loginPage = new LoginPage();
        CRMPage crmPage = new CRMPage();


        String username = ConfigurationReader.getProperty("scrummanagerusername");
        //  SeleniumUtils.waitPlease(2);
        String password = ConfigurationReader.getProperty("scrummanagerpassword");

        loginPage.login(username, password);

SeleniumUtils.waitPlease(2);
     crmPage.CRMLocator.click();

SeleniumUtils.waitPlease(2);
        crmPage.FirstCreateLocator.click();

SeleniumUtils.waitPlease(2);

        crmPage.OpportunityTitleLocator.sendKeys("Book Sale");

SeleniumUtils.waitPlease(2);
        crmPage.CustomerLocator.click();
SeleniumUtils.waitPlease(2);
        crmPage.InsideCustomer2Locator.click();
SeleniumUtils.waitPlease(2);
        crmPage.ExpectedRevenueLocator.clear();
SeleniumUtils.waitPlease(2);
        crmPage.ExpectedRevenueLocator.sendKeys("500.00");
SeleniumUtils.waitPlease(2);
        crmPage.PriorityHighLocator.click();
SeleniumUtils.waitPlease(2);
        crmPage.SecondCreateLocator.click();
        SeleniumUtils.waitPlease(2);

    }

   @Test(priority = 3)
 public void precondition3(){
       LoginPage loginPage = new LoginPage();
       CRMPage crmPage = new CRMPage();


       String username = ConfigurationReader.getProperty("scrummanagerusername");
       //  SeleniumUtils.waitPlease(2);
       String password = ConfigurationReader.getProperty("scrummanagerpassword");

       loginPage.login(username, password);


        crmPage.CRMLocator.click();
      SeleniumUtils.waitPlease(2);
        crmPage.FirstCreateLocator.click();
        SeleniumUtils.waitPlease(2);
        crmPage.OpportunityTitleLocator.sendKeys("MacBook Pro 15");
SeleniumUtils.waitPlease(2);
        crmPage.CustomerLocator.click();
SeleniumUtils.waitPlease(2);
        crmPage.InsideCustomer3Locator.click();
SeleniumUtils.waitPlease(2);
        crmPage.ExpectedRevenueLocator.clear();
SeleniumUtils.waitPlease(2);
        crmPage.ExpectedRevenueLocator.sendKeys("3500.00");
SeleniumUtils.waitPlease(2);
        crmPage.PriorityLowLocator.click();
SeleniumUtils.waitPlease(2);
        crmPage.SecondCreateLocator.click();
SeleniumUtils.waitPlease(2);




    }








}
