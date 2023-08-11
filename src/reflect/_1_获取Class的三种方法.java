package reflect;

import reflect.pojo.User;

/**
 * @author 朔风
 * @date 2023-08-11 16:17
 */
@SuppressWarnings("all")
public class _1_获取Class的三种方法 {

    public static void main(String[] args) throws Exception {
        // 1.通过对象获取
        User user = new User();
        Class<? extends User> userClass1 = user.getClass();

        // 2.通过字节码文件获取
        Class<User> userClass2 = User.class;

        // 3.通过Class静态方法获取
        Class<?> userClass3 = Class.forName("reflect.pojo.User");

        System.out.println(userClass1 == userClass2);   // true
        System.out.println(userClass2 == userClass3);   // true

    }
}
