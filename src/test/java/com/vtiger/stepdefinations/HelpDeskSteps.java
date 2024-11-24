package com.vtiger.stepdefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelpDeskSteps extends BaseSteps{
    @When("user click on New HelpDesk and add the mandatory fields on New HelpDesk page and click on search button")
    public void user_click_on_new_help_desk_and_add_the_mandatory_fields_on_new_help_desk_page_and_click_on_search_button() {
       getHelpDsk().ClickHelpDesk();
       getHelpDsk().createHelpDesk(td.get(ScenarioName).get("HelpdeskSubject"),td.get(ScenarioName).get("CategoryOfHd"),td.get(ScenarioName).get("Contact hlpd"),td.get(ScenarioName).get(" add Date "),td.get(ScenarioName).get("Priority"),td.get(ScenarioName).get("StatusHD"));
    }
    @Then("New HelpDesk should create successfully")
    public void new_help_desk_should_create_successfully() {

    }
}
