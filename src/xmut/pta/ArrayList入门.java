package xmut.pta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-11-10 10:52
 */
public class ArrayList入门 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<>();
        while (true) {
            String str = scanner.next();
            if (str.equals("!!end!!")) {
                break;
            }
            strList.add(str);
        }
        strList.add(0, "begin");
        strList.add("end");
        System.out.println(strList);


        String str = scanner.next();
        if (strList.contains(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(strList.indexOf(str));
        boolean flag = true;
        for (int i = strList.size() - 1; i >= 0; i--) {
            if (strList.get(i).equals(str)) {
                System.out.println(i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("-1");
        }
        System.out.println(strList.get(0));
        strList.remove(0);
        System.out.println(strList);


        str = scanner.next();
        strList.set(1, str);
        System.out.println(strList);

        str = scanner.next();
        ArrayList<String> strList1 = new ArrayList<>();
        for (String s : strList) {
            if (s.contains(str)) {
                strList1.add(s);
            }
        }
        System.out.println(strList1);
        for (String s : strList) {
            if (s.equals(str)) {
                strList.remove(str);
                break;
            }
        }
        System.out.println(strList);
        strList.clear();
        System.out.println(strList + "," + strList.size() + "," + strList.isEmpty());
    }
}
