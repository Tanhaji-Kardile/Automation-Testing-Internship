package tests;

import org.testng.annotations.Test;

import utilities.ZAPUtility;

public class SecurityScanTest {

    @Test
    public void executeSecurityScan()
            throws Exception {

        String targetUrl =
                "http://localhost/DVWA/";

        System.out.println(
                "===================================");

        System.out.println(
                "Starting DVWA Security Scan");

        System.out.println(
                "Target : " + targetUrl);

        System.out.println(
                "===================================");

        ZAPUtility.spiderScan(targetUrl);

        ZAPUtility.activeScan(targetUrl);

        ZAPUtility.generateReport();

        System.out.println(
                "===================================");

        System.out.println(
                "Security Scan Finished");

        System.out.println(
                "===================================");
    }
}