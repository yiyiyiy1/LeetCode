package medium;

public class KthLargeNum {
    public static void main(String[] args) {
        KthLargeNum k = new KthLargeNum();
        int[] a = {1,3,5,4,2};
        int K = 3;
        System.out.println(k.findKth(a,a.length,K));
    }
    public int findKth(int[] a, int n, int K) {
        int end = n-1;
        for (int i = 0; i <K ; i++) {
            heapify(a,end);
            swap(a,0,end);
            end--;
        }
        return a[a.length-K];
    }
    public void heapify(int[] a,int end){
        int start = (end-1)/2;
        for (int i = start; i >= 0 ; i--) {
            int p1 = 2*i+1;
            int p2 = 2*i+2;
            int index = i,max=a[i];
            if(p1<=end&&a[p1]>max) {max=a[p1];index=p1;}
            if(p2<=end&&a[p2]>max) {max=a[p2];index=p2;}
            if(max!=a[i])swap(a,index,i);
        }
    }
    public void swap(int[] a,int i,int j){
        if(i==j)return;
        a[i] = a[i]+a[j];
        a[j] = a[i]-a[j];
        a[i] = a[i]-a[j];
    }
}
