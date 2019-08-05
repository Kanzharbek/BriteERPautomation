package com.BriteERP.pages;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CRMPage {

    public CRMPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[2]")
    @CacheLookup
    public WebElement CRMLocator;

    @FindBy(css= "button[accesskey='c'][type='button']")
    @CacheLookup
    public WebElement FirstCreateLocator;

    @FindBy(css= "input[id^='o_field_input'][name='name'][type='text']")
    @CacheLookup
    public WebElement OpportunityTitleLocator;

    @FindBy(xpath= "//label[text()='Customer']/../following-sibling :: td//input")
    @CacheLookup
    public WebElement CustomerLocator;

    @FindBy(css= "li[id ^=ui-id]:nth-of-type(5)")
    @CacheLookup
    public WebElement InsideCustomer1Locator;

    @FindBy(css= "li[id ^=ui-id]:nth-of-type(6)")
    @CacheLookup
    public WebElement InsideCustomer2Locator;

    @FindBy(css= "li[id ^=ui-id]:nth-of-type(7)")
    @CacheLookup
    public WebElement InsideCustomer3Locator;


    @FindBy(css= "input[name='planned_revenue']")
    @CacheLookup
    public WebElement ExpectedRevenueLocator;

    @FindBy(xpath= "//label[text()='Priority']/../following-sibling :: td//a[@title='Very High']")
    @CacheLookup
    public WebElement PriorityVeryHighLocator;

    @FindBy(xpath= "//label[text()='Priority']/../following-sibling :: td//a[@title='High']")
    @CacheLookup
    public WebElement PriorityHighLocator;

    @FindBy(xpath= "//label[text()='Priority']/../following-sibling :: td//a[@title='Low']")
    @CacheLookup
    public WebElement PriorityLowLocator;

    @FindBy(css= "button[type='object']:nth-of-type(1)")
    @CacheLookup
    public WebElement SecondCreateLocator;

    @FindBy(css= "div button[aria-label='pivot']")
    @CacheLookup
    public WebElement PivotLocator;

    @FindBy(css= "div button[aria-label='list']")
    @CacheLookup
    public WebElement ListLocator;

    @FindBy(xpath= "//td[text()='Total']")
    @CacheLookup
    public WebElement TotalButtonLocator;

    @FindBy(css= "td[class=o_pivot_header_cell_closed']")
    @CacheLookup
    public WebElement NewButtonLocator;

    @FindBy(xpath= "//a[.='Opportunity']")
    @CacheLookup
    public WebElement OpportunityOptionLocator;

    @FindBy(xpath= "//table//tbody//tr[3]//td[2]")
    @CacheLookup
    public WebElement ExpectedRevenuePivotLocator;

    @FindBy(css= "div button[aria-label='list']")
    @CacheLookup
    public WebElement TableLocator;

    @FindBy(xpath= "//tr[td[text()='Book Sale']]//td[9]")
    @CacheLookup
    public WebElement ExpectedRevenueListLocator;

    @FindBy(xpath= "//table//tbody//tr[1]//td[2]")
    @CacheLookup
    public WebElement TotalExpectedRevenueLocator;

    @FindBy(xpath= "//table//tr//td[2]")
    @CacheLookup
    public List<WebElement> ExpectedRevenueLocators;




}
