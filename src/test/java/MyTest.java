import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created on 07.09.2017.
 */
public class MyTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {
        driver = new ChromeDriver(  );
driver.get("http://elmir.ua");
    }

    @Test
    public void testMyTest() throws Exception {


        Assert.assertTrue(true);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
