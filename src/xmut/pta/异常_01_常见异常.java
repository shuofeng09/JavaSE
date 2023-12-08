package xmut.pta;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-05 21:44
 */
public class 异常_01_常见异常 {
    public static void main(String[] args) {

        String[] array = new String[5];

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] split = sc.nextLine().split("\\s+");
            switch (split[0]) {
                case "arr":
                    try {
                        String s = array[Integer.parseInt(split[1])];
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                    }
                    break;
                case "null":
                    try {
                        throw new NullPointerException();
                    } catch (NullPointerException e) {
                        System.out.println(e);
                    }
                    break;
                case "cast":
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("a", "abc");
                    try {
                        Integer i = (Integer) map.get("a");
                    } catch (ClassCastException e) {
                        System.out.println(e);
                    }
                    break;
                case "num":
                    try {
                        Integer a = Integer.parseInt(split[1]);
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
