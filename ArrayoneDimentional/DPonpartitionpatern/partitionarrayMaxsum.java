import java.util.*;
public class partitionarrayMaxsum {
    public static int f(int arr[],int i,int j,int k){
        if(i>j) return 0;
        if(i==j) return arr[i];
        int sum=Integer.MIN_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int x=1;x<=Math.min(k,arr.length-i);x++){
                maxi=Math.max(maxi,arr[i+x-1]);
               int curr=maxi*x+f(arr,i+x,j,k);
               sum=Math.max(sum,curr);
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,15,7,9,2,5,10};
        System.out.println(f(arr,0,arr.length-1,3));
        char ch='2';
        int a=ch-'0';
        System.out.println(a);
    }
}
