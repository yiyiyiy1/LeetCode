package medium;
import java.util.*;
public class ZiJie_0823 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int[]dp = new int[n];
        int[][]dp2 = new int[n][3];
        int[][]cur = new int[n][3];
        for(int j = l ; j <=r; j++){
            if (j%3 == 0){
                dp2[0][0]++;
            }
            if (j%3== 1){
                dp2[0][1]++;
            }
            if (j%3== 2){
                dp2[0][2]++;
            }
        }
        dp[0] = dp2[0][0];
        //dp[0][1] = count;
        for(int i = 1 ; i <n ; i++){
            for(int j = l ; j <=r; j++){
                if (j%3 == 0){

                    cur[i][0]++;
                }
                if (j%3== 1){
                    cur[i][1]++;
                }
                if (j%3== 2){
                    cur[i][2]++;
                }
            }
            dp2[i][0] = dp2[i-1][0]*cur[i][0]+ dp2[i-1][1]*cur[i][2] + dp2[i-1][2]*cur[i][1];
            dp2[i][1] = dp2[i-1][0]*cur[i][1]+ dp2[i-1][1]*cur[i][0] + dp2[i -1][2]*cur[i][2];
            dp2[i][2] = dp2[i-1][1]*cur[i][1]+ dp2[i-1][0]*cur[i][2] + dp2[i-1][2]*cur[i][0];

            dp[i] =  dp2[i-1][0]*cur[i][0] +  dp2[i-1][1]* cur[i][2]+dp2[i-1][2]* cur[i][1];
            cur[i][0] = 0 ;
            cur[i][1] = 0;
            cur[i][2] = 0 ;
        }
        System.out.println(dp[n-1]);

    }


}