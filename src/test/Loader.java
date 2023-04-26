package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 朔风
 * @createTime 2022-10-07 14:59
 */
public class Loader {
    public static void main(String[] args) throws IOException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        InputStream stream = loader.getResourceAsStream("db.properties");

        Properties properties = new Properties();
        properties.load(stream);
        System.out.println(properties.getProperty("day"));
        System.out.println(properties.getProperty("year"));
        System.out.println(properties.getProperty("mouth"));

    }
}
