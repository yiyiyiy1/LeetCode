package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permute_46 {
    public static void main(String[] args) {
        int[] n = {1,2,3};
        Permute_46 p = new Permute_46();
        p.permute(n);
    }
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    List<Integer> one = new ArrayList<>();
    int[] n;
    public List<List<Integer>> permute(int[] nums) {
        this.n=nums;
        for(int i:n)one.add(i);
        dfs(0);
        return ans;
    }
    public void swap(int i,int j){
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }

    public void dfs(int start){
        if(start==n.length) {ans.add(new ArrayList<>(one));return;}
        for(int i=start;i<n.length;i++){
            Collections.swap(one,start,i);
            dfs(start+1);
            Collections.swap(one,start,i);
        }
    }
}
