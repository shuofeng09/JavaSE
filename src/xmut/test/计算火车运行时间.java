package xmut.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-27 23:05
 */
public class 计算火车运行时间 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        int hour = 0;
        // 先计算出分钟数，用开始分钟-结束分钟
        int mins = start % 100 - end % 100;
        // 如果分钟数大于0，那么就需要借位，证明小时数需要减1
        if (mins > 0) {
            // 小时数=（结束时间的小时数-开始时间的小时数）的绝对值-1
            hour = Math.abs(end / 100 - start / 100) - 1;
        } else {
            // 如果分钟小于0，那么就不需要借位，证明小时数不需要减1，分钟数正常减去即可
            hour = end / 100 - start / 100;
            // 由于分钟数小于0，所以需要取绝对值
            mins = Math.abs(mins);
        }
        System.out.printf("%02d:%02d", hour, mins);
    }

}
