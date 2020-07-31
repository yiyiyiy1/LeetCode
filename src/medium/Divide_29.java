package medium;

import java.util.Scanner;

public class Divide_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Divide_29 d = new Divide_29();
        System.out.println(d.divide(a,b));
    }
    public int divide(int dividend, int divisor) {
        int flag=1;
        if(dividend<0&&divisor>0||dividend>0&&divisor<0)flag=-1;
        long a = dividend,b=divisor,res=0;
        a=Math.abs(a);
        b=Math.abs(b);
        long temp = div(a,b);
        res = flag>0?temp:-temp;
        if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)res = Integer.MAX_VALUE;
        return (int)res;
    }

    public long div(long a,long b){
        if(a<b)return 0;
        long temp = b;
        long count =1;
        while(temp+temp<a){
            temp+=temp;
            count+=count;
        }
        return count+div(a-temp,b);
    }
}
