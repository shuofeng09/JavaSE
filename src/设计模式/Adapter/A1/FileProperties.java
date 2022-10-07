package 设计模式.Adapter.A1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * @author 朔风
 * @createTime 2022-10-04 11:15
 */
public class FileProperties implements FileIO {

    private Properties properties;

    public FileProperties() {
        this.properties = new Properties();
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        properties.load(Files.newInputStream(Paths.get(fileName)));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        properties.store(Files.newOutputStream(Paths.get(fileName)), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key, "");
    }
}
