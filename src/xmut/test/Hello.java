package xmut.test;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-09-15 11:49
 */

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        fun(first);
        System.out.println();
        System.out.println();
        int second = sc.nextInt();
        fun(second);
    }

    public static void fun(int layer) {
        for (int i = 1; i <= layer; i++) {
            for (int j = 0; j < layer - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

class A{

}

class B{

}

class Hello{

}
