package medium;

public class UniquePathsWithObstacles_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] arr = new int[m][n];
        arr[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int a = 0,b = 0;
                if(i==0&&j==0)continue;
                if(i!=0&&obstacleGrid[i-1][j]!=1){
                    a=arr[i-1][j];
                }
                if(j!=0&&obstacleGrid[i][j-1]!=1)b=arr[i][j-1];
                arr[i][j] = a+b;
                if(obstacleGrid[i][j]==1)arr[i][j]=0;
            }
        }
        return arr[m-1][n-1];
    }
}
