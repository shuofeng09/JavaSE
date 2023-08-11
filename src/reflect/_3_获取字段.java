package reflect;

import reflect.pojo.User;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author 朔风
 * @date 2023-08-11 16:49
 */
@SuppressWarnings("all")
public class _3_获取字段 {

    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;
        // 1.获取全部字段
        Field[] declaredFields1 = userClass.getDeclaredFields();
        Field[] declaredFields2 = userClass.getFields();
        for (Field field : declaredFields1) {
            System.out.println(field);
//            java.lang.String reflect.pojo.User.name
//            java.lang.Integer reflect.pojo.User.age
//            java.lang.String reflect.pojo.User.sex
        }
        // 2.获取某个字段
        User user = new User();
        Field name = userClass.getDeclaredField("name");
        // 打破封装
        name.setAccessible(true);
        name.set(user, "jack");
        // 读取user对象name字段的值
        System.out.println("字段值=" + name.get(user));    // 字段值=jack
        System.out.println("属性名=" + name.getName());    // 属性名=name
        System.out.println("字段属性=" + name.getType());   // 字段属性=class java.lang.String
        System.out.println("字段访问权限=" + Modifier.toString(name.getModifiers()));   // 字段访问权限=private

    }

}
