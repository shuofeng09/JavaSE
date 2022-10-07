package 设计模式.singleton.exmple;

/**
 * @author 朔风
 * @createTime 2022-10-05 14:47
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start..");

        /*Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        Singleton01 s3 = Singleton01.getInstance();*/

        Singleton02 s1 = Singleton02.getInstance();
        Singleton02 s2 = Singleton02.getInstance();
        Singleton02 s3 = Singleton02.getInstance();


        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println("End..");
    }
}
