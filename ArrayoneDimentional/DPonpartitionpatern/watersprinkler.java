import java.util.*;
public class watersprinkler {
    public static int f(int arr[],int i,int j,int dp[][]){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int min=(int)1e9;
       for(int k=i;k<=j;k++){
           if(arr[k]!=-1){
               int x=k-arr[k]-1;
               int y=k+arr[k]+1;
               int ans=1+f(arr,i,x,dp)+f(arr,y,j,dp);
               min=Math.min(min,ans);
           }
       }
       return dp[i][j]=min;
    }
    public static void main(String[] args) {
        int arr[]={2, 3, 4, -1, 2, 0, 0, -1,};
        int dp[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                dp[i][j]=-1;
            }
        }
        int ans=f(arr,0,arr.length-1,dp);
        if(ans>=(int)1e9){
            ans=-1;
        }
        System.out.println(ans);
    }
}
