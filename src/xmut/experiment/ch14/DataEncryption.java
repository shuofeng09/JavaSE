package xmut.experiment.ch14;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-21 23:03
 */
public class DataEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            char[] arr = new char[4];
            char[] charArray = line.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i];
                int code = Integer.parseInt(String.valueOf(c));
                code = (code + 5) % 10;
                arr[i] = (char) (code + '0');
            }
            StringBuffer buffer = new StringBuffer(new String(arr));
            System.out.println(buffer.reverse());
        }
    }
}
