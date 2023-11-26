package xmut.pta;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-11-26 17:23
 */
public class 面向对象进阶_02_接口_Comparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Integer n = Integer.valueOf(sc.nextLine());
            PersonSortable2[] personSortable2s = new PersonSortable2[n];
            for (Integer i = 0; i < n; i++) {
                String[] split = sc.nextLine().split("\\s+");
                personSortable2s[i] = new PersonSortable2(split[0], Integer.parseInt(split[1]));
            }
            Arrays.sort(personSortable2s, new NameComparator());
            Arrays.stream(personSortable2s).forEach(System.out::println);
            Arrays.sort(personSortable2s, new AgeComparator());
            Arrays.stream(personSortable2s).forEach(System.out::println);
            System.out.println(Arrays.toString(NameComparator.class.getInterfaces()));
            System.out.println(Arrays.toString(AgeComparator.class.getInterfaces()));

        }
    }
}


class PersonSortable2 {

    String name;
    int age;

    public PersonSortable2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "-" + age;
    }

}

class NameComparator implements Comparator<PersonSortable2> {
    public NameComparator() {
        System.out.println("NameComparator:sort");
    }

    @Override
    public int compare(PersonSortable2 o1, PersonSortable2 o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AgeComparator implements Comparator<PersonSortable2> {

    public AgeComparator() {
        System.out.println("AgeComparator:sort");
    }

    @Override
    public int compare(PersonSortable2 o1, PersonSortable2 o2) {
        return Integer.compare(o1.age, o2.age);
    }
}


