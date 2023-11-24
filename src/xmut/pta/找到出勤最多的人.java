package xmut.pta;

import java.util.*;

/**
 * @author 朔风
 * @date 2023-11-12 10:38
 */
public class 找到出勤最多的人 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        while (sc.hasNextLine()) {
            String[] split = sc.nextLine().split("\\s+");
            for (String s : split) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
            int max = 0;
            String k = "";
            for (String key : map.keySet()) {
                Integer integer = map.get(key);
                if (integer > max) {
                    max = integer;
                    k = key;
                }
            }
            System.out.println(k);

        }
    }
}
