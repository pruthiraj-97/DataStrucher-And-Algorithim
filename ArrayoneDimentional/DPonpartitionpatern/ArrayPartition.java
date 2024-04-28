import java.util.*;
public class ArrayPartition {
    public static void main(String[] args) {
        int arr[]={8, 3, 9, 1, 2};
        inr max[][]=new int[arr.length][arr.length];
        int min[][]=new int[arr.length][arr.length];
        int m=3;
        for(int i=0;i<arr.length;i++){
            int ma=Integer.MIN_VALUE;
            int mi=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                ma=Math.max(ma,arr[i][j]);
                mi=Math.min(mi,arr[i][j]);
                max[i][j]=ma;
                min[i][j]=mi;
            }
        }
        boolean dp[]=new boolean[arr.length+1];
        dp[dp.length-1]=true;
        for(int i=arr.length-1;i>=0;i--){
            for(int j=k-1;j<arr.length;j++){
                int x=i+j;
                if(x>=arr.length) break;
                if(Math.abs(max[i][x]-min[i][x])<=1){
                    dp[i]=(dp[])
                }
            }
        }
    }
}
