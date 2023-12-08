package xmut.experiment.ch11;

import java.util.Map;

/**
 * @author 朔风
 * @date 2023-12-01 11:15
 */
abstract class Shape {

    public abstract void getArea();

    public abstract void getPerimeter();


}

class Triangle extends Shape {

    private double a;
    private double b;
    private double c;


    public Triangle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void getArea() {
        double p = (a + b + c) / 2;
        System.out.println("三角形的面积为：" + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    @Override
    public void getPerimeter() {
        System.out.println("三角形的周长为：" + (a + b + c));
    }
}

class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println("矩形面积为：" + width * height);
    }

    @Override
    public void getPerimeter() {
        System.out.println("矩形的周长为：" + (2 * width + 2 * height));
    }
}

class Circular extends Shape {

    private double radius;

    public Circular() {
    }

    public Circular(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("圆形的面积为：" + Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void getPerimeter() {
        System.out.println("圆形的周长为：" + 2 * Math.PI * radius);
    }
}

public class TestShape {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2, 3);
        rectangle.getArea();
        rectangle.getPerimeter();

        Shape circular = new Circular(1);
        circular.getArea();
        circular.getPerimeter();

        Shape triangle = new Triangle(3, 4, 5);
        triangle.getArea();
        triangle.getPerimeter();
    }

}