package Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.TrainerPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TrainerTC {

    TrainerPage obj;
    WebDriver driver;
    Properties prop;

    @BeforeClass
    public void objInit() throws IOException {
        //Load config properties
        FileReader f1 = new FileReader(
            "E:\\SDET\\Asish\\ICTAK-Blog\\ICTAK-Blog\\src\\test\\resources\\Config.Properties"
        );
        prop = new Properties();
        prop.load(f1);
        //Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Navigate to URL from properties file
        driver.get(prop.getProperty("url"));
        //Initialize page object
        obj = new TrainerPage(driver);
    }

    @Test
    public void tc01() {
        obj.dropDown();
        obj.LoginPage("suresh123@gmail.com","Suresh123");
        obj.SubButtn();
    }

    @Test
    public void tc02() {
        obj.dropDown();
        obj.LoginPage("suresh12@gmail.com","Suresh123");
        obj.SubButtn();
    }

    @Test
    public void tc03() {
        obj.dropDown();
        obj.LoginPage("suresh123@gmail.com","Suresh12");
        obj.SubButtn();
    }
}



