package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MessageSenderHelper extends BaseHelper {

    public MessageSenderHelper(WebDriver driver) {
        super(driver);
    }

    public void initContactForMessage() {
        waitElementToBeClickable(By.xpath("//li[@data-list-id='310303767']"));
        click(By.xpath("//li[@data-list-id='310303767']"));
    }

    public void fillMessageText(String text) {
        waitElementToBeClickable(By.xpath("//div[@role='textbox']"));
        click(By.xpath("//div[@role='textbox']"));
        type(By.xpath("//div[@role='textbox']"), text);
    }

    public void submitSendingMessage(){
        waitElementToBeClickable(By.xpath("//button[@class='im-send-btn im-chat-input--send _im_send im-send-btn_send']"));
        click(By.xpath("//button[@class='im-send-btn im-chat-input--send _im_send im-send-btn_send']"));
    }

    public void selectLastMessage(Keys key){
        waitElementToBeClickable(By.xpath("//div[@role='textbox']"));
        click(By.xpath("//div[@role='textbox']"));
        tapKeys(By.xpath("//div[@role='textbox']"), key);
    }

    public void submitByEnter(Keys key){
        waitElementToBeClickable(By.xpath("//div[@role='textbox']"));
        click(By.xpath("//div[@role='textbox']"));
        tapKeys(By.xpath("//div[@role='textbox']"), key);
    }
}
