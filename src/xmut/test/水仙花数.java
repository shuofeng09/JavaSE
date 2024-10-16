package xmut.test;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-27 22:42
 */
public class 水仙花数 {

    public static int pows(int x, int N) {  // 自己定义了个函数，直接调用的话，最大值会超时
        int ans = 1;
        for (int i = 0; i < N; i++) {
            ans = ans * x;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min, max;
        // 求出比n小一位数的最小值范围 n=3 min=100 max=1000
        min = pows(10, n - 1);
        //  n=3 min=100 max=1000
        max = min * 10;
        int num, temp, sum;
        for (int i = min; i < max; i++) {
            sum = 0; // i++后，sum要初始化！必须在这里
            num = i;
            while (num > 0) {
                // 每次都求出个位数，然后赋给临时变量t 153%10=3
                temp = num % 10;
                // 让num除以10，这样每次就可以减少一位数 153->15
                num /= 10;
                // 求出t的n次方，然后累加到sum上 3^3+5^3+1^3
                sum += pows(temp, n);
            }
            // 如果sum和i相等，那么就证明该数为水仙花数
            if (sum == i)
                System.out.println(i);
        }

    }
}
