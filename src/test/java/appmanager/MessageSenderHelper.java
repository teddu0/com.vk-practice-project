package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MessageSenderHelper extends BaseHelper {

    public MessageSenderHelper(WebDriver driver) {
        super(driver);
    }

    public void initContactForMessage() {
        click(By.xpath("//li[@data-list-id='310303767']"));
    }

    public void fillMessageText(String text) {
        click(By.xpath("//div[@role='textbox']"));
        typeAndEnter(By.xpath("//div[@role='textbox']"), text);
    }

}
