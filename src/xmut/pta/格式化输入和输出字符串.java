package xmut.pta;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-09-21 21:14
 */
public class 格式化输入和输出字符串 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            System.out.println("choice=" + line);
            if (line.equals("double")) {
                String str = in.nextLine();
                String[] nums = str.split(" ");
                System.out.printf("%5.2f,%5.2f,%5.2f\n",
                        Double.valueOf(nums[0]),
                        Double.valueOf(nums[1]),
                        Double.valueOf(nums[2]));
            } else if (line.equals("int")) {
                String str = in.nextLine();
                String[] nums = str.trim().split("\\s+");
                int sum = 0;
                for (String num : nums) {
                    sum += Integer.parseInt(num);
                }
                System.out.println(sum);
            } else if (line.equals("str")) {
                String str = in.nextLine();
                String[] strings = str.trim().split(" ");
                String result = "";
                for (int i = strings.length - 1; i >= 0; i--) {
                    result += strings[i];
                }
                System.out.println(result);
            } else if (line.equals("line")) {
                String str = in.nextLine();
                String s = str.trim().toUpperCase();
                System.out.println(s);
            } else {
                System.out.println("other");
            }
        }
    }

}
