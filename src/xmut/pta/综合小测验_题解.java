package xmut.pta;

import java.util.Arrays;
import java.util.Scanner;


public class 综合小测验_题解 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        String[] strDigits;
        int[] digits = null;
        while (sc.hasNextLine()) {
            choice = sc.nextLine();
            switch (choice) {
                case "fib":
                    int n = Integer.parseInt(sc.nextLine());
                    fib(n);
                    break;
                case "sort":
                    String line = sc.nextLine();
                    strDigits = line.split(" ");
                    digits = convertToIntDigits(strDigits);
                    Arrays.sort(digits);
                    System.out.println(Arrays.toString(digits));
                    break;
                case "search":
                    Arrays.sort(digits);
                    int digit = Integer.parseInt(sc.nextLine());
                    int pos = Arrays.binarySearch(digits, digit);
                    if (pos < 0)
                        System.out.println(-1);
                    else
                        System.out.println(pos);
                    break;
                case "getBirthDate":
                    int x = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < x; i++) {
                        String id = sc.nextLine();
                        System.out.println(getBirthDate(id));
                    }
                    break;
                default:
                    System.out.println("exit");
                    return;
            }

        }

    }

    public static String getBirthDate(String id) {
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        return year + "-" + month + "-" + day;
    }

    private static int[] convertToIntDigits(String[] strDigits) {
        int[] digits = new int[strDigits.length];
        for (int i = 0; i < strDigits.length; i++) {
            digits[i] = Integer.parseInt(strDigits[i]);
        }
        return digits;
    }

    private static void fib(int n) {
        int a = 1, b = 1;
        for (int i = 1; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);

    }

}
