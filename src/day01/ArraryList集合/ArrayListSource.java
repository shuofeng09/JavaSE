package day01.ArraryList集合;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 朔风
 * @createTime 2022-08-31 15:58
 */
@SuppressWarnings("all")
public class ArrayListSource {
    public static void main(String[] s) throws NoSuchMethodException {
        Collection collection = new LinkedList();
        collection.add("1");
        collection.add("2");
        collection.add("3");

        Class c = collection.getClass();

        Field[] fields = c.getDeclaredFields();
        for (Object obj : fields) {
            System.out.println(obj);
        }

        Runtime runtime = Runtime.getRuntime();

        Object obj = "123";

        String msg = (String) obj;
        String msg1 = "23";

        String s1 = "123";


        ArrayList list = new ArrayList();

        list.add("4");
        list.add("5");
        list.add("6");


        System.out.println(list);

    }


    public static native void hello();
}
