package appmanager;

import org.openqa.selenium.*;
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

   /* public void typeAndEnter(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }*/

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;

        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public void waitElement(By locator){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }
}
