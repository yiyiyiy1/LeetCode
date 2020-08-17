package medium;

public class CanPartition {
    public static boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum=0;
        for (int i = 0; i < len ; i++) {
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        int target = sum/2;
        boolean[][] dp = new boolean[len][target+1];
        for (int i = 0; i < len; i++)dp[i][0] = true;
        return true;
    }
}
