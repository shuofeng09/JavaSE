package reflect;

import reflect.pojo.User;

import java.lang.reflect.Method;

/**
 * @author 朔风
 * @date 2023-08-11 17:21
 */
@SuppressWarnings("all")
public class _4_获取成员方法 {

    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;
        // 1.获取全部方法
        // 1.1 getDeclaredMethods获取的方法不包括父类方法
        Method[] methods1 = userClass.getDeclaredMethods();
        // 1.2 getMethods获取的方法包括父类方法但是都属于公有方法
        Method[] methods2 = userClass.getMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
        System.out.println("=========================");
        for (Method method : methods2) {
            System.out.println(method);
        }
        // 2.获取某个方法
        Method method1 = userClass.getDeclaredMethod("method1", String.class);
        Method method2 = userClass.getDeclaredMethod("method2");
//        Method method3 = userClass.getMethod("method3", int.class);
//        Method method4 = userClass.getMethod("method4");

        User user = new User();
        System.out.println(method1.invoke(user, "jack"));


    }

}
