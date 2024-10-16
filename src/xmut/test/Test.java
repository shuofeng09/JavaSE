package xmut.test;

class Dog {
}

class Cat implements BCD{
    @Override
    public void A() {

    }

    @Override
    public void B() {

    }
}

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome to Java");
            int i = 0;
            int y = 2 / i;
            System.out.println("Welcome to HTML");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("The finally clause is executed");
        }
    }
}

abstract class ABC implements BCD {

    public ABC() {
    }
}



interface BCD {
    void A();

    void B();
}