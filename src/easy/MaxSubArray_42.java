package easy;

public class MaxSubArray_42 {
    /**
     * 数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
     * dp[i]表示以i为最后一个数，连续子数组的最大值
     * dp[i]=MAX(dp[i-1],dp[i-1]+num[i])
     * @param args
     */

    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(i>=1)nums[i]=Math.max(nums[i-1]+nums[i],nums[i]);
            if(nums[i]>max) max=nums[i];
        }
        return max;
    }
}
