package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Utility extends Base{
//    public static WebDriverWait wait = new WebDriverWait(driver,30);
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    public static void waitForElementVisible(WebElement webEle) {
        try {
            wait.until(ExpectedConditions.visibilityOf(webEle));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void clickElement(WebElement element){
        try {
            element.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void scrollUsingJavaScriptExecutor(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
    }


    public static void doubleClick(WebElement element){
        Actions act = new Actions(driver);
        act.doubleClick(element).perform();
    }

    public static void rightClick(WebElement element){
        Actions act = new Actions(driver);
        act.contextClick(element).perform();

    }

}

