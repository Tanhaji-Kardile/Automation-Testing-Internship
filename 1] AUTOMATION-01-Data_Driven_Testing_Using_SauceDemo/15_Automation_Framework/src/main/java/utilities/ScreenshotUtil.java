package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver,
                                           String screenshotName) {

        String timestamp =
                new SimpleDateFormat("yyyyMMdd_HHmmss")
                        .format(new Date());

        String path =
                "Screenshots/"
                + screenshotName
                + "_"
                + timestamp
                + ".png";

        try {

            File screenshotsDir =
                    new File("Screenshots");

            if (!screenshotsDir.exists()) {

                screenshotsDir.mkdirs();
            }

            TakesScreenshot ts =
                    (TakesScreenshot) driver;

            File source =
                    ts.getScreenshotAs(OutputType.FILE);

            File destination =
                    new File(path);

            FileUtils.copyFile(source, destination);

        } catch (IOException e) {

            e.printStackTrace();
        }

        return path;
    }
}