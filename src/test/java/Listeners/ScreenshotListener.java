  package Listeners;

    import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
    import org.testng.ITestResult;

import Base.TestBase;
import Utility.ScreenShotUtil;

    public class ScreenshotListener extends TestBase implements ITestListener {

        @Override
        public void onTestFailure(ITestResult result) {
            WebDriver driver=getDriver();
            ScreenShotUtil.takeScreenshot(driver,result.getName());
        }
    }
testng.xml
    <listeners>
    <listener class-name="listeners.ScreenshotListener"/>
</listeners>
TestBase 
public WebDriver getDriver() {
      return driver;
    }