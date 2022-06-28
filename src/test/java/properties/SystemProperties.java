package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemProperties {
    @Test
    void someTest1() {
        String browser = System.getProperty("browser");
        System.out.println(browser); //null
    }

    @Test
    void someTest2() {
        System.setProperty("browser", "safari");
        String browser = System.getProperty("browser");
        System.out.println(browser); //safari
    }

    @Test
    void someTest3() {
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); //opera
    }

    @Test
    void someTest4() {
        System.setProperty("browser", "safari");
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); //opera
    }

    @Test
    void someTest5() {
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); //opera
    }

    @Test
    @Tag("test6")
    void someTest6() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "101");
        String browserSize = System.getProperty("browserSize", "1920x1080");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);
    }

}
