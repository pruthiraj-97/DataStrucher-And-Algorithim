import java.util.*;
public class largestdivisiblesubset {
    public static int maxLength(int arr[],int prev,int curr,int dp[][]){
        if(curr==arr.length) return 0;
        if(dp[prev+1][curr]!=-1) return dp[prev+1][curr];
        int nottake=maxLength(arr,prev,curr+1,dp);
        int take=Integer.MIN_VALUE;
        if(prev==-1||arr[curr]%arr[prev]==0||arr[prev]%arr[curr]==0){
            take=1+maxLength(arr,curr,curr+1,dp);
        }
        return dp[prev+1][curr]=Math.max(take,nottake);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,8};
        int dp[][]=new int[arr.length+1][arr.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(maxLength(arr,-1,0, dp));
    }
}
