package xmut.experiment.ch14;

import java.util.Random;

/**
 * @author 朔风
 * @date 2023-12-21 22:42
 */
public class Code {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(createCode());
        }
    }

    private static String createCode() {
        StringBuilder stringBuffer = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            if (i != 4) {
                int type = random.nextInt(2);
                switch (type) {
                    case 0:
                        stringBuffer.append((char) (random.nextInt(26) + 65));
                        break;
                    case 1:
                        stringBuffer.append((char) (random.nextInt(26) + 97));
                        break;
                }
            } else {
                stringBuffer.append(random.nextInt(10));
            }
        }
        return stringBuffer.toString();
    }
}
