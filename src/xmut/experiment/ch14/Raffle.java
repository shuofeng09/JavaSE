package xmut.experiment.ch14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 朔风
 * @date 2023-12-21 23:20
 */
public class Raffle {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 588, 888, 1000, 10000);
        Collections.shuffle(list);
        for (Integer reward : list) {
            System.out.println(reward+"元的奖金被抽出");
        }

    }
}
