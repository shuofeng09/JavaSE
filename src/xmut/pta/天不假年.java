package xmut.pta;

import java.util.Scanner;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-05 22:36
 */
public class 天不假年 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        age = in.nextInt();
        Person_ p = new Person_(age);
        age = in.nextInt();
        try {
            p.setAge(age);
        } catch (AgeException e) {
            System.out.println("B");
            return;
        }
        System.out.println("A");
    }
}

class Person_ {
    int age;

    public Person_(int age) {
        this.age = age;
    }

    public void setAge(int age) throws AgeException {
        if (this.age <= age) {
            this.age = age;
        } else {
            throw new AgeException();
        }
    }
}

class AgeException extends Exception {
}