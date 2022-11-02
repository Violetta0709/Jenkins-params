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
}
