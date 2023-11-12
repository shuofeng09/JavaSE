package xmut.pta;

import java.util.Scanner;

public class 判断回文 {
    //回文就是字符串中心对称，如“abcba”、“abccba”是回文，“abcdba”不是回文。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            // 获得中间的索引
            int middleIndex = line.length() / 2;
            String prefix = line.substring(0, middleIndex);
            String suffix = line.substring(middleIndex);
            System.out.println(isPalindrome(prefix, suffix));
        }
    }

    private static String isPalindrome(String prefix, String suffix) {
        for (int i = 0, j = suffix.length() - 1; i < prefix.length(); i++, j--) {
            if (prefix.charAt(i) != suffix.charAt(j)) {
                return "no";
            }
        }
        return "yes";
    }
}
