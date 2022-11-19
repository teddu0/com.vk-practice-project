package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SendingMessageTests extends TestBase {
    Faker faker = new Faker();

    @Test
    public void testSendingTextMessage() throws InterruptedException {
        app.getNavigationHelper().goToMessages();
        app.getMessageSenderHelper().initContactForMessage();
        app.getMessageSenderHelper().fillMessageText(faker.harryPotter().spell());
        app.getMessageSenderHelper().submitSendingMessage();
        Thread.sleep(2000);
    }

    @Test
    public void testModificationSentTextMessage() throws InterruptedException {
        app.getNavigationHelper().goToMessages();
        app.getMessageSenderHelper().initContactForMessage();
        app.getMessageSenderHelper().fillMessageText(faker.harryPotter().spell());
        app.getMessageSenderHelper().submitSendingMessage();
        Thread.sleep(2000);
        app.getMessageSenderHelper().selectLastMessage(Keys.UP);
        app.getMessageSenderHelper().fillMessageText(faker.harryPotter().spell()+" MOD");
        Thread.sleep(2000);
        app.getMessageSenderHelper().submitByEnter(Keys.ENTER);
        Thread.sleep(2000);
    }

}
