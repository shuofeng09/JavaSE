package xmut.pta;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-09-21 23:12
 */
public class 读中国载人航天史_汇航天员数量_向航天员致敬1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.equals("end")) {
                break;
            } else {
                String[] names = line.split(" ");
                for (String name : names) {
                    map.put(name, map.get(name) == null ? 1 : map.get(name) + 1);
                }
            }
        }
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
