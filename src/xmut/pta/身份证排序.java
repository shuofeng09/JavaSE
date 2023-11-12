package xmut.pta;

import java.util.*;

public class 身份证排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine());
            List<String> idCards = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                idCards.add(sc.nextLine().trim());
            }
            while (sc.hasNextLine()) {
                String tag = sc.nextLine();
                switch (tag) {
                    case "sort1":
                        sort1(idCards);
                        break;
                    case "sort2":
                        sort2(idCards);
                        break;
                    default:
                        System.out.println("exit");
                        return;
                }
            }
        }


    }

    private static void sort2(List<String> idCards) {
        idCards.stream()
                .sorted((o1, o2) -> {
                    o1 = o1.substring(6, 14);
                    o2 = o2.substring(6, 14);
                    return o1.compareTo(o2);
                })
                .forEach(System.out::println);
    }

    private static void sort1(List<String> idCards) {
        idCards.stream()
                .map(s -> {
                    String newStr = s.substring(6, 14);
                    String year = newStr.substring(0, 4);
                    String mouth = newStr.substring(4, 6);
                    String date = newStr.substring(6);
                    return String.format("%s-%s-%s", year, mouth, date);
                })
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }
}

