import java.util.*;
public class minimumOperationToFormArray {
    public static int f(int arr[],int i,int j,int dp[][]){
        if(i>j) return 0; 
        if(dp[i][j]!=-1) return dp[i][j];
        int min=arr[i];
        for(int x=i;x<=j;x++){
            if(arr[x]==0){
                return dp[i][j]=f(arr,i,x-1,dp)+f(arr,x+1,j,dp);
            }
            min=Math.min(min,arr[x]);
        }
        for(int x=i;x<=j;x++){
            arr[x]=arr[x]-min;
        }
        return dp[i][j]=1+f(arr,i,j,dp);
    }
    public static int f(String str,int i,int k){
        if(i==str.length()) return 0;
        int min=(int)1e9;
        for(int x=i;x<str.length();x++){
            int t=Integer.parseInt(str.substring(i,x+1));
            if(t<=k){
                int count=1+f(str,x+1,k);
                min=Math.min(min,count);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        int dp[][]=new int[arr.length][arr.length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(f(arr,0,arr.length-1,dp));
        System.out.println(f("165462",0,60));
    }
}
