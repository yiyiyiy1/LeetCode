package medium;

public class SearchRange_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length<=0)return ans;
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]>target)r=mid-1;
            else if(nums[mid]<target)l=mid+1;
            else if(nums[mid]==target)r=mid-1;
        }
        if(l<nums.length)ans[0]=l;
        l=0;
        r=nums.length;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]>target)r=mid-1;
            else if(nums[mid]<target)l=mid+1;
            else if(nums[mid]==target)l=mid+1;
        }
        if(r<nums.length)ans[1]=r;
        return ans;
    }


}
