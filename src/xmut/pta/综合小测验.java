package xmut.pta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-11-26 20:40
 */
public class 综合小测验 {


    private static int[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String tag = sc.nextLine();
            switch (tag) {
                case "fib":
                    int num = Integer.parseInt(sc.nextLine());
                    for (int i = 1; i <= num; i++) {
                        if (i == num) {
                            System.out.println(fib(i));
                        } else {
                            System.out.print(fib(i) + " ");
                        }
                    }
                    break;
                case "sort":
                    String line = sc.nextLine();
                    String[] split = line.split("\\s+");
                    nums = new int[split.length];
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = Integer.parseInt(split[i]);
                    }
                    Arrays.sort(nums);
                    System.out.println(Arrays.toString(nums));
                    break;
                case "search":
                    String key = sc.nextLine();
                    if (key == null || nums == null) {
                        System.out.println(-1);
                        break;
                    }
                    // 重点
                    Arrays.sort(nums);
                    int index = Arrays.binarySearch(nums, Integer.parseInt(key));
                    System.out.println(index >= 0 ? index : -1);
                    break;
                case "getBirthDate":
                    int n = Integer.parseInt(sc.nextLine());
                    ArrayList<String> ids = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        ids.add(sc.nextLine());
                    }
                    ids.stream().map(s -> {
                        String year = s.substring(6, 10);
                        String mouth = s.substring(10, 12);
                        String day = s.substring(12, 14);
                        return String.format("%s-%s-%s", year, mouth, day);
                    }).forEach(System.out::println);
                    break;
                default:
                    System.out.println("exit");
                    return;
            }
        }
    }

    private static int fib(Integer num) {
        if (num == 0 || num == 1 || num == 2) {
            return 1;
        }
        return fib(num - 2) + fib(num - 1);
    }
}


