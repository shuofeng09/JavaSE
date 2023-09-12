package test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author 朔风
 * @createTime 2022-07-06 13:01
 */
public class Test01 {

    /**
     * 测试命令行参数
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "ipconfig");
        Process process = processBuilder.start();

        Scanner scanner = new Scanner(process.getInputStream());
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

    }

}
