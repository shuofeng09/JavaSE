package xmut.pta;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-09-21 21:54
 */
public class 识蛟龙号载人深潜_立科技报国志 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            if (!line.equals("end")) {
                char[] chars = line.toCharArray();
                int sum = 0;
                for (char c : chars) {
                    if (c >= 48 && c <= 57) {
                        sum = sum + Integer.parseInt(String.valueOf(c));
                    }
                }
                System.out.println(sum);

            }else {
                break;
            }
        }
    }
}
