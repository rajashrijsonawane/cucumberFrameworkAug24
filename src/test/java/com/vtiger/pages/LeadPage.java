package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage extends HeaderPage {

    public LeadPage(WebDriver driver, ExtentTest logger) {
        super(driver,logger);
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "lastname")
    WebElement tb_lastname;

    @FindBy(name = "company")
    WebElement tb_company;

    @FindBy(name = "button")
    WebElement btn_save;

    public void createLead(String lname,String comp){
        SetLastname(lname);
        SetCompany(comp);
        ClickSave();
    }
    public void SetLastname(String lname)
    {
        SetInput(tb_lastname,lname,lname+" has been entered successfully into last name field");
    }
    public void SetCompany(String comp){
        SetInput(tb_company,comp,comp+" has been entered successfully into company field");
    }
    public void ClickSave(){
        ClickElement(btn_save,"Save button click");
    }

}
