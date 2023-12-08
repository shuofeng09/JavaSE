package xmut.experiment.ch12;

/**
 * @author 朔风
 * @date 2023-12-08 10:42
 */
interface Shape {
    double area();

}

class Triangle implements Shape {

    private int width;

    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return (width * height) / 2.0;
    }
}

class Rectangle implements Shape {

    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class ShapeTest {

    public static void showArea(Shape shape) {
        System.out.println("area=" + shape.area());
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 3);
        Rectangle rectangle = new Rectangle(2, 4);
        showArea(triangle);
        showArea(rectangle);

    }

}

