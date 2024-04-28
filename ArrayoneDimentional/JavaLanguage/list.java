import java.util.*;
public class list {
    public static void heapsort(int arr[]){
        int ans[]=new int[arr.length];
        int x=0;
        int n=arr.length-1;
        while(n>=0){
             ans[x++]=arr[0];
            int temp;
            temp=arr[0];
            arr[0]=arr[n];
            arr[n]=temp;
            n--;
            heapify(arr,0, n);
        }
        for(int i=0;i<arr.length;i++){
           arr[i]=ans[i]; 
        }
    }
    public static void heapify(int arr[],int i,int n){
        int large=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<=n&&arr[large]<arr[l]) large=l;
        if(r<=n&&arr[large]<arr[r]) large=r;
        if(large!=i){
            int temp;
            temp=arr[i];
            arr[i]=arr[large];
            arr[large]=temp;
            heapify(arr,large,n);
        }
    }
    public static void main(String[] args) {
         int arr[]={5,67,29,45};
         for(int i=0;i<arr.length;i++){
            heapify(arr, i, arr.length-1);
         }
           heapsort(arr);
         for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
         }
    }
}
