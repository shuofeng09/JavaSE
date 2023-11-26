package xmut.pta;

import java.util.Arrays;
import java.util.Scanner;

public class 形状 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            Rectangle[] rectangles = new Rectangle[2];
            Circle[] circles = new Circle[2];

            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i < rectangles.length; i++) {
                String[] split1 = sc.nextLine().split("\\s+");
                rectangles[i] = new Rectangle(Integer.parseInt(split1[0]), Integer.parseInt(split1[1]));
                sum1 += rectangles[i].getPerimeter();
                sum2 += rectangles[i].getArea();
            }

            for (int i = 0; i < circles.length; i++) {
                String line = sc.nextLine();
                circles[i] = new Circle(Integer.parseInt(line));
                sum1 += circles[i].getPerimeter();
                sum2 += circles[i].getArea();
            }

            System.out.println(sum2);
            System.out.println(sum1);
            System.out.println(Arrays.deepToString(rectangles));
            System.out.println(Arrays.deepToString(circles));


        }
    }
}

class Circle1 {
    private int radius;

    public Circle1(int radius) {
        this.radius = radius;
    }

    public int getArea() {
        return (int) (Math.PI * 2 * radius);
    }

    public int getPerimeter() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                ']';
    }
}

class Rectangle1 {
    private int width;
    private int length;

    public Rectangle1(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getArea() {
        return 2 * (width + length);
    }

    public int getPerimeter() {
        return width * length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle [" +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}
