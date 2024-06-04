package pageobjects;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

import static common.Utility.*;

public class PracticeForm extends Base {

    @FindBy(xpath = "//div/h1[contains(text(), 'Practice Form')]")
    public WebElement heading_PracticeForm;

    @FindBy(xpath = "//div/h5[contains(text(), 'Student Registration Form')]")
    public WebElement srf;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement userMail;

    @FindBy(xpath = "//label[contains(.,'Male')]")
    public WebElement male;

    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElement mobileNumber;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//select[contains(@class,'year-select')]")
    public WebElement selectYear;

    @FindBy(xpath = "//select[contains(@class,'month-select')]")
    public WebElement selectMonth;

    @FindBy(xpath = "//div[contains(@aria-label,' January 13th, 2001')]")
    public WebElement date;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    public WebElement subjects;

    @FindBy(xpath = "//label[text()='Sports']")
    public WebElement sports;

    @FindBy(xpath = "//label[text()='Music']")
    public WebElement music;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    public WebElement upload;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    public WebElement currentAddress;

    @FindBy(xpath = "//input[@id='react-select-3-input']")
    public WebElement selectState;

    @FindBy(xpath = "//input[@id='react-select-4-input']")
    public WebElement selectCity;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//button[@id='closeLargeModal']")
    public WebElement closeBtn;




    public PracticeForm(){
        PageFactory.initElements(driver,this);
    }

    public void formOption() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        Robot sub = new Robot();

        waitForElementVisible(heading_PracticeForm);

//        clickElement(formsPage);
//        waitForElementVisible(practiceForm);
//        clickElement(practiceForm);
        waitForElementVisible(firstName);
        firstName.sendKeys(prop.getProperty("formsFirstName"));
        waitForElementVisible(lastName);
        lastName.sendKeys(prop.getProperty("formsLastName"));
        waitForElementVisible(userMail);
        userMail.sendKeys(prop.getProperty("formsUserMail"));
        waitForElementVisible(male);
        clickElement(male);
        waitForElementVisible(mobileNumber);
        mobileNumber.sendKeys(prop.getProperty("formsMobileNumber"));
        waitForElementVisible(dateOfBirth);
        clickElement(dateOfBirth);
        Select year = new Select(selectYear);
        year.selectByVisibleText("2001");
        Select month = new Select(selectMonth);
        month.selectByVisibleText("January");
        waitForElementVisible(date);
        clickElement(date);
        scrollUsingJavaScriptExecutor(dateOfBirth);
        waitForElementVisible(subjects);
        subjects.sendKeys(prop.getProperty("subject1"));
        sub.keyPress(KeyEvent.VK_ENTER);
        waitForElementVisible(subjects);
        subjects.sendKeys(prop.getProperty("subject2"));
        sub.keyPress(KeyEvent.VK_ENTER);
        scrollUsingJavaScriptExecutor(sports);
        waitForElementVisible(sports);
        clickElement(sports);
        waitForElementVisible(music);
        clickElement(music);
        scrollUsingJavaScriptExecutor(upload);
        waitForElementVisible(upload);
        upload.sendKeys("E:\\Coding\\Automation\\DemoTest1\\src\\test\\resources\\file\\abcd.jpg");
        scrollUsingJavaScriptExecutor(currentAddress);
        waitForElementVisible(currentAddress);
        currentAddress.sendKeys(prop.getProperty("formsCurrentAddress"));
        for(int i=0;i<=5;i++)
        {
            sub.keyPress(KeyEvent.VK_CONTROL);
            sub.keyPress(KeyEvent.VK_MINUS);
            sub.keyRelease(KeyEvent.VK_CONTROL);
            sub.keyRelease(KeyEvent.VK_MINUS);
        }
        waitForElementVisible(selectState);
        selectState.sendKeys(prop.getProperty("formsState"));
        sub.keyPress(KeyEvent.VK_ENTER);
        waitForElementVisible(selectCity);
        selectCity.sendKeys(prop.getProperty("formsCity"));
        sub.keyPress(KeyEvent.VK_ENTER);
        scrollUsingJavaScriptExecutor(submitBtn);
        waitForElementVisible(submitBtn);
        clickElement(submitBtn);
        waitForElementVisible(closeBtn);
        clickElement(closeBtn);

        Thread.sleep(5000);
    }
//}







}
