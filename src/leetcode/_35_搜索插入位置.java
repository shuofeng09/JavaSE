package leetcode;

/**
 * @author 朔风
 * @createTime 2023-06-23 12:26
 */
/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
请必须使用时间复杂度为 O(log n) 的算法。
 */
public class _35_搜索插入位置 {

    /*
    输入: nums = [1,3,5,6], target = 5
    输出: 2
     */
    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
