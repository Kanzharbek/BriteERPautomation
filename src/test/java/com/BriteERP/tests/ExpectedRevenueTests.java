package com.BriteERP.tests;

import com.BriteERP.pages.CRMPage;
import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.SeleniumUtils;
import com.BriteERP.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

public class ExpectedRevenueTests extends TestBase {



@Test(priority = 1)
public void verifyExpectedRevenue(){
    LoginPage loginPage = new LoginPage();
    CRMPage crmPage = new CRMPage();

    String username = ConfigurationReader.getProperty("scrummanagerusername");
    //  SeleniumUtils.waitPlease(2);
    String password = ConfigurationReader.getProperty("scrummanagerpassword");
    loginPage.login(username,password);
    SeleniumUtils.waitPlease(3);
    crmPage.CRMLocator.click();
    SeleniumUtils.waitPlease(3);
    crmPage.PivotLocator.click();
    SeleniumUtils.waitPlease(3);

    Actions action=new Actions(driver);
    SeleniumUtils.waitPlease(3);
action.doubleClick(crmPage.TotalButtonLocator).perform();
    SeleniumUtils.waitPlease(3);
crmPage.OpportunityOptionLocator.click();
    SeleniumUtils.waitPlease(3);

String RevenueOnPivot=crmPage.ExpectedRevenuePivotLocator.getText();
    SeleniumUtils.waitPlease(3);
crmPage.ListLocator.click();
    SeleniumUtils.waitPlease(3);
String RevenueOnList=crmPage.ExpectedRevenueListLocator.getText();
    SeleniumUtils.waitPlease(3);

Assert.assertEquals(RevenueOnPivot, RevenueOnList, "Expected revenues did not match");
    System.out.println(RevenueOnList);
    System.out.println(RevenueOnList);
}


    @Test(priority = 2)
    public void verifyTotalExpectedRevenue() {
        LoginPage loginPage = new LoginPage();
        CRMPage crmPage = new CRMPage();

        String username = ConfigurationReader.getProperty("scrummanagerusername");
        //  SeleniumUtils.waitPlease(2);
        String password = ConfigurationReader.getProperty("scrummanagerpassword");
        loginPage.login(username, password);
        SeleniumUtils.waitPlease(3);
        crmPage.CRMLocator.click();
        SeleniumUtils.waitPlease(3);
        crmPage.PivotLocator.click();
        SeleniumUtils.waitPlease(3);

        Actions action = new Actions(driver);
        SeleniumUtils.waitPlease(3);
        action.doubleClick(crmPage.TotalButtonLocator).perform();
        SeleniumUtils.waitPlease(3);
        crmPage.OpportunityOptionLocator.click();
        SeleniumUtils.waitPlease(3);

        List<WebElement> ListOfRevenues=crmPage.ExpectedRevenueLocators;
        SeleniumUtils.waitPlease(3);

        double sum=0;
        double total=0;

        for(WebElement each : ListOfRevenues){

            String price=each.getText().replaceAll(",","");
            if(each.equals(ListOfRevenues.get(0))){
                total=Double.parseDouble(price);
                continue;
            }
double Price=Double.parseDouble(price);

            sum +=Price;
        }

        System.out.println(sum);
        System.out.println(total);
Assert.assertEquals(total,sum,"Total and sum didn't match");












    }

}
