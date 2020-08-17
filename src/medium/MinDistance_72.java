package medium;

public class MinDistance_72 {
    public static int minDistance(String word1, String word2) {
        int len1=word1.length(),len2=word2.length();
        int[][] dp = new int[len1+1][len2+1];
        if(len1<=0||len2<=0)return len1!=0?len1:len2;
        for (int i = 0; i < len1+1; i++) dp[i][0]=i;
        for (int i = 0; i < len2+1; i++) dp[0][i]=i;

        for (int i = 1; i < len1+1; i++) {
            for (int j = 1; j < len2+1; j++) {
                int left = dp[i-1][j]+1;
                int up = dp[i][j-1]+1;
                int xie = dp[i-1][j-1];
                if(word1.charAt(i-1)!=word2.charAt(j-1))xie+=1;
                    dp[i][j]=Math.min(Math.min(left,up),xie);

            }
        }
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        System.out.println(minDistance("horse","ros"));
    }
}
