package leetcode;

import java.util.ArrayList;

/**
 * @author 朔风
 * @createTime 2023-06-24 16:37
 */
public class _14_最长公共前缀 {

    /*
    输入：strs = ["flower","flow","flight"]
    输出："fl"
    * */
    public String longestCommonPrefix(String[] strs) {

        String shortS = strs[0];
        for (String str : strs) {
            if (str.length() < shortS.length()) {
                shortS = str;
            }
        }


        String res = shortS;
        for (int i = 0; i < shortS.length(); i++) {
            for (String str : strs) {
                if (!str.startsWith(res)) {
                    res = res.substring(0, res.length() - 1);
                }
            }
        }

        return res;

    }

}
