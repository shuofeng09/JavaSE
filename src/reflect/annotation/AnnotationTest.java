package reflect.annotation;

import reflect.annotation.pojo.ColumnInfo;
import reflect.annotation.pojo.MethodInfo;
import reflect.annotation.pojo.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationTest {

    public static void main(String[] args) throws Exception {

        Class<Person> personClass = Person.class;
        // 获取当前类上的注解，不包括方法和字段
        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            // System.out.println(annotation);
        }

        // 获取类中的所有方法
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            // MethodInfo annotation = method.getAnnotation(MethodInfo.class);
            MethodInfo annotation = method.getDeclaredAnnotation(MethodInfo.class);

            System.out.println(annotation);
            System.out.println(annotation.info());
            System.out.println(annotation.value());
            System.out.println("==============");
        }


        // 获取指定字段
        // Field name = personClass.getDeclaredField("name");
        // // 获取该属性上的注解
        // ColumnInfo columnInfo = name.getDeclaredAnnotation(ColumnInfo.class);
        // System.out.println(columnInfo.columnName());
        // System.out.println(columnInfo.type());
        // System.out.println(columnInfo.length());

    }
}
