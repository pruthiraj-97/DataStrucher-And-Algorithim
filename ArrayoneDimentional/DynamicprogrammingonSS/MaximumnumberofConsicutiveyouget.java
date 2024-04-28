import java.util.*;
public class MaximumnumberofConsicutiveyouget {
    public static boolean helper(int arr[],int i,int k,int dp[][]){
        if(i==0) return arr[0]==k;
       if(k==0) return true;
       if(dp[i][k]!=-1) return dp[i][k]==1?true:false;
       boolean nottake=helper(arr,i-1,k,dp);
       boolean take=false;
       if(arr[i]<=k){
           take=helper(arr,i-1,k-arr[i],dp);
       }
       dp[i][k]=(take||nottake)?1:0;
       return take||nottake;
   }
    public static void main(String[] args) {
        int arr[]={1,1,1,4};
        int sum=0;
        for(int i=0;i<arr.length;i++) sum+=arr[i];
        boolean dp[][]=new boolean[arr.length][sum+1];
        for(int i=0;i<dp.length;i++) dp[i][0]=true;
        if(arr[0]<=sum){
        dp[0][arr[0]]=true;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<=sum;j++){
         boolean nottake=dp[i-1][j];
         // take
         boolean take=false;
         if(arr[i]<=j){
             take=dp[i-1][j-arr[i]];
         }
         dp[i][j]=take||nottake;
            }
        }
        int count =1;
        int max=0;
        int n=arr.length-1;
        for(int i=1;i<dp[0].length;i++){
            if(dp[n][i]==true){
                count++;
                max=Math.max(max,count);
            }else{
                count=0;
            }
        }
        max=Math.max(max,count);
        System.out.println(max);

    }
}
