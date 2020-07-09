package com.algorithm.array;

/**
 * 0～n-1中缺失的数字
 * https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3};
        // 执行方法
        missingNumber(nums);
    }

    /**
     * 执行方法
     * @param nums 参数参数
     * @return
     */
    public static int missingNumber(int[] nums) {
        // startNum=开始值，endNum=结尾值
        int startNum = 0, endNum = nums.length - 1;
        while (startNum <= endNum) {
            // 二分值（中间值[整数值]）
            int middleNum = (startNum + endNum) / 2;
            if (nums[middleNum] == middleNum) {
                // 前半部分没问题（更新开始值为中间值的右一位）
                startNum = middleNum + 1;
            } else {
                // 更新结尾值为中间值左一位
                endNum = middleNum - 1;
            }
        }
        return startNum;
    }
}