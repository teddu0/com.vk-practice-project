package tests;

import org.testng.annotations.Test;

public class PostCreationTests extends TestBase {

    @Test
    public void testTextPostCreation() throws InterruptedException {
        app.getNavigationHelper().goToProfile();
        Thread.sleep(2000);
        app.getPostCreationHelper().fillPostField("Hello people");
        Thread.sleep(2000);
        app.getPostCreationHelper().submitPostCreation();
        Thread.sleep(3000);

    }
}