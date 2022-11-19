package appmanager;

import org.openqa.selenium.*;
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
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void tapKeys(By locator, Keys key){
        driver.findElement(locator).sendKeys(key);
    }

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;

        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public void waitElementToBeClickable(By locator){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }

}
