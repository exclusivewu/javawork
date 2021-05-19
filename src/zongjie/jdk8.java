package zongjie;

/**
 * @Author: Wuxinwei
 * @Date: 2021/4/22 19:50
 * @Description: 总结jdk1.7和1.8的区别
 *
 *
 *
 */
public class jdk8{
        int[] a = {1,2,5,7};
        int b = 8;
        haha h = new haha();
        int[] dd =  h.twoSum(a,b);


}
class haha{
    public int[] twoSum(int[] nums, int target) {
        // 用多重循环来搞这个
        int sum = 0;
        int d = 0;
        int f = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                sum = nums[i]+nums[j];
                if (sum == target){
                    d = i;
                    f = j;
                }
            }
        }
        int[] x = {d,f};
        return x;
    }
}
