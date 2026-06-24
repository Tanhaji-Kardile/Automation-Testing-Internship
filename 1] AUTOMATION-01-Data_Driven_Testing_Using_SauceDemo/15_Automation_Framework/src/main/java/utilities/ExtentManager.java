package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("Reports/ExtentReport.html");

            spark.config().setDocumentTitle(
                    "SauceDemo Automation Report");

            spark.config().setReportName(
                    "Data Driven Testing - SauceDemo Login Functionality");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo(
                    "Project",
                    "Task1_DDT_SauceDemo Login Functionality");

            extent.setSystemInfo(
                    "Testing Type",
                    "Data Driven Testing");

            extent.setSystemInfo(
                    "Tool",
                    "Selenium + TestNG");

            extent.setSystemInfo(
                    "Browser",
                    "Chrome");

            extent.setSystemInfo(
                    "Application",
                    "SauceDemo");
        }

        return extent;
    }
}