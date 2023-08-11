package reflect;

import reflect.pojo.User;

import java.lang.reflect.Constructor;

/**
 * @author 朔风
 * @date 2023-08-11 16:26
 */
@SuppressWarnings("all")
public class _2_获取构造器对象 {
    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;
        // 1.通过getDeclaredConstructor获取
        Constructor<User> constructor1 = userClass.getDeclaredConstructor(null);
        // 2.通过getConstructor获取
        Constructor<User> constructor2 = userClass.getConstructor(null);
        // 3.获取全部构造器
        Constructor<?>[] constructors1 = userClass.getConstructors();
        Constructor<?>[] constructors2 = userClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors1) {
            System.out.println(constructor);
            // public reflect.pojo.User()
            // public reflect.pojo.User(java.lang.String,java.lang.Integer)
        }

        User user = constructor1.newInstance();
        constructor2.setAccessible(false);
        user.setAge(18);
        user.setName("jack");
        System.out.println(user);   // User{name='jack', age=18}

    }
}
