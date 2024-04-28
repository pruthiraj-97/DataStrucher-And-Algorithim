import java.util.*;
public class practice {
    public static int f(int arr[],int i,int dp[]){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=arr[i];
        int min=Integer.MAX_VALUE;
        for(int j=i+1;j<=(i+1)*2;j++){
            min=Math.min(min,f(arr,j,dp));
        }
        take=take+min;
         int nottake=arr[i]+f(arr,i+1,dp);
        return dp[i]=Math.min(take,nottake);
    }
    public static void main(String[] args) {
        int arr[]={1,10,1,1};
        int dp[]=new int[arr.length+1];
        for(int i=0;i<arr.length+1;i++) dp[i]=-1;
        System.out.println(f(arr,0,dp));
    }
}
