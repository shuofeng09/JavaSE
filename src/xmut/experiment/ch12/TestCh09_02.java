package xmut.experiment.ch12;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

/**
 * @author 朔风
 * @date 2023-12-08 10:52
 */
public class TestCh09_02 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.useCal(new AddCalculator(), 1, 2);
        computer.useCal(new MinusCalculator(), 6, 1);
        computer.useCal(new MultiplyCalculator(), 3, 3);
        computer.useCal(new DivideCalculator(), 10, 5);
    }
}

interface Calculator {
    int computer(int n, int m);

}

class AddCalculator implements Calculator {

    @Override
    public int computer(int n, int m) {
        return n + m;
    }
}

class MinusCalculator implements Calculator {

    @Override
    public int computer(int n, int m) {
        return n - m;
    }
}

class DivideCalculator implements Calculator {

    @Override
    public int computer(int n, int m) {
        return n / m;
    }
}

class MultiplyCalculator implements Calculator {

    @Override
    public int computer(int n, int m) {
        return n * m;
    }
}

class Computer {
    public void useCal(Calculator com, int op1, int op2) {
        int computer = com.computer(op1, op2);
        if (com instanceof AddCalculator) {
            System.out.printf("%d+%d和为：%d%n", op1, op2, computer);
        } else if (com instanceof MinusCalculator) {
            System.out.printf("%d-%d差为：%d%n", op1, op2, computer);
        } else if (com instanceof MultiplyCalculator) {
            System.out.printf("%d*%d乘积为：%d%n", op1, op2, computer);
        } else if (com instanceof DivideCalculator) {
            System.out.printf("%d/%d商为：%d%n", op1, op2, computer);
        }
    }


}