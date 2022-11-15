package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BaseHelper {
    private WebDriverWait wait;

    private WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void typeAndEnter(By locator, String text) {
        driver.findElement(locator).sendKeys(text, Keys.ENTER);
    }

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;

        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    /*public void waitElement(By locator){
        wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.elementToBeClickable(locator));
    }*/
}
