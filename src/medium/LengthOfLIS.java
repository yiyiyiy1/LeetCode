package medium;

public class LengthOfLIS {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        if(nums.length<0)return 0;
        if(nums.length<=1)return 1;
        int[] dp = new int[nums.length];
        dp[0]=1;
        int max=1;
        for (int i = 1; i < nums.length; i++) {
            int temp=0;
            for (int j = 0; j <i ; j++) {
                if(nums[j]<nums[i]&&temp<dp[j]){
                    temp=dp[j];
                }
            }
            dp[i]=temp+1;
            if(max<dp[i]) max=dp[i];
        }

        return max;
    }
}
