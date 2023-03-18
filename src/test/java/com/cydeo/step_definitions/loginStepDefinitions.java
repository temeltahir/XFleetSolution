package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class loginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    //Background
    @Given("user is on the xfleet login page")
    public void user_is_on_the_xfleet_login_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.logInButton.click();
    }

    @When("user should see the password in bullet signs by default")
    public void user_should_see_the_password_in_bullet_signs_by_default() {
        // When the input type is password it's shown as bullet signs

        Assert.assertEquals(loginPage.passwordField.getAttribute("type"), "password");
    }

    @When("user enters sales manager username")
    public void user_enters_sales_manager_username() {
        loginPage.usernameField.sendKeys("salesmanager101");
    }

    @When("user enters sales manager password")
    public void user_enters_sales_manager_password() {

        loginPage.passwordField.sendKeys("UserUser123");
    }


    @Then("user should see the Dashboard")
    public void user_should_see_the_dashboard() {

        Assert.assertEquals(Driver.getDriver().getTitle(), "Dashboard");

    }

    @When("user enters store manager username")
    public void user_enters_store_manager_username() {
        loginPage.usernameField.sendKeys("storemanager51");
    }

    @When("user enters store manager password")
    public void user_enters_store_manager_password() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.passwordField.sendKeys("UserUser123");
    }


    @When("user enters truck driver username")
    public void user_enters_truck_driver_username() {
        loginPage.usernameField.sendKeys("user1");
    }

    @When("user enters truck driver password")
    public void user_enters_truck_driver_password() {
        loginPage.passwordField.sendKeys("UserUser123");
    }


    @Then("user should see the Quick Launchpad")
    public void user_should_see_the_quick_launchpad() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//h1[@class='oro-subtitle']")).getText(), "Quick Launchpad");
    }



    @Then("she or he lands on {string} page")
    public void she_or_he_lands_on_page(String string) {
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }


    @When("user enters wrongUsername {string} and wrongPassword {string}")
    public void user_enters_wrongUsername(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.usernameField.sendKeys(username);
        loginPage.passwordField.sendKeys(password);
    }

    @Then("invalid username or password error message should be displayed for invalid credentials")
    public void invalid_username_or_password_error_message_should_be_displayed_for_invalid_credentials(){

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[.='Invalid user name or password.']")).isDisplayed());

    }

    @When("user clicks on the forgot your password link")
    public void user_clicks_on_the_forgot_your_password_link() {
        loginPage.forgotPasswordLink.click();
    }
    @Then("user lands on the forgot password page")
    public void user_lands_on_the_forgot_password_page() {

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h2[.='Forgot Password']")).isDisplayed());
    }

    @When("user can see Remember me on this computer link")
    public void user_can_see_remember_me_on_this_computer_link() {
            Assert.assertTrue(loginPage.rememberMeText.isDisplayed());
    }
    @Then("remember me link should be clickable")
    public void remember_me_link_should_be_clickable() {
        Assert.assertTrue(loginPage.rememberMeBox.isEnabled());
    }


    @When ("user enters truck {string} and {string} and presses the enter key")
    public void user_enters_truck_and_and_presses_the_enter_key(String username, String password){
        loginPage.usernameField.sendKeys("user1");
        loginPage.passwordField.sendKeys("UserUser123"+Keys.ENTER);

    }
    @Then("user should login")
    public void user_should_login() {
       Assert.assertTrue(Driver.getDriver().findElement(By.id("user-menu")).isDisplayed());
    }





}
