package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage extends HeaderPage{
    public EmailPage(WebDriver driver, ExtentTest logger) {
        super(driver, logger);
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText= "New Email")
    WebElement Link_Email;
    @FindBy(xpath = "//input[@name='ccmail']")
    WebElement tb_CCMail;
    @FindBy(xpath = "//input[@name='subject']")
    WebElement tb_subject;
    @FindBy(xpath = "//textarea[@name='description']")
    WebElement ta_description;
    @FindBy(xpath = "//input[@value='  Save  ']")
    WebElement btn_Save;
    public void ClickNewEmail(){
        ClickElement(Link_Email,"Clicked on New Email page Link");
    }
    public void createNewEmail(String CC,String Sub,String description){
//        SetCCmail(CC);
        //tb_CCMail.sendKeys("cc data");
        SetInput(tb_CCMail,CC,"CC text entered");
        SetInput(tb_subject,CC,"subject text entered");
        //SetSubject(Sub);
        SetDescription(description);
        ClickSaveBtn();

    }
//public void SetCCmail(String CC){
//        SetInput(tb_CCMail,CC,CC+"has been CC entered into CC name field");
//}
    public void SetSubject(String Sub){
        SetInput(tb_subject,Sub,Sub+"has been subject entered into subject name field");
    }
    public void SetDescription(String description){
        SetInput(ta_description,description,description+"has been description entered into description field");
    }
    public void ClickSaveBtn(){
        ClickElement(btn_Save,"Save button click");
    }





}
