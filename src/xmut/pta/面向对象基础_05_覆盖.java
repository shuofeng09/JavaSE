package xmut.pta;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-11-26 16:12
 */
public class 面向对象基础_05_覆盖 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Integer n1 = Integer.valueOf(sc.nextLine());
            PersonOverride[] persons1 = new PersonOverride[n1];
            for (Integer i = 0; i < n1; i++) {
                persons1[i] = new PersonOverride();
            }
            Integer n2 = Integer.valueOf(sc.nextLine());
            PersonOverride[] persons2 = new PersonOverride[n2];

        }
    }
}

class PersonOverride {
    private String name;
    private int age;
    private boolean gender;


    public PersonOverride(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public PersonOverride() {
        this("default", 1, true);
    }


    @Override
    public String toString() {
        return name + "-" + age + "-" + gender;
    }

    @Override
    public boolean equals(Object obj) {
        PersonOverride o = (PersonOverride) obj;
        return o.gender == this.gender && o.age == this.age && o.name.equals(this.name);
    }
}

