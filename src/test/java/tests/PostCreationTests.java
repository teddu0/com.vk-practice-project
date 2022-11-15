package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class PostCreationTests extends TestBase {
    Faker faker = new Faker();

    @Test
    public void testTextPostCreation() throws InterruptedException {
        app.getNavigationHelper().goToProfile();
        //Thread.sleep(2000);
        app.getPostCreationHelper().fillPostField(faker.gameOfThrones().house());
        //Thread.sleep(2000);
        app.getPostCreationHelper().submitPostCreation();
        Thread.sleep(2000);

    }
}