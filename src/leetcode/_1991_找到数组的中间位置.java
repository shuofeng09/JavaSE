package leetcode;

/**
 * @author 朔风
 * @createTime 2023-06-23 12:05
 */
public class _1991_找到数组的中间位置 {
    public static void main(String[] args) {
        int[] nums = {2, 3, -1, 8, 4};
        System.out.println(findMiddleIndex(nums));

    }

    /*
    输入：nums = [2,3,-1,8,4]
    输出：3
    解释：
    下标 3 之前的数字和为：2 + 3 + -1 = 4
    下标 3 之后的数字和为：4 = 4
     */
    public static int findMiddleIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            int first = 0;
            for (int j = 0; j < i; j++) {
                first += nums[j];
            }
            int last = 0;
            for (int j = i + 1; j < nums.length; j++) {
                last += nums[j];
            }

            if (first == last) {
                return i;
            }

        }
        return -1;
    }

}
