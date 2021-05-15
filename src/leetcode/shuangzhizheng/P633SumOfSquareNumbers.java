package leetcode.shuangzhizheng;

//给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
//
//
//
// 示例 1：
//
// 输入：c = 5
//输出：true
//解释：1 * 1 + 2 * 2 = 5
//
//
// 示例 2：
//
// 输入：c = 3
//输出：false
//
//
// 示例 3：
//
// 输入：c = 4
//输出：true
//
//
// 示例 4：
//
// 输入：c = 2
//输出：true
//
//
// 示例 5：
//
// 输入：c = 1
//输出：true
//
//
//
// 提示：
//
//
// 0 <= c <= 231 - 1
//
// Related Topics 数学
// 👍 277 👎 0

//Java：平方数之和
/*解决思路 先确定数据的范围，根据双指针的方法*/
public class P633SumOfSquareNumbers{
    public static void main(String[] args) {
        Solution solution = new P633SumOfSquareNumbers().new Solution();
        System.out.println(solution.judgeSquareSum(1));
        // TO TEST
    }
    class Solution {
        public boolean judgeSquareSum(int c) {
            // 找到数据最大的范围
            int h = (int) Math.sqrt(c);
            int i = 0;
            while (i <= h){
                int sum = i*i+h*h;
                if (sum == c){
                    return true;
                } else if (sum > c){
                    h--;
                } else {
                    i++;
                }
            }
            return false;
        }
    }


}

