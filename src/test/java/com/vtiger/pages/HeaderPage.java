package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.utility.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends PageActions {

    public HeaderPage(WebDriver driver, ExtentTest logger) {
        super(driver,logger);
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Logout")
    WebElement lnk_logout;
    @FindBy(linkText= "New Ticket")
    WebElement Link_NewTicket;
    @FindBy(linkText = "New Lead")
    WebElement lnk_Newlead;
    @FindBy(linkText = "Leads")
    WebElement lnk_leads;
    @FindBy(linkText = "Home")
    WebElement lnk_Home;
    @FindBy(linkText = "New Account")
    WebElement lnk_NewAccount;
    @FindBy(linkText= "New FAQ")
    WebElement Link_NFAQ;
    @FindBy(linkText= "New Note")
    WebElement Link_Note;
    @FindBy(linkText= "New Email")
    WebElement Link_Email;
    @FindBy(linkText= "New Event")
    WebElement Link_Event;
    @FindBy(linkText= "HelpDesk")
    WebElement Link_HelpDesk;


    public void ClickHelpDesk(){
        ClickElement(Link_HelpDesk," Link HelpDesk clicked successfully ");
    }

    public void verifyHome(){
        ElementExist(lnk_Home,"Link Home is displayed on Home page");
    }
    public void verifyLogout(){
        ElementExist(lnk_logout,"Link logout is displayed on Home page ");
    }
    public void ClickNewEvent(){
        ClickElement(Link_Event,"New Event LinkText clicked successfully");
    }
    public void ClickLogout(){
        ClickElement(lnk_logout,"Link Logout clicked successfully ");
    }
    public void ClickNewEmail(){
        ClickElement(Link_Email," Link New Email clicked successfully ");
    }

    public void ClickNewLead(){
        ClickElement(lnk_Newlead,"Link New Lead clicked successfully" );
    }
    public void ClickNewNote(){
        ClickElement(Link_Note,"Link New Note clicked successfully" );
    }

    public void ClickLeads(){
        ClickElement(lnk_leads,"Link Leads clicked successfully ");
    }

    public void ClickNewAccount(){
        ClickElement(lnk_NewAccount,"Link New Account clicked successfully" );
    }
    public void ClickNewTicket(){
        ClickElement(Link_NewTicket,"Link New Ticket clicked successfully" );
    }
    public void ClickNewFAQ(){
        ClickElement(Link_NFAQ,"Link New FAQ clicked successfully" );
    }
}
