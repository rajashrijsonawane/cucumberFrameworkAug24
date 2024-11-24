package com.vtiger.stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NoteSteps extends BaseSteps{
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

    @When("user click on new note and enter mandatory fields on new note page and click on save button")
    public void user_click_on_new_note_and_enter_mandatory_fields_on_new_note_page_and_click_on_save_button() {
        getNotePage().ClickNewNote();
        getNotePage().createNewNote(td.get(ScenarioName).get("Subject"),td.get(ScenarioName).get("Note"));
    }

    @Then("Note should save successfully")
    public void note_should_save_successfully() {

    }




}
