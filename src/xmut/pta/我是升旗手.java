package xmut.pta;

import java.util.Scanner;

public class 我是升旗手 {
    //输入包括两行。 第一行:包括一个整数n，表示班级里共有n位同学。 第二行:包含n个三位数，表示每一位同学的身高。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String num = sc.nextLine();
            String[] students = sc.nextLine().split("\\s+");
            int height = 0;
            for (String student : students) {
                int parseInt = Integer.parseInt(student);
                if (parseInt > height) {
                    height = parseInt;
                }
            }
            System.out.println(height);
        }
    }
}
