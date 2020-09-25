package medium;

import java.util.Arrays;

public class RotateMatrix {
    /**
     * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
     *水平翻转再对角翻转
     * 不占用额外内存空间能否做到？
     * (0,0).....(0,N)---->(N,0)......(N,N)
     * (1,N)......(N,N)----->(N,N-1)....(N,0)
     * @param args
     */
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }
    public static void rotate(int[][] matrix) {
        int len = matrix.length;
        int n = len/2;
        int m = len%2;
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j < len; j++) {
                swap(matrix,i,j,len-i+1,j);
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void swap(int[][] arr,int i,int j,int x,int y){
        int temp = arr[i][j];
        arr[i][j] = arr[x][y];
        arr[x][y] = temp;
    }
}
