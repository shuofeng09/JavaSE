package xmut.pta;

import java.util.Scanner;

public class 西安距离 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String coordinate = sc.nextLine();
            String[] split = coordinate.split("\\s+");
            int[] ints = new int[4];
            for (int i = 0; i < split.length; i++) {
                ints[i] = Integer.parseInt(split[i]);
            }
            // 0->a 1->b 2->c 3->d
            int distance = Math.abs(ints[2] - ints[0]) + Math.abs(ints[3] - ints[1]);
            System.out.println(distance);
        }
    }
}
