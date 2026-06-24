package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.DriverFactory;

public class ScreenshotUtil {

    public static String captureScreenshot(String testName) {

        String path =
                "test-output/screenshots/"
                        + testName
                        + ".png";

        try {

            WebDriver driver =
                    DriverFactory.getDriver();

            if (driver == null) {

                System.out.println(
                        "Driver is null. Screenshot not captured.");

                return path;
            }

            File screenshotDirectory =
                    new File("test-output/screenshots");

            if (!screenshotDirectory.exists()) {

                screenshotDirectory.mkdirs();
            }

            TakesScreenshot ts =
                    (TakesScreenshot) driver;

            File src =
                    ts.getScreenshotAs(OutputType.FILE);

            File dest =
                    new File(path);

            FileUtils.copyFile(src, dest);

            System.out.println(
                    "Screenshot Saved : "
                            + dest.getAbsolutePath());

        } catch (IOException e) {

            e.printStackTrace();

        } catch (Exception e) {

            System.out.println(
                    "Screenshot Capture Failed : "
                            + e.getMessage());
        }

        return path;
    }
}