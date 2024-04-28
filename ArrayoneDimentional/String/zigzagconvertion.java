import java.util.*;
public class zigzagconvertion { 
    public static int f(int arr[]){
        if(arr.length==1) return arr[0];
        int n=arr.length-1;
        if(arr[0]>=arr[1]) return 0;
        if(arr[n]>=arr[n-1]) return n;
        int low=1;
        int high=n-1;
        int ans=-1;
        while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]>=arr[mid-1]&&arr[mid]>=arr[mid+1]) return mid;
           if(arr[mid]>=arr[mid-1]) low=mid+1;
           else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
       int arr[]={1,2,3};
        int ans=f(arr);
        if(ans==-1) System.out.println(0);
        else System.out.println(1);
    }
}
