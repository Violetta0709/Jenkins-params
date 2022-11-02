package org.veta.tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
    @Test
    void simplePropertyTest() {
        String browserName = System.getProperty("browser");
        System.out.println(browserName);

    }

    @Test
    void simpleProperty1Test() {
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser");
        System.out.println(browserName);

    }

    @Test
    void simpleProperty2Test() {
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);

    }

    @Test
    void simpleProperty3Test() {
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);

    }

    @Test
    @Tag("one_property_test")
    void simpleProperty4Test() {
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);

    }

    @Test
    @Tag("many_properties_test")
    void simpleProperty5Test() {
        String browserName = System.getProperty("browser", "firefox");
        String browserVersion = System.getProperty("browser_version", "105");
        String browserSize = System.getProperty("browse_sizer", "1920x1080");

        System.out.println(browserName);
        System.out.println(browserVersion);
        System.out.println(browserSize);
    }

    @Test
    @Tag("hello")
    void simpleProperty6Test() {
        System.out.println("Hello, " + System.getProperty("user_name", "unknown student"));

    }
}
