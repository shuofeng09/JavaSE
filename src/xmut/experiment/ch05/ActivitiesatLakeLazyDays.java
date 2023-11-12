package xmut.experiment.ch05;

import java.util.Scanner;

public class ActivitiesatLakeLazyDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个气温：");
        while (sc.hasNextLine()) {
            int temperature = Integer.parseInt(sc.nextLine());
            if (temperature >= 80 && temperature < 95) {
                System.out.println("swimming");
            } else if (temperature >= 60 && temperature < 80) {
                System.out.println("tennis");
            } else if (temperature >= 40 && temperature < 60) {
                System.out.println("golf");
            } else if (temperature < 40 && temperature >= 20) {
                System.out.println("skiing");
            } else {
                System.out.println("Visit our shops!");
            }
            System.out.println("输入一个气温：");
        }
    }
}
