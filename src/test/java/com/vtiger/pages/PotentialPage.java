package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PotentialPage extends HeaderPage{
    public PotentialPage(WebDriver driver, ExtentTest logger) {
        super(driver, logger);
    }
    @FindBy(linkText= "New Potential")
    WebElement Link_Potential;

    @FindBy(name = "potentialname")
    WebElement tb_potentialname;

    @FindBy(xpath= "//input[@name='accountname']")
    WebElement tb_accountname;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement btn_Search;

    public void ClickNewPotential() {
      ClickElement(Link_Potential,"Clicked on new Account Link");
    }
    public void createNewPotential(String Pname,String AcName){
        SetPotentialname(Pname);
        SetAccountName(AcName);
        ClickSave();
    }
    public void SetPotentialname(String Pname)
    {
        SetInput(tb_potentialname,Pname,Pname+" has been Potential Name entered into Potential Name field");
    }
    public void SetAccountName(String AcName){
        SetInput(tb_accountname,AcName,AcName+" has been account Name entered into account Name field");
    }
    public void ClickSave(){
        ClickElement(btn_Search,"Search button click");
    }


}
