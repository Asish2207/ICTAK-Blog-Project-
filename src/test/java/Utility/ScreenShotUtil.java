package Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.TestBase;



public class ScreenShotUtil extends TestBase implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("Test Failed: " + result.getName());

        if (driver != null) {
            Listeners.ScreenshotUtil.takeScreenshot(driver, result.getName());
        }
    }
}