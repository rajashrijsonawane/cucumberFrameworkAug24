package com.vtiger.utility;

import com.aventstack.extentreports.ExtentTest;
import com.codoid.products.utils.FilenameUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class PageActions {
    public WebDriver driver;
    public WebDriverWait wait;
    public ExtentTest logger;

    public PageActions( WebDriver driver, ExtentTest logger){
        this.driver = driver;
        this.logger=logger;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    public String getScreenshot() {
        Date d = new Date();
        DateFormat ft= new SimpleDateFormat("ddMMyyyyhhmmss");
        String fileName = ft.format(d);
        String path = System.getProperty("user.dir") + "/src/test/java/com/vtiger/reports/screnshot/"+fileName+".png";
        TakesScreenshot ts = ((TakesScreenshot)driver);

        File SrcFile=ts.getScreenshotAs(OutputType.FILE);
       File DestFile = new File(path);
       try{FileUtils.copyFile(SrcFile,DestFile);
       }catch (IOException e){e.printStackTrace();}return path;}

      public void SetInput(WebElement elm,String value,String msg)
      {try {
          wait.until(ExpectedConditions.visibilityOf(elm));
          elm.clear();
          elm.sendKeys(value);
          logger.pass(msg);
      }catch (Exception e){
       System.out.println(e.getMessage());
       logger.fail("Unable to set Data into text field due to error "+e.getMessage()+"   <a href=’"+getScreenshot()+"’><span class=’label end-time’>Screenshot</span></a>");}}

    public void SelectVisibleText(WebElement elm,String value,String msg)
    {try {wait.until(ExpectedConditions.visibilityOf(elm));
            Select sel = new Select(elm);
            sel.selectByValue(value);
            logger.pass(msg);}catch (Exception e){
            System.out.println(e.getMessage());
            logger.fail("Unable to select data from dropdown field due to error "+e.getMessage()+"   <a href=’"+getScreenshot()+"’><span class=’label end-time’>Screenshot</span></a>");}}

    public void ClickElement(WebElement elm,String msg)
    {try {wait.until(ExpectedConditions.elementToBeClickable(elm));
          elm.click();
            logger.pass(msg);}catch (Exception e){
            System.out.println(e.getMessage());
            logger.fail("Unable to click on element due to error "+e.getMessage()+"   <a href=’"+getScreenshot()+"’><span class=’label end-time’>Screenshot</span></a>");}}

    public void ElementExist(WebElement elm,String msg){try {
            wait.until(ExpectedConditions.visibilityOf(elm));
            elm.isDisplayed();
            logger.pass(msg);}catch (Exception e){
            System.out.println(e.getMessage());
            logger.fail("Element does not exists due to error "+e.getMessage()+"   <a href=’"+getScreenshot()+"’><span class=’label end-time’>Screenshot</span></a>");}}


}
