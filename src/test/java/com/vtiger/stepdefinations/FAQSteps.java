package com.vtiger.stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class FAQSteps extends BaseSteps{
    @Before
    public void getScenario(Scenario scenario){
        if (extent==null) {
            createExtendReport();}
        ScenarioName = scenario.getName();
        logger= extent.createTest(ScenarioName);}
    @After
    public void savereport(){
        extent.flush();
        //driver.quit();
    }
    @When("user click on new FAQ and add the mandatory fields on FAQ page and click on save button")
    public void user_click_on_new_faq_and_add_the_mandatory_fields_on_faq_page_and_click_on_save_button() {
         getFAQPage().ClickNewFAQ();
         getFAQPage().createNewFAQ(td.get(ScenarioName).get("Product name"),td.get(ScenarioName).get("Status"),td.get(ScenarioName).get("Question"),td.get(ScenarioName).get("Answer"));

    }
    @Then("FAQ should create successfully")
    public void faq_should_create_successfully() {


    }



}
