package xmut.pta;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-11-10 10:54
 */
public class 找出最长的单词 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] split = sc.nextLine().split("\\s+");
            System.out.println(max(split));
        }
    }

    private static String max(String[] split) {
        String str = "";
        for (String s : split) {
            if (str.length()<s.length()) {
                str = s;
            }
        }
        return str;
    }
}
