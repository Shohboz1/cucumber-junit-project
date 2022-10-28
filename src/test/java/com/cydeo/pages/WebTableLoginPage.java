package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@name='username']")
    public WebElement inputUsername;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    /**
     * This method will accept username and password and login to app
     * @param username
     * @param password
     */

    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();


    }

}
