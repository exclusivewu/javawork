package leetcode.shuangzhizheng;

//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
//
// 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nu
//ms2 的元素。
//
//
//
// 示例 1：
//
//
//输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//输出：[1,2,2,3,5,6]
//
//
// 示例 2：
//
//
//输入：nums1 = [1], m = 1, nums2 = [], n = 0
//输出：[1]
//
//
//
//
// 提示：
//
//
// nums1.length == m + n
// nums2.length == n
// 0 <= m, n <= 200
// 1 <= m + n <= 200
// -109 <= nums1[i], nums2[i] <= 109
//
// Related Topics 数组 双指针
// 👍 951 👎 0

//Java：合并两个有序数组
public class P88MergeSortedArray{

    public static void main(String[] args) {
        Solution solution = new P88MergeSortedArray().new Solution();
        // TO TEST
    }

    /*两个有序数组的合并，利用双指针的思路*/
    class Solution {
        // 标准答案
        public void merge1(int[] nums1, int m, int[] nums2, int n) {

            int index1 = m - 1, index2 = n - 1;
            int indexMerge = m + n - 1;
            // 由于需要
            while (index2 >= 0) {
                if (index1 < 0) {
                    nums1[indexMerge--] = nums2[index2--];
                } else if (index2 < 0) {
                    nums1[indexMerge--] = nums1[index1--];
                } else if (nums1[index1] > nums2[index2]) {
                    nums1[indexMerge--] = nums1[index1--];
                } else {
                    nums1[indexMerge--] = nums2[index2--];
                }
            }
        }



        public void merge(int[] nums1, int m, int[] nums2, int n) {
            /**两个数组合并成一个数组*/
            for (int i = 0; i < n; i++) {
                nums1[m+i] = nums2[i];
            }
            /*  第一种 冒泡排序 时间的复杂度是On2
            for (int i = 0; i < nums1.length-1; i++) {
                for (int j = 0; j < nums1.length - i -1; j++) {
                    if (nums1[j] > nums1[j+1]){
                        int sum = nums1[j];
                        nums1[j] = nums1[j+1];
                        nums1[j+1] = sum;
                    }
                }
            }
            */
        }
        // 第二种  快速排序  传入数组arr 0  数组长度-1
       /* public int[] qsort(int[] arr,int start,int end) {
            // 首先用第一个元素作为支点
            int pivot = arr[start];
            int i = start;
            int j = end;

            while (i<j) {
                while ((i<j) && (arr[j] > pivot)) {
                    j--;
                }
                while ((i<j) && (arr[i] < pivot)) {
                    i++;
                }
                if (( arr[i] == arr[j]) && (i<j)) {
                    i++;
                } else {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i-1>start) {
                arr=qsort(arr,start,i-1);
            }
            if (j+1<end){
                arr=qsort(arr,j+1,end);
            }
            return (arr);
        }*/
    }
}
