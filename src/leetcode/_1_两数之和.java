package leetcode;

import java.util.Arrays;

/**
 * @author 朔风
 * @createTime 2023-06-22 23:16
 */
public class _1_两数之和 {
    public static void main(String[] args) {
        int[] res = new int[]{3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(res, target)));
    }


    /*
    输入：nums = [2,7,11,15], target = 9
    输出：[0,1]
    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     */
    public static int[] twoSum(int[] nums, int target) {
        int first = 0;
        int second = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                System.out.println(sum);
                if (sum == target) {
                    second = j;
                    first = i;
                    break;
                }
            }
        }
        return new int[]{first, second};
    }

}
