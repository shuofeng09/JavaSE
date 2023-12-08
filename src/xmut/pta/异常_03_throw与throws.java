package xmut.pta;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntConsumer;

/**
 * @author 朔风
 * @date 2023-12-05 22:49
 */
public class 异常_03_throw与throws {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        double[] array = new double[num];
        String[] split = sc.nextLine().split("\\s+");
        for (int i = 0; i < split.length; i++) {
            array[i] = Double.parseDouble(split[i]);
        }

        while (sc.hasNext()) {
            String line = sc.nextLine();
            if (line.equals("end")) {
                try {
                    System.out.println(ArrayUtils.class.getDeclaredMethod("findMax", double[].class, int.class, int.class));
                } catch (Exception e1) {
                }
                return;
            } else {
                String[] strings = line.split("\\s+");
                try {
                    System.out.println(ArrayUtils.findMax(array, Integer.parseInt(strings[0]), Integer.parseInt(strings[1])));
                } catch (IllegalArgumentException e) {
                    System.out.println(e);
                }

            }

        }


    }
}

class ArrayUtils {
    public static double findMax(double[] arr, int begin, int end) throws IllegalArgumentException {
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
