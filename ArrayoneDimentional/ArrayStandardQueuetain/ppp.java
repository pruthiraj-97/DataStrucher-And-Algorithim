import java.util.*;
public class ppp {
    public static int[] f(int arr[],int k){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]-arr[i+1]<=k){
                int temp;
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,9,8};
        int ans[]=f(arr,2);
    }
}
