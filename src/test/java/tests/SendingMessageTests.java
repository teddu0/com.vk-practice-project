package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SendingMessageTests extends TestBase {

    @Test
    public void testSendingTextMessage() throws InterruptedException {
        goToMessages();
        Thread.sleep(2000);
        initContactForMessage();
        Thread.sleep(2000);
        fillMessageText("Hello");
        Thread.sleep(2000);
       // sendMessage();
        //Thread.sleep(2000);
    }

    public void goToMessages() {
        driver.findElement(By.xpath("//li[@id='l_msg']")).click();
    }

    public void initContactForMessage(){
        driver.findElement(By.xpath("//li[@data-list-id='310303767']")).click();
    }

    public void fillMessageText(String text){
        driver.findElement(By.xpath("//div[@role='textbox']")).click();
        driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(text, Keys.ENTER);// надо будет энтер заменить на клик
    }

   /* public void sendMessage(){
        driver.findElement(By.xpath("//button[@aria-label='Send']/span[@data-tttype='2']")).click();
    }*/
}
