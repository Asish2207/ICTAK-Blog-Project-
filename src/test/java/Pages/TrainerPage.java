package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrainerPage {

    WebDriver driver;
    WebDriverWait wait;

    public TrainerPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // Click dropdown and login
    public void dropDown() {
        // Locate dropdown every time 
        WebElement dpDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'user.png')]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dpDown);
        wait.until(ExpectedConditions.elementToBeClickable(dpDown)).click();

        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Login']")));
        login.click();
    }

    // Enter credentials
    public void LoginPage(String email, String password) {
        driver.findElement(By.xpath("//input[@placeholder='Enter Email id']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Enter Email id']")).sendKeys(email);

        driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys(password);
    }

    // Click login and handle alert if present
    public void SubButtn() {
        WebElement Lgbtn = driver.findElement(By.id("logbut"));
        Lgbtn.click();

        // Handle alert if exists
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("Alert found: " + alert.getText());
            alert.accept(); // close alert
        } catch (Exception e) {
            // No alert found, continue
        }
    }
}

