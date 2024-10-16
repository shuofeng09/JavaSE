package xmut.test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 朔风
 * @date 2023-12-25 14:20
 */
public class 找到出勤最多的人1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        while (sc.hasNextLine()) {
            String[] split = sc.nextLine().split(" ");
            for (String name : split) {
                int count = map.getOrDefault(name, 0) + 1;
                map.put(name, count);
            }
            int max = 0;
            String key = "";
            Set<String> names = map.keySet();
            for (String name : names) {
                Integer count = map.get(name);
                if (count > max) {
                    max = count;
                    key = name;
                }
            }
            System.out.println(key);

        }
    }
}
