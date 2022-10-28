package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigretionReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDefs {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigretionReader.getProperty("env"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTableLoginPage.inputUsername.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);
    }
    @When("user clicks to login btn")
    public void user_clicks_to_login_btn() {
        webTableLoginPage.loginBtn.click();
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
//        webTableLoginPage.inputUsername.sendKeys(username);
//        webTableLoginPage.inputPassword.sendKeys(password);
//        webTableLoginPage.loginBtn.click();

        webTableLoginPage.login(username, password);
    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {
//        webTableLoginPage.inputUsername.sendKeys(credentials.get("username"));
//        webTableLoginPage.inputPassword.sendKeys(credentials.get("password"));
//        webTableLoginPage.loginBtn.click();

        webTableLoginPage.login(credentials.get("username"), credentials.get("password"));


    }
}
