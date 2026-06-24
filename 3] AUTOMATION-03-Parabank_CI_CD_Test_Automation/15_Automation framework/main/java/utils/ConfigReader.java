package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {

        try {

            String path = System.getProperty("user.dir")
                    + "/src/test/resources/config.properties";

            System.out.println("Loading Config File: " + path);

            FileInputStream fis = new FileInputStream(path);

            properties.load(fis);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}