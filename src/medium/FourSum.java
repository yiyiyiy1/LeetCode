package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    int[] nums;
    List<Integer> list = new ArrayList<>();
    int target;
    List<List<Integer>> ans = new ArrayList<List<Integer>>() ;
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        this.nums=nums;
        this.target=target;
        dfs(0,0);
        return ans;
    }
    public void dfs(int start,int sum){
        if (list.size()==4&&sum==target)ans.add(new ArrayList(list));
        if(start==nums.length|| list.size()>=4)return;

        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            dfs(i+1,sum+nums[i]);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        FourSum fs = new FourSum();
        int[] n = {1, 0, -1, 0, -2, 2};
        fs.fourSum(n,0);
    }
}
