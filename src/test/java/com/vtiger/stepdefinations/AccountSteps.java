package com.vtiger.stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import java.util.List;
import java.util.Map;
import static sun.net.NetProperties.get;

public class AccountSteps extends BaseSteps {
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

    @When("user click on new account and add the mandatory fields on account page and click on save button")
    public void createAccount() {
        getAccountPage().ClickNewAccount();
        getAccountPage().createNewAccount(td.get(ScenarioName).get("accountname"),td.get(ScenarioName).get("tickersymbol"));
    }
    @Then("Account should create successfully")
    public void account_should_create_successfully() {
    }

    @When("user click on new account and edit the new mandatory fields and click on save button")
    public void user_click_on_new_account_and_edit_the_new_mandatory_fields_and_click_on_save_button(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> lst= dataTable.entries();
        for (int i=0;i<lst.size();i++){
        getAccountPage().ClickNewAccount();
            getAccountPage().createNewAccount(lst.get(i).get("accountname"),lst.get(i).get("tickersymbol"));
        }
    }
    @Then("Account should edit successfully")
    public void account_should_edit_successfully() {
    }

}
