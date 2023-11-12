package xmut.experiment.ch2;

public class Expression {
    public static void main(String[] args) {
        int a = 3, b = 10, c = 7;
        double w = 12.9, y = 3.2;
        System.out.println("a + b * c = " + (a + b * c)); // 73
        System.out.println("a - b - c = " + (a - b - c)); // -14
        System.out.println("a / b = " + (a / b));     // 0
        System.out.println("b / a = " + (b / a));     // 3
        System.out.println("a - b / c = " + (a - b / c)); // 2
        System.out.println("w / y = " + (w / y));    // 4
        System.out.println("y / w = " + (y / w));    // 0.0
        System.out.println("a + w / b = " + (a + w / b));// 4
        System.out.println("a % b / y = " + (a % b / y));// 0.0
        System.out.println("b % a = " + (b % a));   // 1
        System.out.println("w % y = " + (w % y));   // 0.0
    }
}
