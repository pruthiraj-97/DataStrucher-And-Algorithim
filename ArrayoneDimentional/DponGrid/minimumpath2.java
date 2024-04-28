import java.util.*;
public class minimumpath2 {
    public static void main(String[] args) {
        int dp[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr[0].length;i++){
            dp[0][i]=arr[0][i];
        }
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                int s1=Integer.MAX_VALUE;
                for(int k=0;k<arr[0].length;k++){
                    if(j!=k){
                        s1=Math.min(s1,arr[i][j]+dp[i-1][k]);
                    }
                }
                dp[i][j]=s1;
            }
        }
        int n=arr.length-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr[0].length;i++){
            ans=Math.min(ans,dp[n][i]);
        }
        return ans;
    }
}
