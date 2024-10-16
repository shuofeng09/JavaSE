package xmut.test;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-25 16:18
 */
public class throw与throws123 {
    public static void main(String[] args) throws NoSuchMethodException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] split1 = sc.nextLine().split(" ");
        double[] doubles = new double[n];
        for (int i = 0; i < n; i++) {
            doubles[i] = Double.parseDouble(split1[i]);
        }
        while (sc.hasNextLine()) {
            String[] split = sc.nextLine().split(" ");
            int begin = 0;
            int end = 0;
            try {
                begin = Integer.parseInt(split[0]);
                end = Integer.parseInt(split[1]);
            } catch (NumberFormatException e) {
                break;
            }
            try {
                double max = ArrayUtils.findMax(doubles, begin, end);
                System.out.println(max);
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }

        }
        System.out.println(ArrayUtils.class.getDeclaredMethod("findMax", double[].class, int.class, int.class));

    }
}

class ArrayUtils {
    public static double findMax(double[] arr, int begin, int end) {
        if (begin >= end) {
            throw new IllegalArgumentException("begin:" + begin + " >= end:" + end);
        } else if (begin < 0) {
            throw new IllegalArgumentException("begin:" + begin + " < 0");
        } else if (end > arr.length) {
            throw new IllegalArgumentException("end:" + end + " > arr.length");
        }
        double max = 0;
        for (int i = begin; i < end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}