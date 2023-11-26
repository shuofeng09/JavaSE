
import java.util.HashMap;
import java.util.Map;

/**
 * @author 朔风
 * @date 2023-11-24 20:41
 */
public class CalculateNum {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : args) {
            Integer num = Integer.valueOf(s);
            if (num < 0 || num > 49) {
                System.out.println("只允许0-49范围的整数");
                return;
            }
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String key : map.keySet()) {
            System.out.printf("%s出现了%s次%n", key, map.get(key));
        }
    }
}
