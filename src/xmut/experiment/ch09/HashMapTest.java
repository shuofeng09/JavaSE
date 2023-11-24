package xmut.experiment.ch09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-11-24 11:42
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "德国");
        map.put(2018, "法国");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        while (sc.hasNext()) {
            String year = sc.nextLine();
            String county = map.get(Integer.parseInt(year));
            if (Objects.nonNull(county)) {
                System.out.printf("%s年获得世界杯冠军的是：%s%n", year, county);
            } else {
                System.out.println("没有举办世界杯");
            }
            System.out.println("请输入国家名称：");
            String countyName = sc.nextLine();
            for (Integer key : map.keySet()) {
                if (map.get(key).equals(countyName)) {
                    System.out.println(key + "年");
                }
            }

        }

    }
}
