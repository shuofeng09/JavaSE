package xmut.pta;

import java.util.Scanner;

public class 判断回文2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            StringBuilder stringBuffer = new StringBuilder(line);
            String str = stringBuffer.reverse().toString();
            if (line.equals(str)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
