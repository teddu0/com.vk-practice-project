package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://vk.com");
        login("77712473368", "Secret2022");
    }
    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }


    public void login(String login, String pass) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys(login);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);// временно
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        }

    }
