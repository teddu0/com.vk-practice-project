package tests;

import appmanager.ApplicationManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
    ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void init() throws InterruptedException {
        app.setUp();
    }

    @AfterMethod
    public void stop() {
        app.tearDown();
    }


}
