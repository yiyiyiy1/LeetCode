package test;


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        int len = str.length();
        boolean flag=false;
        char[] c = new char[str.length()];
        for (int i = 0; i < len; i++) c[i] = str.charAt(i);

        for (int i = len-1; i >=0 ; i--) {
            int cur = str.charAt(i)-'0';
            int pre = -1;
            if(i!=0)pre = str.charAt(i-1)-'0';
            if(pre>cur){

            }
        }
        if(flag==false) System.out.println(0);
        else {
            System.out.println(new String(c));
        }

    }
    static int max=0;
    public static void dfs(String s,StringBuilder ans,int start){
        if(start>=s.length()){
            int a = Integer.parseInt(s);
            int b = Integer.valueOf(ans.toString());
            if(b<a){
                if(max<b)max=b;
                return;
            }else return ;
        }
        for (int i = start; i < s.length() ; i++) {
            dfs(s,ans.append(s.charAt(i)),i+1);
            ans.deleteCharAt(ans.length()-1);
        }
    }
    public static void swap(char[] arr,int i,int j){
        char t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }



}
