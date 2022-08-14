package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 朔风
 * @createTime 2022-08-07 17:07
 */
@SuppressWarnings("")
public class Test010 {
    public static void main(String[] args) {
        int[] arr = new int[1];
        System.out.println(val());
        for (; ;) {
        }
    }

    public static int val() {
        int num = 5;
        try {
            num = num / 0;
        } catch (Exception e) {
            num = 10;
        } finally {
            num = 15;
        }
        return num;
    }
}
