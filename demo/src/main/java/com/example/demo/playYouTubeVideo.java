package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class playYouTubeVideo {
protected static WebDriver driver;
public void setDriver(WebDriver driver){playYouTubeVideo.driver  = driver;}
public static String url="https://youtube.com/";
public static void executeJavaScript(String xPath){
    JavascriptExecutor js = (JavascriptExecutor)driver;
    WebElement element =driver.findElement(By.xpath(xPath));
    js.executeScript("arguments[0].click();",element);
}

    public static void main(String[] args) {

    }
}
