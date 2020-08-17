package medium;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int len = nums.length;
        if (len<=0)return 0;
        dp[0]=nums[0];
        int max = dp[0];
        for (int i = 1; i < len ; i++) {
            dp[i]= Math.max(dp[i-1]+nums[i],nums[i]);
            if(dp[i]>max)max=dp[i];
        }
        return max;
    }
}
