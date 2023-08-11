package reflect;

import reflect.pojo.User;

/**
 * @author 朔风
 * @date 2023-08-11 23:03
 */
@SuppressWarnings("all")
public class _5_获取父类和接口 {

    public static void main(String[] args) {
        Class<User> userClass = User.class;
        // 1.获取User类的父类
        Class<? super User> superclass = userClass.getSuperclass();
        System.out.println("父类=" + superclass.getName());
        // 2.获取接口
        Class<?>[] interfaces = userClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口=" + anInterface.getName());
        }
    }

}
