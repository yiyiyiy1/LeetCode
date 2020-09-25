package medium;

import bean.TreeNode;

import java.util.*;

public class LevelOrder {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        dfs(root,0);
        return ans;
    }
    public void dfs(TreeNode node,int level){
        if(node==null)return;
        if(ans.size()<=level)ans.add(new ArrayList<>());
        ans.get(level).add(node.val);
        dfs(node.left,level+1);
        dfs(node.right,level+1);
    }
}
