package medium;

import java.util.*;

public class FindCircleNum_546{
    public static void main(String[] args) {
        FindCircleNum_546 f = new FindCircleNum_546();
        int[][] M = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(f.findCircleNum(M));
    }
    public int findCircleNum(int[][] M) {
        boolean[] v = new boolean[M.length];
        int cout=0;
        for (int i = 0; i < M.length; i++) {
            if(v[i]==false){
                dfs(M,i,v);
                cout++;
            }
        }
        return cout;
    }
    public void dfs(int[][] M,int i,boolean[] v){
        if(i>=M.length||v[i]==true)return;
        for (int j = 0; j < M.length; j++) {
            if(M[i][j]==1){
                v[i]=true;
                dfs(M,j,v);
            }
        }
    }
}
