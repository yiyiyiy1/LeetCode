package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_39 {
    public static void main(String[] args) {
        int[] num = {8,7,4,3};
        int target = 7;
        CombinationSum_39 c = new CombinationSum_39();
        c.dfs(0,target,num);
        System.out.println(c.ans.toArray());
    }
    ArrayList<Integer> one = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] can, int target) {
        Arrays.sort(can);
        dfs(0,target,can);
        return ans;
    }
    public void dfs(int start,int target,int[] n){
        if(target<0) return;
        if(target==0) ans.add(new ArrayList<>(one));
        for(int i=start;i<n.length;i++){
            one.add(n[i]);
            dfs(i,target-n[i],n);
            one.remove(one.size()-1);
            if(target-n[i]<0) break;
        }
    }
}
