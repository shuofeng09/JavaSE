package xmut.homework;

/**
 * @author 朔风
 * @date 2023-09-12 21:18
 */
public class p45_2_2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j + "*" + i + "=" + (j * i)+" ");
            }
            System.out.println();
        }
    }
}
