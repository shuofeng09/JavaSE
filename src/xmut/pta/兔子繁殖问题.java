package xmut.pta;

import java.util.Scanner;

public class 兔子繁殖问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int mouth = Integer.parseInt(sc.nextLine());
            int sum = func(mouth);
            System.out.println(sum);
        }
    }

    private static int func(int mouth) {
        if (mouth == 0) {
            return 0;
        }
        if (mouth == 1) {
            return 1;
        }
        if (mouth == 2) {
            return 2;
        }
        return func(mouth - 1) + func(mouth - 2);
    }

}
