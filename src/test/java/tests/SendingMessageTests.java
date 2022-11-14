package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class SendingMessageTests extends TestBase {
    Faker faker = new Faker();

    @Test
    public void testSendingTextMessage() throws InterruptedException {
        app.getNavigationHelper().goToMessages();
        Thread.sleep(2000);
        app.getMessageSenderHelper().initContactForMessage();
        Thread.sleep(2000);
        app.getMessageSenderHelper().fillMessageText(faker.harryPotter().spell());
        Thread.sleep(2000);
    }


}
