package xmut.test;

/**
 * @author 朔风
 * @date 2023-12-25 13:06
 */

import java.util.Objects;
import java.util.Scanner;

public class Test021312312 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = new String[5];
        while (in.hasNextLine()) {
            String[] split = in.nextLine().split("\\s+");
            switch (split[0]) {
                case "arr":
                    try {
                        String string = strings[Integer.parseInt(split[1])];
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                    }
                    break;
                case "null":
                    System.out.println(new NullPointerException());
                    break;
                case "cast":
                    try {
                        Object o = "abc";
                        int i = (int) o;
                    } catch (ClassCastException e) {
                        System.out.println(e);
                    }
                    break;
                case "num":
                    try {
                        int n1 = Integer.parseInt(split[1]);
                    } catch (NumberFormatException e) {
                        System.out.println(e);
                    }
                    break;
                default:
                    return;
            }


        }
    }
}
