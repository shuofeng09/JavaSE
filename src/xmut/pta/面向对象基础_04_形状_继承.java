package xmut.pta;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-11-26 15:42
 */
public class 面向对象基础_04_形状_继承 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Integer num = Integer.valueOf(sc.nextLine());
            Shape[] shapes = new Shape[num];
            for (Integer i = 0; i < num; i++) {
                String tag = sc.nextLine();
                switch (tag) {
                    case "rect":
                        String[] params = sc.nextLine().split("\\s+");
                        shapes[i] = new Rectangle(Integer.parseInt(params[0]), Integer.parseInt(params[1]));
                        break;
                    case "cir":
                        String r = sc.nextLine();
                        shapes[i] = new Circle(Integer.parseInt(r));
                        break;
                }
            }
            System.out.println(sumAllPerimeter(shapes));
            System.out.println(sumAllArea(shapes));
            System.out.println(Arrays.toString(shapes));
            for (Shape shape : shapes) {
                System.out.println("class "+shape.getClass().getSimpleName()+",class "+shape.getClass().getSuperclass().getSimpleName());
            }

        }
    }


    public static double sumAllArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                sum += r.getArea();
            } else if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                sum += c.getArea();
            }
        }

        return sum;
    }

    public static double sumAllPerimeter(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                sum += r.getPerimeter();
            } else if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                sum += c.getPerimeter();
            }
        }

        return sum;
    }

}

abstract class Shape {
    public static final double PI = 3.14;

    public abstract double getPerimeter();

    public abstract double getArea();

}

class Rectangle extends Shape {

    int width, length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }


    @Override
    public double getPerimeter() {
        return 2*width + 2*length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle [" +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                ']';
    }

}