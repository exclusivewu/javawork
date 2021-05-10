package leetcode.shuangzhizheng;

//编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
//
//
//
// 示例 1：
//
// 输入："hello"
//输出："holle"
//
//
// 示例 2：
//
// 输入："leetcode"
//输出："leotcede"
//
//
//
// 提示：
//
//
// 元音字母不包含字母 "y" 。
//
// Related Topics 双指针 字符串
// 👍 149 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：反转字符串中的元音字母
public class P345ReverseVowelsOfAString{
    public static void main(String[] args) {
        Solution solution = new P345ReverseVowelsOfAString().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseVowels(String s) {
            List list = new ArrayList(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
            char[] sq = s.toCharArray();
            // 利用双指针循环的操作。实现快速找到元音字母并且交换
            int i = 0, j = s.length() - 1;
            char[] result = new char[s.length()];
            while (i <= j) {
                char a = sq[i];
                char b = sq[j];
                if (!list.contains(a)) {
                    result[i++] = a;
                } else if (!list.contains(b)) {
                    result[j--] = b;
                } else {
                    result[i++] = b;
                    result[j--] = a;
                }
            }
            return new String(result);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
