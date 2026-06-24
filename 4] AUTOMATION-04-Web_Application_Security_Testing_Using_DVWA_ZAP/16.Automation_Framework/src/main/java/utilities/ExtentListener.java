package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.BaseTest;

public class ExtentListener implements ITestListener {

    private static ExtentReports extent =
            ExtentManager.getInstance();

    private static ThreadLocal<ExtentTest> test =
            new ThreadLocal<>();

    @Override
    public void onStart(ITestContext context) {

        System.out.println(
                "===== TEST EXECUTION STARTED =====");
    }

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest extentTest =
                extent.createTest(
                        result.getMethod().getMethodName());

        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.get().log(
                Status.PASS,
                "Test Passed Successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.get().log(
                Status.FAIL,
                result.getThrowable());

        try {

            Object currentClass =
                    result.getInstance();

            WebDriver driver =
                    ((BaseTest) currentClass).getDriver();

            String screenshotPath =
                    ScreenshotUtil.captureScreenshot(
                            driver,
                            result.getMethod().getMethodName());

            test.get().addScreenCaptureFromPath(
                    screenshotPath);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test.get().log(
                Status.SKIP,
                "Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();

        System.out.println(
                "===== EXTENT REPORT GENERATED =====");
    }
}

