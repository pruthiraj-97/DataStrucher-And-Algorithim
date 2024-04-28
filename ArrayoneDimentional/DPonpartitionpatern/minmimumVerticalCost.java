import java.util.*;
public class minmimumVerticalCost {
    public static int f(int arr[],int i,int j,int dp[][]){
        if(i + 1 == j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i+1;k<=j-1;k++){
            int curr=arr[i]*arr[k]*arr[j]+f(arr,i,k,dp)+f(arr,k,j,dp);
            min=Math.min(min,curr);
        }
        //System.out.println(min);
        return dp[i][j]=min;
    }
    public static void main(String[] args) {
        int arr[]={1,3,1,4,1,5};
        int dp[][]=new int[arr.length][arr.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(f(arr,0,arr.length-1,dp));
    }
}
