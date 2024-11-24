package com.vtiger.stepdefinations;
import com.codoid.products.exception.FilloException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
public class loginSteps extends BaseSteps {
    @Before
    public void getScenario(Scenario scenario){
       if (extent==null) {
           createExtendReport();}
        ScenarioName = scenario.getName();
        logger= extent.createTest(ScenarioName);}
   @After
   public void savereport(){
        extent.flush();
        driver.quit();}

    @Given("user should be on login page")
    public void user_should_be_on_login_page() throws Exception {
    launchApp();}

    @When("user enter the valid credentials and click on login button")
    public void user_enter_the_valid_credentials_and_click_on_login_button() {
       getLoginPage().login(td.get(ScenarioName).get("Userid"),td.get(ScenarioName).get("Password"));}

    @When("user enter the valid credentials along with theme and click on login button")
    public void user_enter_the_valid_credentials_and_theme_click_on_login_button() {
        getLoginPage().login(td.get(ScenarioName).get("Userid"),td.get(ScenarioName).get("Password"),td.get(ScenarioName).get("Theme"));}

    @Then("user should be navigated to home page")
    public void user_should_be_navigated_to_home_page() {
       getLeadPage().verifyHome();
    }
    @Then("user can see the logout link on right corner")
    public void user_can_see_the_logout_link_on_right_corner() {
        getLeadPage().verifyLogout();
    }

    @When("user enter the Invalid credentials and click on login button")
    public void user_enter_the_invalid_credentials_and_click_on_login_button() {
      getLoginPage().login("admin","admin");
    }

    @Then("user can see the error message on login page")
    public void user_can_see_the_error_message_on_login_page() {
        getLoginPage().verifyErrorMessage();
    }
    @When("user enter the Invalid credentials username as {string} and password as {string} click on login button")
    public void user_enter_the_invalid_credentials_username_as_and_password_as_click_on_login_button(String uid, String pwd) {
      getLoginPage().login("uid","pwd");
    }



}
