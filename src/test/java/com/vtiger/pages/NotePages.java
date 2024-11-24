package com.vtiger.pages;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotePages extends HeaderPage{
    public NotePages(WebDriver driver, ExtentTest logger) {
        super(driver, logger);
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText= "New Note")
    WebElement Link_NewNote;
    @FindBy(xpath = " //input[@name='title']")
    WebElement tb_subject;

    @FindBy(xpath = "//textarea[@name='notecontent']")
    WebElement txtA_notecontent;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement btn_Save;
    public void ClickNewNote(){
        ClickElement(Link_NewNote,"Clicked on new Note Link");
    }
    public void createNewNote(String subjt,String content){
        SetSubject(subjt);
        SetNoteContent(content);
        ClickSave();

    }
    public void SetSubject(String subjt){
        SetInput(tb_subject,subjt,subjt+"has been subject entered into subject field");
    }
    public void SetNoteContent(String content){
        SetInput(txtA_notecontent,content,content+"has been content entered into content field");
    }
    public void ClickSave(){
        ClickElement(btn_Save,"Save button click");
    }









}
