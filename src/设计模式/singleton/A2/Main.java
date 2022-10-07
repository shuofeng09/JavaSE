package 设计模式.singleton.A2;

/**
 * @author 朔风
 * @createTime 2022-10-05 15:23
 */
public class Main {
    public static void main(String[] args) {
        Triple t0 = Triple.getInstance(0);
        Triple t1 = Triple.getInstance(1);
        Triple t2 = Triple.getInstance(2);
        System.out.println(t0);
        System.out.println(t1);
        System.out.println(t2);

    }
}
