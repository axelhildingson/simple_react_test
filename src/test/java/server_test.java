import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class server_test {


    @Test
    public void firstTest(){
        System.out.println("TEST");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:3000");
        driver.findElement(By.className("commentAuthor")).isDisplayed();
    }
}
