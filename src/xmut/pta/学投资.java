package xmut.pta;

import java.util.Scanner;

public class 学投资 {
    // 所谓复利投资，是指每年投资的本金是上一年的本金加收益。
    // 而非复利投资是指每年投资金额不包含上一年的收益，即固定投资额
    // 假设他每年固定投资M元（整数），每年的年收益达到P（0<P<1，double)，那么经过N（整数）年后
    // ，复利投资比非复利投资多收入多赚多少钱呢？
    // M P N
    // 复利收入（含本金），非复利收入（含本金），复利比非复利收入多的部分（全部取整，四舍五入）
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] nums = sc.nextLine().split("\\s+");
            double M = Double.parseDouble(nums[0]);
            double P = Double.parseDouble(nums[1]);
            int N = Integer.parseInt(nums[2]);
            double fl = 0;
            for (int i = 0; i < N; i++) {
                fl = (fl + M) * P +fl ;
            }
            double ffl = (M * P) * N;

            System.out.printf("%d %d %d", Math.round(fl+M), Math.round(ffl+M), Math.round(fl - ffl));
        }
    }
}
