package com.vtiger.stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TicketSteps extends BaseSteps {
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
    @When("user click on new ticket and add the mandatory information on ticket page and click on save button")
    public void user_click_on_new_ticket_and_add_the_mandatory_information_on_ticket_page_and_click_on_save_button() {
        getTicketPage().ClickNewTicket();
        getTicketPage().createNewTicket(td.get(ScenarioName).get("Assigned To"),td.get(ScenarioName).get("Priority"),td.get(ScenarioName).get("Severity"),td.get(ScenarioName).get("Category"),td.get(ScenarioName).get("Description"),td.get(ScenarioName).get("Title"));
    }
    @Then("Ticket should create successfully")
    public void ticket_should_create_successfully() {

    }



}
