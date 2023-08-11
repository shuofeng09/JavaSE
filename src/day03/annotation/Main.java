package day03.annotation;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author 朔风
 * @date 2023-08-11 12:21
 */
public class Main {

    @Test
    public void test01() throws NoSuchMethodException {
        Class<DemoAnnotation> c = DemoAnnotation.class;
        // 判断该类是否存在MyAnnotation注解
        if (c.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = c.getDeclaredAnnotation(MyAnnotation.class);
            System.out.println("value: " + annotation.value());
            System.out.println("age: " + annotation.age());
        }
        // 判断方法上是否存在MyAnnotation注解
        Method method = c.getMethod("demo");
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("value: " + annotation.value());
            System.out.println("age: " + annotation.age());
        }


    }
}
