package xmut.pta;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 朔风
 * @date 2023-11-10 11:42
 */
public class 统计一篇英文文章中出现的不重复单词的个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";
        Set<String> strings = new HashSet<>();
        while (sc.hasNextLine()) {
            String next = sc.nextLine();
            if (next.equals("!!!!!")) {
                String[] split = text.split("\\s+");
                for (String s : split) {
                    strings.add(s.toLowerCase());
                }
                System.out.println(strings.size());
            } else {
                text += next + " ";
            }
        }
    }
}
