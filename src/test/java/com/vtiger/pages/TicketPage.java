package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketPage extends HeaderPage {
    public TicketPage(WebDriver driver, ExtentTest logger) {
        super(driver, logger);
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText= "New Ticket")
    WebElement Link_NewTicket;

    @FindBy(xpath = "//input[@value='T']")
    WebElement dropdn_assignedTo;

    @FindBy(xpath = "//*[@value='Normal']")
    WebElement dropdn_priority;

    @FindBy(xpath = "//*[@value='Feature']")
    WebElement dropdn_severity;

    @FindBy(xpath = "//*[@value='Small Problem']")
    WebElement dropdn_category;

    @FindBy(xpath= "//textarea[@name='ticket_title']")
    WebElement tb_title;

    @FindBy(xpath= "//textarea[@name='description']")
    WebElement ta_description;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement btn_Save;
    public void ClickNewTicket() {
        ClickElement(Link_NewTicket,"Clicked on new Ticket Link");
    }
    public void createNewTicket(String admin,String Prio,String Seve,String categry,String title,String Desci){
        SetAssignToname(admin);
        SetPriority(Prio);
        SetSeverity(Seve);
        SetCategory(categry);
        SetTitle(title);
        SetDescription(Desci);
        ClickSave();
    }
    public void SetAssignToname(String admin)
    {
        SetInput(dropdn_assignedTo,admin,admin+" has been Account Name entered into Account Name field");
    }
    public void SetPriority(String Prio){
        SetInput(dropdn_priority,Prio,Prio+" has been ticket symbol entered into ticket symbol field");
    }
    public void SetSeverity(String Seve){
        SetInput(dropdn_severity,Seve,Seve+" has been ticket symbol entered into ticket symbol field");
    }
    public void SetCategory(String categry){
        SetInput(dropdn_category,categry,categry+" has been ticket symbol entered into ticket symbol field");
    }
    public void SetTitle(String title){
        SetInput(tb_title,title,title+" has been ticket symbol entered into ticket symbol field");
    }
    public void SetDescription(String Desci){
        SetInput(ta_description,Desci,Desci+" has been ticket symbol entered into ticket symbol field");
    }
    public void ClickSave(){
        ClickElement(btn_Save,"Save button click");
    }





}
