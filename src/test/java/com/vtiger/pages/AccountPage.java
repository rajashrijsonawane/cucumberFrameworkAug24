package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends HeaderPage {

    public AccountPage(WebDriver driver, ExtentTest logger) {
        super(driver,logger);
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText= "New Account")
    WebElement Link_NAcc;
    @FindBy(name = "accountname")
    WebElement tb_accountname;

    @FindBy(name= "tickersymbol")
    WebElement tb_tickersymbol;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement btn_Save;

    public void ClickNewAccount() {
        ClickElement(Link_NAcc,"Clicked on new Account Link");

    }
    public void createNewAccount(String Acname,String tsybol){
        SetAccountname(Acname);
        SetTickerSymbol(tsybol);
        ClickSave();
    }
    public void SetAccountname(String Acname)
    {
        SetInput(tb_accountname,Acname,Acname+" has been Account Name entered into Account Name field");
    }
    public void SetTickerSymbol(String tsybol){
        SetInput(tb_tickersymbol,tsybol,tsybol+" has been ticket symbol entered into ticket symbol field");
    }
    public void ClickSave(){
        ClickElement(btn_Save,"Save button click");
    }


}
