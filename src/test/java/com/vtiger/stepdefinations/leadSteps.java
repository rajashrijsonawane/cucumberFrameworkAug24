package com.vtiger.stepdefinations;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import java.util.Map;

public class leadSteps extends BaseSteps {
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

    @Then("lead should create successfully")
    public void lead_should_create_successfully() {

    }
    @When("user click on new lead and add the mandatory fields and click on save button")
    public void user_enter_the_mandatories_fields_and_click_on_save_button(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> lst= dataTable.entries();
        for (int i=0;i<lst.size();i++){
         getLeadPage().ClickNewLead();
         getLeadPage().createLead(lst.get(i).get("lastname"),lst.get(i).get("company"));
        }
    }

}
