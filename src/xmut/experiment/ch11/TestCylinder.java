package xmut.experiment.ch11;

/**
 * @author 朔风
 * @date 2023-12-01 11:36
 */
abstract class Point {

    protected double x;
    protected double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}

class Circle extends Point {
    protected double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.pow(r, 2) * Math.PI;
    }


}

class Cylinder extends Circle {
    protected double h;


    public Cylinder(double r) {
        super(r);
    }

    public Cylinder(double x, double y, double r) {
        super(x, y, r);
    }

    public Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getVolume() {
        return Math.pow(r, 2) * Math.PI * h;
    }
}

public class TestCylinder {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1, 1, 1, 1);
        System.out.println("轴心位置坐标：" + cylinder.getX() + " " + cylinder.getY());
        System.out.println("半径：" + cylinder.getR());
        System.out.println("高：" + cylinder.getH());
        System.out.println("体积：" + cylinder.getVolume());
    }
}


