package com.vtiger.pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public static WebDriver driver;
    public static LoginPage lp;
    public static LeadPage ldp;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;
    public static HeaderPage hdp;
    public static HomePage hp;
    public static AccountPage acp;
    public static ContactPage cntp;
    public static TicketPage tctp;
    public static FAQPage FAQp;
    public static NotePages notePage;
    public static EmailPage Emailpg;
    public static EventPage EventPage;
    public static HelpDeskPage HelpDsk;

    public HelpDeskPage getHelpDsk(){
        return HelpDsk = (HelpDsk==null)? new HelpDeskPage(driver,logger) : HelpDsk;
    }

    public LoginPage getLoginPage(){
//        if (lp==null){return  lp= new LoginPage(driver,logger);}else{return lp;}
       return lp = (lp==null)? new LoginPage(driver,logger) : lp;
    }
    public HeaderPage getHeaderPage(){
        return hdp = (hdp==null)? new HeaderPage(driver,logger) : hdp;
    }

    public LeadPage getLeadPage(){
        return ldp=(ldp==null)? new LeadPage(driver,logger) : ldp;
    }
    public EmailPage getEmailPage(){
        return Emailpg=(Emailpg==null)? new EmailPage(driver,logger) : Emailpg;
    }
    public EventPage getEventPage(){
        return EventPage=(EventPage==null)? new EventPage(driver,logger) : EventPage;
    }

    public FAQPage getFAQPage(){
        return FAQp=(FAQp==null)? new FAQPage(driver,logger) : FAQp;
    }

    public AccountPage getAccountPage(){
        return acp=(acp==null)? new AccountPage(driver,logger) : acp;
    }
    public TicketPage getTicketPage(){
        return tctp=(tctp==null)? new TicketPage(driver,logger) : tctp;
    }
    public NotePages getNotePage(){
        return notePage=(notePage==null)? new NotePages(driver,logger) : notePage;
    }

    public ContactPage getContactPage(){
        return cntp=(cntp==null)? new ContactPage(driver,logger) : cntp;
    }
   public HomePage getHomePage(){
//        return hp = (hp==null)? new HeaderPage(driver,logger) : hp;
       return null;
   }






}
