import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        Assert.assertTrue("Could not find element", driver.findElement(By.className("commentAuthor")).isDisplayed());

        driver.quit();
    }
}
