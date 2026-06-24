package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {

        try {

            properties = new Properties();

            String path = System.getProperty("user.dir")
                    + "/src/test/resources/config.properties";

            System.out.println("=================================");
            System.out.println("Current Directory : "
                    + System.getProperty("user.dir"));
            System.out.println("Loading File From : "
                    + path);
            System.out.println("=================================");

            FileInputStream fis =
                    new FileInputStream(path);

            properties.load(fis);

            fis.close();

            System.out.println("config.properties loaded successfully.");

        } catch (Exception e) {

            System.out.println("=================================");
            System.out.println("ERROR LOADING CONFIG FILE");
            System.out.println("Current Directory : "
                    + System.getProperty("user.dir"));
            System.out.println("=================================");

            e.printStackTrace();

            throw new RuntimeException(
                    "Unable to load config.properties file",
                    e);
        }
    }

    private ConfigReader() {

    }

    public static String getProperty(String key) {

        return properties.getProperty(key);
    }
}