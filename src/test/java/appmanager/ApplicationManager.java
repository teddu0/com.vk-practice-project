package appmanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    private WebDriver driver;
    NavigationHelper navigationHelper;
    MessageSenderHelper messageSenderHelper;
    SessionHelper sessionHelper;

    PostCreationHelper postCreationHelper;

    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        navigationHelper = new NavigationHelper(driver);
        messageSenderHelper = new MessageSenderHelper(driver);
        sessionHelper = new SessionHelper(driver);
        postCreationHelper = new PostCreationHelper(driver);
        driver.get("https://vk.com");
        sessionHelper.login("77712473368", "Secret2022");


    }

    public void tearDown() {
        driver.close();
        driver.quit();
    }


    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public MessageSenderHelper getMessageSenderHelper() {
        return messageSenderHelper;
    }

    public PostCreationHelper getPostCreationHelper() {
        return postCreationHelper;
    }
}
