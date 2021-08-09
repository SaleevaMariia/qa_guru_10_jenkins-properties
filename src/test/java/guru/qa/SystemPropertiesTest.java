package guru.qa;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("properties")
public class SystemPropertiesTest {

    @Test
    void test1(){
        System.out.println("Browser:" + System.getProperty("browser"));
    }

    @Test
    void defaultTest(){
        String value = System.getProperty("our_property", "dafault_value");
        System.out.println(value);
    }
}
