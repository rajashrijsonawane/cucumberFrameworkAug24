package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FAQPage extends HeaderPage {
    public FAQPage(WebDriver driver, ExtentTest logger) {
        super(driver, logger);
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText= "New FAQ")
    WebElement Link_NFAQ;
    @FindBy(xpath = "//input[@name='product_name']")
    WebElement tb_ProductName;
//    @FindBy(xpath = "//input[@value='Change']")
//    WebElement btn_change;
    //input[@value='Change']
    @FindBy(xpath= "//select[@name='faqstatus']")
    WebElement dpdn_status;
    @FindBy(xpath= "//textarea[@name='question']")
    WebElement txtA_Question;
    @FindBy(xpath= "//textarea[@name='faq_answer']")
    WebElement txtA_Answer;
//    @FindBy(xpath= "//select[@name='faqcategories']")
//    WebElement dpdn_Category;
    @FindBy(xpath = "//input[@accesskey='S']")
    WebElement btn_Save;
    public void ClickNewFAQ() {
        ClickElement(Link_NFAQ,"Clicked on new Account Link");
    }
    public void createNewFAQ(String Pdtname,String stusname, String Que, String Ans){
        SetProductName(Pdtname);
       // Setchange(change);
        SetStatusName(stusname);
        SetQuestion(Que);
        SetAnswer(Ans);
        ClickSave();
    }
    public void SetProductName(String Pdtname)
    {
        SetInput(tb_ProductName,Pdtname,Pdtname+" has been Product Name entered into Product Name field");
    }
//    public void Setchange(String change)
//    {
//        SetInput(btn_change,change,change+" has been Product Name entered into Product Name field");
//    }

    public void SetStatusName(String stusname)
    {
        SetInput(dpdn_status,stusname,stusname+" has been status Name entered into status Name field");
    }
    public void SetQuestion(String Que){
        SetInput(txtA_Question,Que,Que+" has been question entered into quetion field");
    }
    public void SetAnswer(String Ans){
        SetInput(txtA_Answer,Ans,Ans+" has been answer entered into answer field");
    }
    public void ClickSave(){
        ClickElement(btn_Save,"Save button click");
    }

}
