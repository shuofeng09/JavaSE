package xmut.experiment.ch09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author 朔风
 * @date 2023-11-24 11:36
 */
public class RandomNumber {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] >= 10) {
                list.add(array[i]);
            }
        }
        System.out.println("原有数组：" + Arrays.toString(array));
        System.out.println("大于10的数字：" + list);

    }
}
