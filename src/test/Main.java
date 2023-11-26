package test;

/**
 * @author 朔风
 * @date 2023-11-26 15:02
 */

interface Person {
    public void eat();
}

public class Main {
    public static void main(String[] arg) {

        Person p = new Person() {
            public void eat() {
                System.out.println("eat something");
            }
        };
        p.eat();

        int a = Integer.parseInt("1");

        Integer b = 2;


    }
}