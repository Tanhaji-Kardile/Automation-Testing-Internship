package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    private ExtentManager() {

    }

    public static ExtentReports getInstance() {

        if (extent == null) {

            String reportPath =
                    System.getProperty("user.dir")
                    + "/Reports/ExtentReport.html";

            ExtentSparkReporter sparkReporter =
                    new ExtentSparkReporter(reportPath);

            sparkReporter.config().setDocumentTitle(
                    "DVWA Security Testing Report");

            sparkReporter.config().setReportName(
                    "Automation Security Test Execution");

            extent = new ExtentReports();

            extent.attachReporter(sparkReporter);

            extent.setSystemInfo("Project",
                    "DVWA Security Testing");

            extent.setSystemInfo("Tester",
                    "QA Engineer");

            extent.setSystemInfo("Environment",
                    "Localhost");

            extent.setSystemInfo("Tool",
                    "Selenium + TestNG + OWASP ZAP");
        }

        return extent;
    }
}