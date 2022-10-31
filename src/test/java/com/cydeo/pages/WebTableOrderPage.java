package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends BasePage{

    public WebTableOrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "select[name='product']")
    public WebElement productTypeDropdown;

    @FindBy (name = "quantity")
    public WebElement inputQuantity;

    @FindBy (name = "name")
    public WebElement inputName;

    @FindBy (xpath = "//input[@name='street']")
    public WebElement inputStreet;

    @FindBy (xpath = "//input[@name='city']")
    public WebElement inputCity;

    @FindBy (xpath = "//input[@name='state']")
    public WebElement inputState;

    @FindBy (xpath = "//input[@name='zip']")
    public WebElement inputZip;

    @FindBy (name = "card")
    public List<WebElement> cardType;

    @FindBy (name = "cardNo")
    public WebElement inputCardNumber;

    @FindBy (xpath = "//input[@name='cardExp']")
    public WebElement inputCardExp;

    @FindBy (xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;



}
