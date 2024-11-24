package com.vtiger.stepdefinations;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EventSteps extends BaseSteps{
    @When("user click on New Event and add the mandatory fields on event page and click on save button")
    public void user_click_on_new_event_and_add_the_mandatory_fields_on_event_page_and_click_on_save_button() {
        getEventPage().ClickNewEvent();
        getEventPage().createNewEvent(td.get(ScenarioName).get("EvSubject"),td.get(ScenarioName).get("Event Status"),td.get(ScenarioName).get("RecurringEvents"),td.get(ScenarioName).get("ActivityType"),td.get(ScenarioName).get("EventDescription"),td.get(ScenarioName).get("EventLocation"));


    }
    @Then("New Event should create successfully")
    public void new_event_should_create_successfully() {


    }
}
