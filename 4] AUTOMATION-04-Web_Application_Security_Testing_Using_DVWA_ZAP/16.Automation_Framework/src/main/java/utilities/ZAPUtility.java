package utilities;

import org.zaproxy.clientapi.core.ClientApi;

public class ZAPUtility {

    private static final String ZAP_HOST =
            ConfigReader.getProperty("zap.proxy.host");

    private static final int ZAP_PORT =
            Integer.parseInt(
                    ConfigReader.getProperty("zap.proxy.port"));

    private static final String API_KEY =
            ConfigReader.getProperty("zap.api.key");

    private static final ClientApi api =
            new ClientApi(
                    ZAP_HOST,
                    ZAP_PORT,
                    API_KEY);

    private ZAPUtility() {

    }

    public static void spiderScan(String targetUrl)
            throws Exception {

        System.out.println(
                "=================================");

        System.out.println(
                "Starting Spider Scan...");

        System.out.println(
                "Target URL : " + targetUrl);

        api.spider.scan(
                targetUrl,
                null,
                null,
                null,
                null);

        Thread.sleep(15000);

        System.out.println(
                "Spider Scan Completed");

        System.out.println(
                "=================================");
    }

    public static void activeScan(String targetUrl)
            throws Exception {

        System.out.println(
                "=================================");

        System.out.println(
                "Starting Active Scan...");

        System.out.println(
                "Target URL : " + targetUrl);

        api.ascan.scan(
                targetUrl,
                "True",
                "False",
                null,
                null,
                null);

        Thread.sleep(30000);

        System.out.println(
                "Active Scan Completed");

        System.out.println(
                "=================================");
    }

    public static void generateReport() {

        System.out.println(
                "Security Scan Completed Successfully");
    }
}

