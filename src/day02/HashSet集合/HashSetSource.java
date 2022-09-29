package day02.HashSet集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * @author 朔风
 * @createTime 2022-08-30 20:47
 */
@SuppressWarnings("all")
public class HashSetSource {
    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put(1,"1");
        map.put(2,"2");
        map.put(3,"3");



        Set set = map.entrySet();
        System.out.println(set.size());
        System.out.println(set);

//        for (int i = 1; i <= 200; i++) {
//            map.put(Math.PI, "xz");
//        }
//
//        map.put("001", "xj");


        System.out.println(map);


    }
}
