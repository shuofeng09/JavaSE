package xmut.experiment.ch2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("Please enter a value for the radius！");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            // 1.定义PI常量
            final double PI = 3.14159;
            // 2.读取一行输入为整型
            int radius = sc.nextInt();
            // 3.计算圆的面积和周长
            double area = PI * radius * radius;
            int length = (int) (2 * PI * radius);
            System.out.println("The area of a circle with radius "
                    + radius
                    + " is "
                    + area);
            System.out.println("length: " + length);
            // 4.假设半径翻倍
            int newRadius = radius * 2;
            // 5.再次计算圆的面积和周长
            double newArea = PI * newRadius * newRadius;
            int newLength = (int) (2 * PI * newRadius);
            System.out.println("The area of a new circle with radius "
                    + newRadius
                    + " is "
                    + newArea);
            System.out.println("newLength: " + newLength);

        }
    }
}
