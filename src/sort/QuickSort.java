package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,7,3,5,9,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int left,int right){
        if(left>right) return;
        int base = arr[left];
        int i=left;
        int j=right;
        while(i<j){
            while(i<j&&arr[j]>=base)j--;
            while(i<j&&arr[i]<=base)i++;
            if(i<j)swap(arr,i,j);

        }
        swap(arr,left,i);
        sort(arr,left,i-1);
        sort(arr,i+1,right);
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
