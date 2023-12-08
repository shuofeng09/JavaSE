package xmut.pta;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-05 22:41
 */
public class 成绩录入时的及格与不及格人数统计 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int p = 0;
        int up = 0;
        while (sc.hasNextLine()) {
            Integer num = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < num; i++) {
                int score = Integer.parseInt(sc.nextLine());
                if (score > 100 || score < 0) {
                    System.out.println(score + "invalid!");
                    i--;
                    continue;
                }
                if (score >= 60) {
                    p++;
                } else {
                    up++;
                }
            }
            System.out.println(p);
            System.out.println(up);

        }


    }
}

class EEException extends Exception {

}
