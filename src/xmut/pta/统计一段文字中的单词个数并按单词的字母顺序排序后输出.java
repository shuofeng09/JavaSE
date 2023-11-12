package xmut.pta;

import java.util.*;

/**
 * @author 朔风
 * @date 2023-11-10 10:59
 */
public class 统计一段文字中的单词个数并按单词的字母顺序排序后输出 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String text = "";
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("!!!!!")) {
                String[] split = text.split("\\s+");
                for (String s : split) {
                    map.put(s, map.getOrDefault(s, 0) + 1);
                }
                System.out.println(map.size());
                Set<String> strings = map.keySet();
                if (strings.size() < 10) {
                    strings.stream().sorted(String::compareTo).forEach(System.out::println);
                } else {
                    strings.stream().sorted(String::compareTo).limit(10).forEach(System.out::println);
                }
            } else {
                text += line+" ";
            }
        }
    }
}
