package tests;

import appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
