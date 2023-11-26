package test;

/**
 * @author 朔风
 * @date 2023-11-26 15:25
 */
public abstract interface C {

    public static final  String name = "123";

    default void Hee() {
        System.out.println("heee");
    }
}
