package xmut.experiment.ch04;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        double side1, side2;
        double hypotenuse;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the lengths of the two sides of " +
                "a right triangle (separate by a blank space): ");
        // 读取一行
        String[] split = sc.nextLine().split("\\s+");
        side1 = Double.parseDouble(split[0]);
        side2 = Double.parseDouble(split[1]);

        // compute the length of the hypotenuse
        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("Length of the hypotenuse: " + hypotenuse);

    }
}
