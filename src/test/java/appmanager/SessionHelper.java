package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends BaseHelper {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String login, String pass) throws InterruptedException {
        type(By.xpath("//input[@name='login']"), login);
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(4000);// временно
        type(By.xpath("//input[@name='password']"), pass);
        click(By.xpath("//button[@type='submit']"));
    }
}
