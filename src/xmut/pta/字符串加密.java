package xmut.pta;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-09-21 22:25
 */
public class 字符串加密 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String plaintext = in.nextLine();
            String key = in.nextLine();
            in.next();


            char[] keys = key.toCharArray();
            char[] chars = plaintext.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[i] = (char) (chars[i] + Integer.parseInt(String.valueOf(keys[i % 5])));
            }
            System.out.println(new String(chars));

        }
    }
}
