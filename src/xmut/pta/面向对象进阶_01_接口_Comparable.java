package xmut.pta;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.ToIntFunction;

/**
 * @author 朔风
 * @date 2023-11-26 17:09
 */
public class 面向对象进阶_01_接口_Comparable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Integer n = Integer.valueOf(sc.nextLine());
            PersonSortable[] personSortables = new PersonSortable[n];
            for (Integer i = 0; i < n; i++) {
                String line = sc.nextLine();
                String[] split = line.split("\\s+");
                personSortables[i] = new PersonSortable(split[0], Integer.parseInt(split[1]));
            }
            Arrays.sort(personSortables);
            for (PersonSortable personSortable : personSortables) {
                System.out.println(personSortable);
            }
            System.out.println(Arrays.toString(PersonSortable.class.getInterfaces()));
        }
    }
}

class PersonSortable implements Comparable {
    private String name;
    private int age;

    public PersonSortable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "-" + age;
    }


    @Override
    public int compareTo(@NotNull Object o) {
        PersonSortable obj = (PersonSortable) o;
        int r1 = this.name.compareTo(obj.name);
        if (r1 != 0) {
            return r1;
        } else {
            return Integer.compare(this.age, obj.age);
        }
    }
}
