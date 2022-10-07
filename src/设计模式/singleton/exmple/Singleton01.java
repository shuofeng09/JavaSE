package 设计模式.singleton.exmple;

/**
 * @author 朔风
 * @createTime 2022-10-05 14:43
 */
//饥饿加载单例模式
public class Singleton01 {
    private static Singleton01 singleton = new Singleton01();

    private Singleton01() {
        System.out.println("饥饿加载单例模式");
    }

    public static Singleton01 getInstance() {
        return singleton;
    }

}
