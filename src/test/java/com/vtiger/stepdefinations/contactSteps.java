package com.vtiger.stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class contactSteps extends BaseSteps {
    @When("user click on new contact list and enter the mandatories fields and click on save button")
    public void user_click_on_new_contact_list_and_enter_the_mandatories_fields_and_click_on_save_button(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> lst= dataTable.entries();
        for (int i=0;i<lst.size();i++){
//            driver.findElement(By.linkText("New Contact")).click();
//            driver.findElement(By.name("lastname")).sendKeys(lst.get(i).get("lastname" ));
//            driver.findElement(By.name("department")).sendKeys(lst.get(i).get("department" ));
//            driver.findElement(By.name("button")).click();
            getContactPage().createNewContact();
            getContactPage().createNewContact(lst.get(i).get("lastname"),lst.get(i).get("department"));
        }
    }
    @When("user click on new contact list and enter the mandatory fields and click on save button")
    public void CreateContact() {
            getAccountPage().ClickNewAccount();
            getAccountPage().createNewAccount(td.get(ScenarioName).get("NewContactLname"),td.get(ScenarioName).get("Department"));
    }
    @Then("contact should create successfully")
    public void contact_should_create_successfully() {

    }


}
