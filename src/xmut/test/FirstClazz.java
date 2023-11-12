package xmut.test;

/**
 * @author 朔风
 * @date 2023-09-12 20:27
 */
public class FirstClazz {
    static char c;


    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = (a && b) && (!b);
        boolean result = (a & b) & (!b);
        System.out.println(c +""+result);

        String adfa = "adfa";
        adfa += "ad";
        int adf='a';

    }

}
