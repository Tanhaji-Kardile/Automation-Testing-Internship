package testdata;

public class TestData {

    // SQL Injection Payloads
    public static Object[][] sqlPayloads() {

        return new Object[][] {

                { "1" },

                { "1' OR '1'='1" },

                { "1' OR 1=1#" },

                { "' OR 'a'='a" },

                { "1' UNION SELECT null,null#" }

        };
    }

    // XSS Payloads
    public static Object[][] xssPayloads() {

        return new Object[][] {

                { "<b>XSS Test</b>" },

                { "<h1>XSS Vulnerability</h1>" },

                { "<i>Security Test</i>" },

                { "<marquee>XSS</marquee>" },

                { "<svg>XSS</svg>" }

        };
    }
}