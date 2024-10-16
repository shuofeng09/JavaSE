package xmut.test;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-28 23:52
 */
public class 数字加密 {
    /*
    输入一个四位数，将其加密后输出。方法是将该数每一位上的数字加9，然后除以10取余，做为该位上的新数字，
    最后将千位和十位上的数字互换，百位和个位上的数字互换，组成加密后的新四位数。例如输入1257，
    经过加9取余后得到新数字0146，再经过两次换位后得到4601。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            char[] charArray = sc.nextLine().toCharArray();
            int[] chars = new int[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                chars[i] = charArray[i] - '0' + 9;
                chars[i] = chars[i] % 10;
            }
            int temp = 0;
            // 0123
            temp = chars[0];
            chars[0] = chars[2];
            chars[2] = temp;

            temp = chars[1];
            chars[1] = chars[3];
            chars[3] = temp;
            System.out.println("The encrypted number is " + chars[0] + chars[1]
                    + chars[2] + chars[3]);
        }
    }
}
