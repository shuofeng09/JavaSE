package day04.record;

/**
 * @author 朔风
 * @createTime 2023-06-24 22:16
 */
public class RecordTest01 {


    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point.x() + " " + point.y());
    }

}

record Point(double x, double y) {

}
