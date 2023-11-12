package xmut.pta;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-09-21 22:05
 */
public class 图书价格汇总2 {
    //    Java程序设计：34 ；Web程序设计： 56；JSP程序设计：20
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] items = line.trim().split("；");
            for (String item : items) {
                String[] book = item.trim().split("：");
                map.put(book[0].trim(), Integer.valueOf(book[1].trim()));
            }
            Integer sum = 0;
            for (String key : map.keySet()) {
                Integer price = map.get(key);
                sum += price;
                System.out.println(key + "--" + price);
            }

            System.out.println("总价格--" + sum);
        }
    }
}
