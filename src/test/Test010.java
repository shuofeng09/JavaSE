package test;

import java.util.*;

/**
 * @author 朔风
 * @createTime 2022-08-07 17:07
 */
@SuppressWarnings("")
public class Test010 {
    public static void main(String[] args) {

        String o = args[0];
        String name;
        String defaultS = "为空";

        name = Objects.requireNonNullElse(o, defaultS);
        System.out.println(name);


    }


}
