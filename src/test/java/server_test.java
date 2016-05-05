import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.logging.Logger;

public class server_test {

    private final static Logger LOGGER = Logger.getLogger(server_test.class.getName());

    @Test
    public void firstTest(){
        LOGGER.info("Test start");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:3000");
        LOGGER.info("Driver found site");
        Assert.assertEquals("Could not find element", driver.getCurrentUrl(), "http://localhost:3000/");
        System.out.println(driver.getTitle());
        Assert.assertEquals("Could not find element",driver.getTitle(), "React Tutorial");

        driver.quit();
    }
}
