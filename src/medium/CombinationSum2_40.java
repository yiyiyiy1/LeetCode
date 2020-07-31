package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2_40 {
    public static void main(String[] args) {
        CombinationSum2_40 c= new CombinationSum2_40();
        int[] n = {10,1,2,7,6,1,5};//[10,1,2,7,6,1,5]
        int target = 8;
        c.combinationSum2(n,target);
    }
    ArrayList<Integer> one = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    int[] n;
    int target;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.n = candidates;
        this.target = target;
        dfs(0,0);
        return ans;
    }
    public void dfs(int sum,int start){
        if(sum>target) return;
        if(sum==target) ans.add(new ArrayList<>(one));
        for(int i=start;i<n.length;i++){
            if(i>start&&n[i]==n[i-1])continue;
            one.add(n[i]);
            dfs(sum+n[i],i+1);
            one.remove(one.size()-1);
            //if(sum+n[i]>target)break;
        }
    }
}
