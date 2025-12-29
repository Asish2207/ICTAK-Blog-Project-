package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrainerHome {

    WebDriver driver;
    WebDriverWait wait;

    public TrainerHome(WebDriver driver) {
        this.driver=driver;
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    }
public boolean clkHome() {
	return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav' and text()='Home']"))).isDisplayed();
}
    public void clickHome() {
        WebElement hme=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav' and text()='Home']")));
        hme.click();
    }

}