package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("ExtentReports/ExtentReport.html");

            spark.config().setDocumentTitle("Parabank Automation Report");
            spark.config().setReportName("Parabank Test Execution Report");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo("Project",
                    "Parabank Automation Framework");

            extent.setSystemInfo("Tester",
                    "Tanhaji Kardile");
        }

        return extent;
    }
}