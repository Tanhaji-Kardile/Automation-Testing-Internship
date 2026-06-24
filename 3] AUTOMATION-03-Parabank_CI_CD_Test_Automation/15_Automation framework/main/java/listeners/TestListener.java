package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.ExtentManager;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    private ExtentReports extent =
            ExtentManager.getInstance();

    private ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getName());

        System.out.println(
                "STARTED : " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");

        System.out.println(
                "PASSED : " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        System.out.println(
                "FAILED : " + result.getName());

        System.out.println(
                "REASON : "
                        + result.getThrowable());

        try {

            ScreenshotUtil.captureScreenshot(
                    result.getName());

        } catch (Exception e) {

            System.out.println(
                    "Screenshot Capture Failed");
        }
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();

        System.out.println(
                "Execution Finished");

        System.out.println(
                "Passed Tests : "
                        + context.getPassedTests().size());

        System.out.println(
                "Failed Tests : "
                        + context.getFailedTests().size());
    }
}