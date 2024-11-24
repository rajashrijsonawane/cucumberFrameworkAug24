package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpDeskPage extends HeaderPage{
    public HelpDeskPage(WebDriver driver, ExtentTest logger) {
        super(driver, logger);
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText= "HelpDesk")
    WebElement Link_HelpDesk;
    @FindBy(xpath= "//input[@name='ticket_title']")
    WebElement tb_subHelpdk;

    @FindBy(xpath= "//*[@value='Small Problem']")
    WebElement dpdn_CategoryOfPblm;

    @FindBy(xpath= "//input[@name='contact_name']")
    WebElement tb_Contact;

    @FindBy(xpath= "//input[@name='date']")
    WebElement tb_date;

    @FindBy(xpath= "//*[@value='Urgent']")
    WebElement dpdn_Priority;

    @FindBy(xpath= "//input[@name='current_user_only']")
    WebElement cb_OnlyMyItems;

    @FindBy(xpath= "//*[@value='In Progress']")
    WebElement dpdn_StatusHD;

    @FindBy(xpath= "//input[@value='  Save  ']")
    WebElement btn_Search;

    public void ClickHelpDesk(){
        ClickElement(Link_HelpDesk," Link HelpDesk clicked successfully ");
    }
    public void createHelpDesk(String subhpdk,String catg,String pri,String cont,String tbdata,String sts){
        SetSubject(subhpdk);
        SetCategoryOfProblem(catg);
        SetPrority(pri);
        SetContact(cont);
        SetInterDate(tbdata);
        SetcheckboxOnlyMyItems();
        SetStatus(sts);
        ClickOnSearch();
    }
    public void SetSubject(String subhpdk){
        SetInput(tb_subHelpdk,subhpdk,subhpdk+" has been subject entered into helpdesk subject field");
    }
    public void SetCategoryOfProblem(String catg){
       SetInput(dpdn_CategoryOfPblm,catg,catg+" has been category entered into category field ");
    }
public void SetPrority(String pri){
        SelectVisibleText(dpdn_Priority,pri, pri+" has been priority selected from dropdown ");
}
public void SetContact(String cont){
        SetInput(tb_Contact,cont,cont+" has been Contact entered into contact field ");
}

    public void SetInterDate(String tbdata){
        SetInput(tb_date,tbdata,tbdata+" has been created date is selected from the created date dropdown ");
    }
public void SetcheckboxOnlyMyItems(){
        ClickElement(cb_OnlyMyItems," OnlyMyItems check box has been clicked ");
}
public void SetStatus(String sts){
        SetInput(dpdn_StatusHD,sts,sts+" has been status selected from the status drop down ");
}
public void ClickOnSearch(){
        ClickElement(btn_Search," Search button clicked ");
}


}
