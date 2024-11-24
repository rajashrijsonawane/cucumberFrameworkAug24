package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class EventPage extends HeaderPage{
    public EventPage(WebDriver driver, ExtentTest logger) {
        super(driver, logger);
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText= "New Event")
    WebElement Link_Event;

    @FindBy(xpath= "//input[@name='subject']")
    WebElement tb_subjectEvent;

    @FindBy(xpath= "//input[@value='Yes']")
    WebElement rbtn_RadioYes;

    @FindBy(xpath= "//*[@value='Weekly']")
    WebElement dpdn_RecurringEvents;

    @FindBy(xpath= "//*[@value='Held']")
    WebElement dpdn_Estatus;

    @FindBy(xpath= "//*[@value='Meeting']")
    WebElement dpdn_ActivityTyp;

    @FindBy(xpath= "//*[@name='description']")
    WebElement txtar_description;

    @FindBy(xpath= "//*[@type='checkbox']")
    WebElement cb_sendNoti;

    @FindBy(xpath= "//input[@name='location']")
    WebElement tb_Location;

    @FindBy(xpath= " //input[@accesskey='S']")
    WebElement btn_save;

    public void ClickNewEvent(){
        ClickElement(Link_Event,"New Event LinkText clicked successfully");}
public void createNewEvent(String sEvnt,String ReEvent,String EvStats,String ActTy,String EvDescri,String evLoc){
    SetEventSubject(sEvnt);
    SetSendReminder();
    SetRecurringEvents(ReEvent);
    SetEventStatus(EvStats);
    SetActivityType(ActTy);
    SetDescriptionT(EvDescri);
    SetSendNotification();
    SetLocation(evLoc);
    ClickSavebtn();
    }
    public void SetEventSubject(String sEvnt){
        SetInput(tb_subjectEvent,sEvnt,sEvnt+" has been subject entered into subject Name field");
    }
    public void SetSendReminder(){
        ClickElement(rbtn_RadioYes,"has been Send Reminder radio button clicked from Send Reminder radio button");}
    public void SetRecurringEvents(String ReEvent){
        SetInput(dpdn_RecurringEvents,ReEvent,ReEvent+" has been Recurring Events selected from Recurring Events dropdown ");}
    public void SetEventStatus(String EvStats){
        SetInput(dpdn_Estatus,EvStats,EvStats+"has been Event Status selected from Event Status dropdown");}

    public void SetActivityType(String ActTy){
        SetInput(dpdn_ActivityTyp,ActTy,ActTy+"has been Activity Type selected from Activity Type dropdown");}

    public void SetDescriptionT(String EvDescri){
        SetInput(txtar_description,EvDescri,EvDescri+"has been event description entered into event description field");}

    public void SetSendNotification(){
        ClickElement(cb_sendNoti,"has been Send Notification Check box clicked");}

    public void SetLocation(String evLoc){
        SetInput(tb_Location,evLoc,evLoc+"has been Event Location entered into Event Location field");
    }
    public void ClickSavebtn(){
        ClickElement(btn_save,"Save button Clicked");
    }





}
