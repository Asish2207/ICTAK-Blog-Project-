package Base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	    protected WebDriver driver;
	    protected WebDriverWait wait;
	    protected Properties prop;

	    // 🔹 Load configuration file
	    public void readProp() throws IOException {
	        FileReader f1 = new FileReader("C:\\Users\\hp\\git\\ICTAK-Blog-Project-\\src\\test\\resources\\Config.Properties");
	        prop = new Properties();
	        prop.load(f1);
	    }

	    // Setup WebDriver and WebDriverWait
	    @BeforeTest
	    public void setUp() throws IOException {
	        readProp();

	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Open the URL from config file
	        driver.get(prop.getProperty("url"));
	    }

	    // Close browser after test
	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
	

