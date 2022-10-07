package 设计模式.singleton.exmple;

/**
 * @author 朔风
 * @createTime 2022-10-05 14:51
 */
//懒加载单例模式
public class Singleton02 {

    private static Singleton02 singleton;

    private Singleton02() {
        System.out.println("懒加载单例模式");
    }

    public static synchronized Singleton02 getInstance() {
        if (singleton == null) {
            singleton = new Singleton02();
        }
        return singleton;
    }

}
