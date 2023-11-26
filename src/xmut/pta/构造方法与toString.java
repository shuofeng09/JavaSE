package xmut.pta;

import java.util.*;

class Person1 {
    private String name;
    private int age;
    private boolean gender;
    private int id;

    static int count;

    {
        System.out.println("This is initialization block, id is " + count);
        id = count;
        count += 1;
    }

    static {
        System.out.println("This is static initialization block");
    }

    public Person1() {
        System.out.println("This is constructor");
        System.out.println(name + "," + age + "," + gender + "," + id);
    }

    public Person1(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [" +
                "name=" + name +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ']';
    }
}

public class 构造方法与toString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine());
            List<Person1> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] infos = sc.nextLine().split("\\s+");
                list.add(new Person1(infos[0], Integer.parseInt(infos[1]), Boolean.parseBoolean(infos[2])));

            }

            list.stream().sorted((o1, o2) -> -1).forEach(System.out::println);
            Person1 person = new Person1();
            System.out.println(person);
        }
    }
}
