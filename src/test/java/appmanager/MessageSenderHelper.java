package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MessageSenderHelper extends BaseHelper {

    public MessageSenderHelper(WebDriver driver) {
        super(driver);
    }

    public void initContactForMessage() {
        waitElement(By.xpath("//li[@data-list-id='310303767']"));
        click(By.xpath("//li[@data-list-id='310303767']"));
    }

    public void fillMessageText(String text) {
        waitElement(By.xpath("//div[@role='textbox']"));
        click(By.xpath("//div[@role='textbox']"));
        type(By.xpath("//div[@role='textbox']"), text);
    }

    public void submitSendingMessage(){
        waitElement(By.xpath("//button[@class='im-send-btn im-chat-input--send _im_send im-send-btn_send']"));
        click(By.xpath("//button[@class='im-send-btn im-chat-input--send _im_send im-send-btn_send']"));
    }
}
