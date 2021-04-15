package medium;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        arr[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int a = 0,b = 0;
                if(i==0&&j==0)continue;
                if(i!=0)a=arr[i-1][j];
                if(j!=0)b=arr[i][j-1];
                arr[i][j] = a+b;
            }
        }
        return arr[m-1][n-1];
    }
}
