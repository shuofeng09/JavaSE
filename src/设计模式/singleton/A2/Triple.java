package 设计模式.singleton.A2;

import java.util.Arrays;

/**
 * @author 朔风
 * @createTime 2022-10-05 15:16
 */
public class Triple {

    private static Triple[] triples = new Triple[3];


    private Triple() {

    }

    public static Triple getInstance(int num) {
        if (triples[0] == null) {
            for (int i = 0; i < 3; i++) {
                triples[i] = new Triple();
            }
        }
        return triples[num];

    }


}
