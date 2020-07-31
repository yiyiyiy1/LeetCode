package medium;

public class NextPermutation_31 {
    public static void main(String[] args) {
        int[] n = {1,3,2};
        NextPermutation_31 s = new NextPermutation_31();
        s.nextPermutation(n);
    }
    public void nextPermutation(int[] nums) {
        int flag = 0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                //flag=1;
                int j=i;
                flag=i;
                while (j<nums.length&&nums[j]>nums[i-1]){
                    j++;
                }
                j--;
                int temp = nums[i-1];
                nums[i-1] = nums[j];
                nums[j] = temp;
                break;
            }
        }


            int i=flag,j=nums.length-1;
            while(i<j){
                int temp=nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;j--;
            }

        /*for(int e :nums){
            System.out.print(e+" ");
        }*/

    }
}
