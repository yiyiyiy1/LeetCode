package medium;

public class SumOfArray_1480 {
    public static void main(String[] args) {
        SumOfArray_1480 s = new SumOfArray_1480();

    }
    public int[] runningSum(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if(i>=1)nums[i] = nums[i-1]+nums[i];
        }
        return nums;
     }
}
