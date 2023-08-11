package day03.annotation;

/**
 * @author 朔风
 * @date 2023-08-11 12:22
 */
@MyAnnotation
public class DemoAnnotation {
    @MyAnnotation(value = "demo annotation",age = 20)
    public void demo() {
        System.out.println("demo ...");
    }
}
