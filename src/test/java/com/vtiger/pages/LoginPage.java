package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.utility.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends PageActions {
   public WebDriver driver;
   public LoginPage(WebDriver driver, ExtentTest logger )
   {
       super(driver,logger);
       this.driver = driver;
       PageFactory.initElements(driver,this);
   }

@FindBy(name ="user_name")
    WebElement tb_username;
    @FindBy(name = "user_password")
    WebElement tb_password;
    @FindBy(name = "login_theme")
    WebElement dp_theme;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement btn_login;
    @FindBy(xpath = "//img[@src='include/images/vtiger-crm.gif']")
    WebElement img_logo;

    @FindBy(xpath = "//*[contains(text(),'You must specify a valid username and password.']")
    WebElement txt_erroMsg;


  public void login(String uid,String pwd){
      SetUsername(uid);
      SetPassword(pwd);
      ClickLogin();
  }

    public void login(String uid,String pwd,String theme){
        SetUsername(uid);
        SetPassword(pwd);
        SelectTheme(theme);
        ClickLogin();
    }
  public void SetUsername(String uid)
  {
      SetInput(tb_username,uid,uid+" has been entered into username field");
  }

    public void SetPassword(String pwd){
        SetInput(tb_password,pwd,pwd+" has been entered into password field");
    }
    public void SelectTheme(String themevalue){
        SelectVisibleText(dp_theme,themevalue,themevalue+"has been selected from theme dropdown");
    }

    public void ClickLogin(){
       ClickElement(btn_login,"login button clicked");
    }

    public void verifyLogo(){

     ElementExist(img_logo,"Logo is displayed on login page");
    }
    public void verifyErrorMessage(){

     ElementExist(txt_erroMsg,"Error message validate successfully");
    }


}
