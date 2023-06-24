package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 朔风
 * @createTime 2023-06-24 16:00
 */
public class 面试题_01_08_零矩阵 {

    public void setZeroes(int[][] matrix) {

        ArrayList<int[]> arrayList = new ArrayList<>();

        // 先遍历一遍数组得到0元素的位置
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    arrayList.add(new int[]{i, j});
                }
            }
        }

        // 再根据记录的位置将所在的行和列清零
        for (int[] arr : arrayList) {
            int row = arr[0];
            int col = arr[1];

            for (int i = 0; i < matrix[0].length; i++) {
                matrix[row][i] = 0;
            }

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }

        }


    }


}
