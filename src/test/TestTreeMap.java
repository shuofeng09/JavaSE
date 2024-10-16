package test;

import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("ba", "a");
        treeMap.put("12ca", "a");
        treeMap.put("op", "a");
        for (int i = 0; i < 10; i++) {
            System.out.println(treeMap);
        }
    }
}
