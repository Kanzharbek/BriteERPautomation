package com.BriteERP.pages;

import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    @FindBy(id="login")
    @CacheLookup
public WebElement usernameLocator;

    @FindBy(id="password")
    @CacheLookup
    public WebElement passwordLocator;

    @FindBy(css="button[type='submit']")
    @CacheLookup
    public WebElement logInLocator;

    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Long.valueOf(ConfigurationReader.getProperty("explicitwait")));


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

public void login(String username, String password){
        usernameLocator.sendKeys(username);
        passwordLocator.sendKeys(password);
        logInLocator.click();
}


}
