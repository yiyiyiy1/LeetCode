package test;

import bean.TreeNode;
import bean.TrieNode;

import java.util.*;


public class Main{
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return ans;
    }
    int ans = 0;
    public void dfs(TreeNode root,int sum){
        if(root==null)return;
        if(root.left==null&&root.right==null){
            ans=ans+sum*10+root.val;
            return;
        }
        dfs(root.left,sum*10+root.val);
        dfs(root.right,sum*10+root.val);
    }

    public static void main(String[] args) {
        Main m = new Main();
        TreeNode t = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        t.left = t1;
        t.right = t2;
        System.out.println( m.sumNumbers(t));
    }
}