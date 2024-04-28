import java.util.*;
public class minimizingcoins {
    public static void main(String[] args) {
        int sum=5;
        int arr[]={1,2,5};
        int dp[]=new int[sum+1];
        // for(int i=1;i<dp.length;i++){
        //     dp[i]=(int)1e9;
        // }
        // dp[0]=0;
        // for(int i=1;i<=sum;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[j]<=i){
        //             dp[i]=Math.min(dp[i],1+dp[i-arr[j]]);
        //         }
        //     }
        // }
        // System.out.println(dp[sum]);
        dp[0]=1;
        for(int i=1;i<=sum;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]<=i){
                    dp[i]=dp[i]+dp[i-arr[j]];
                }
            }
        }
        System.out.println(dp[sum]);
    }
}
