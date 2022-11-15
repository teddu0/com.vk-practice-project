package tests;

import com.github.javafaker.Faker;
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


}
