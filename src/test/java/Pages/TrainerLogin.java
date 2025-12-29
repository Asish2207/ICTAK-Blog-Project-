package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrainerLogin {
    WebDriver driver;
    WebDriverWait wait;
    public TrainerLogin(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    

    	public void dropDown() {

    	    // Use refreshed to avoid stale element
    	    WebElement drpDown = wait.until(
    	        ExpectedConditions.elementToBeClickable(
    	            By.xpath("//a[@id='navbarDropdown' and contains(@class,'dropdown-toggle')]")
    	        )
    	    );
    	    drpDown.click();

    	    WebElement log = wait.until(
    	        ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='drop' and normalize-space()='Login']")));
    	    log.click();
    	}

    public void loginPage(String e_mail, String passWord) {
        driver.findElement(By.id("user")).sendKeys(e_mail);
        driver.findElement(By.id("pwd")).sendKeys(passWord);
    }

    public void subBtn() {
        WebElement lognBtn = driver.findElement(By.id("logbut"));
        lognBtn.click();
    }

    // Added logout functionality
    
public void Logoutbtn() {

 // Then click logout
 WebElement logOut = wait.until(ExpectedConditions.elementToBeClickable(
         By.xpath("//a[@id='nav' and text()='logout'])[1]")));
 logOut.click();
}
}


