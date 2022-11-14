package tests;

import appmanager.ApplicationManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    ApplicationManager app = new ApplicationManager();

    @BeforeTest
    public void init() throws InterruptedException {
        app.setUp();
    }

    @AfterTest
    public void stop() {
        app.tearDown();
    }


}
