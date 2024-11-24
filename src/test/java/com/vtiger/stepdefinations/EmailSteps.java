package com.vtiger.stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmailSteps extends BaseSteps {
    @Before
    public void getScenario(Scenario scenario){
        if (extent==null) {
            createExtendReport();}
        ScenarioName = scenario.getName();
        logger= extent.createTest(ScenarioName);}
    @After
    public void savereport(){
        extent.flush();
       // driver.quit();
    }

    @When("user click on New E-mail and add the mandatory fields")
    public void user_click_on_new_e_mail_and_add_the_mandatory_fields() {
        getEmailPage().ClickNewEmail();
        getEmailPage().createNewEmail(td.get(ScenarioName).get("Ccname"),td.get(ScenarioName).get("Subject"),td.get(ScenarioName).get("EmailDescription"));
    }
    @Then("user choosen file and description on Email page and click on save button")
    public void user_choosen_file_and_description_on_email_page_and_click_on_save_button() {

    }
    @Then("E-mail should create successfully")
    public void e_mail_should_create_successfully() {

    }

}
