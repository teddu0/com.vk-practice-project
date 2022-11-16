package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostCreationHelper extends BaseHelper {

    public PostCreationHelper(WebDriver driver) {
        super(driver);
    }

    public void fillPostField(String text) {
        waitElement(By.xpath("//div[@id='post_field']"));
        click(By.xpath("//div[@id='post_field']"));
        type(By.xpath("//div[@id='post_field']"), text);
    }

    public void submitPostCreation() {
        waitElement(By.xpath("//button[@id='send_post']"));
        click(By.xpath("//button[@id='send_post']"));
    }
}
