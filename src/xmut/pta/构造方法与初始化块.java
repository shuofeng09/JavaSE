package xmut.pta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 构造方法与初始化块 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine());
            List<Person> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] infos = sc.nextLine().split("\\s+");
                list.add(new Person(infos[0], Integer.parseInt(infos[1]), Boolean.parseBoolean(infos[2])));

            }

            list.stream().sorted((o1, o2) -> -1).forEach(System.out::println);
            Person person = new Person();
            System.out.println(person);
        }
    }


}

