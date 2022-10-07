package 设计模式.Adapter.A1;

import java.io.IOException;

/**
 * @author 朔风
 * @createTime 2022-10-04 11:15
 */
public interface FileIO {
    public void readFromFile(String fileName) throws IOException;

    public void writeToFile(String fileName) throws IOException;

    public void setValue(String key, String value);

    public String getValue(String key);
}
