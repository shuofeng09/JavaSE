package xmut.test;

/**
 * @author 朔风
 * @date 2023-09-12 20:27
 */
public class FirstClazz {
    static char c;


    public static void main(String[] args) {
        System.out.println(c);
        System.out.println('\u0000');
        if (c == '\u0000') {
            System.out.println("yes");
        }
        int y = 2;
        int z = 3;
        int n = 4;

        System.out.println(n + -y * z / n);

        int a = 2;
        int b = 3;
        System.out.println(a % b * 4 % b);


    }

}
