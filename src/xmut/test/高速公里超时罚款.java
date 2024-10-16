package xmut.test;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-28 00:34
 */
public class 高速公里超时罚款 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            double speed = sc.nextDouble();
            double limit = sc.nextDouble();
            // 速度小于等于限速
            if (speed <= limit) {
                System.out.println("OK");
                continue;
            }
            // 超时比例
            double per = (speed - limit) / limit;


            if (per < 0.1) {
                System.out.println("OK");
            } else if (per < 0.5) {
                System.out.println("Exceed " + (int) (per * 100) + "%. Ticket 200");
            } else {
                System.out.println("Exceed " + (int) (per * 100) + "%. License Revoked");

            }
        }


    }
}
