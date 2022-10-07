package 设计模式.Adapter.A1;

import java.io.IOException;

/**
 * @author 朔风
 * @createTime 2022-10-04 11:35
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FileIO fileIO = new FileProperties();

        fileIO.readFromFile("file.txt");

        fileIO.setValue("sex","man");
        fileIO.setValue("day","12");

        fileIO.writeToFile("new.txt");

    }
}
