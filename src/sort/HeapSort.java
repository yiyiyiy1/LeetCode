package sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {2,7,3,5,9,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for (int i = arr.length-1; i>=0 ; i--) {
            heapify(arr,i);
            swap(arr,i,0);
        }
    }
    public static void heapify(int[] arr,int n){
        int start = (n-1)/2;
        for (int i = start; i >=0 ; i--) {
            int c1 = 2*i+1;
            int c2 = 2*i+2;
            if(c1<=n&&arr[c1]>arr[i]) swap(arr,i,c1);
            if(c2<=n&&arr[c2]>arr[i]) swap(arr,i,c2);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
