package com.vtiger.stepdefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PotentialSteps extends BaseSteps{

    @When("user click on new potential and search the mandatory fields on potential page and click on search button")
    public void user_click_on_new_potential_and_search_the_mandatory_fields_on_potential_page_and_click_on_search_button() {
        getAccountPage().ClickNewAccount();
        getAccountPage().createNewAccount(td.get(ScenarioName).get("Potential Name"),td.get(ScenarioName).get("accountname"));
    }
    @Then("Potential should search successfully")
    public void potential_should_search_successfully() {

    }
}
