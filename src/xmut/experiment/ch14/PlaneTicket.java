package xmut.experiment.ch14;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-21 22:09
 */
public class PlaneTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入机票原价");
        do {
            int amount = Integer.parseInt(scanner.nextLine());
            System.out.println("输入月份");
            int month = Integer.parseInt(scanner.nextLine());
            System.out.println("输入0则为头等舱 1则为经济舱");
            String flags = scanner.nextLine();
            if (flags.equals("0")) {
                if (month >= 5 && month <= 10) {
                    System.out.println("旺季");
                    System.out.println("头等舱价格为" + amount * 0.9);
                } else {
                    System.out.println("淡季");
                    System.out.println("头等舱价格为" + amount * 0.7);
                }
            } else {
                if (month >= 5 && month <= 10) {
                    System.out.println("旺季");
                    System.out.println("经济舱价格为" + amount * 0.85);
                } else {
                    System.out.println("淡季");
                    System.out.println("经济舱价格为" + amount * 0.65);
                }
            }
            System.out.println("输入机票原价");
        } while (scanner.hasNext());
    }
}
