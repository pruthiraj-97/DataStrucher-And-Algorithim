import java.util.*;
public class frongjumpwithkstap {
        public static int f(int i,int n,int k,int arr[],int dp[]){
            if(i==n-1) return 0;
            if(dp[i]!=-1) return dp[i];
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                int s=i+j;
                if(s<arr.length){
                    int val=Math.abs(arr[i]-arr[s])+f(s,n,k,arr,dp);
                    min=Math.min(min,val);
                }
            }
            return dp[i]=min;
        }
    public static void main(String[] args) {
        int arr[]={0, 40, 30, 10};
        int dp[]=new int[arr.length];
        for(int i=0;i<dp.length;i++) dp[i]=-1;
        System.out.println(f(0,4,2,arr,dp));

    }
}
