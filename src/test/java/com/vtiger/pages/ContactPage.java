package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends HeaderPage {
    public ContactPage(WebDriver driver, ExtentTest logger) {
        super(driver,logger);
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText= "New Contact")
    WebElement Link_NewContact;

    @FindBy(xpath = "//input[@name='lastname']")
    WebElement tb_lastname;

    @FindBy(xpath = "//input[@name='account_name']")
    WebElement tb_accountname;

    @FindBy(name = "button")
    WebElement btn_Save;

    public void ClickNewAccount() {
        ClickElement(Link_NewContact,"Clicked on new Contact Link text");

    }

    public void createNewContact(String clname,String Acname){
        SetNewContact(clname);
        SetAccountName(Acname);
        ClickSave();

    }
    public void SetNewContact(String clname){
       SetInput(tb_lastname,clname,clname+" has been contact lastname is entered successfully into lastname field");
    }

    public void SetAccountName(String Acname){
        SetInput(tb_accountname,Acname,Acname+" has been Account Name is entered into Acountname Field");
    }

    public void ClickSave(){
        ClickElement(btn_Save,"Save button click");
    }


    public void createNewContact() {
    }


}
