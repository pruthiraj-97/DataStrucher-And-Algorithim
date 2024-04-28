import java.util.*;
public class kadansalgorithim {
    public static void main(String[] args) {
        int arr[]={5,4,-1,7,8};
        int max=Integer.MIN_VALUE;
        int dp[]=new int[arr.length];
        if(arr[0]<0){
            max=Math.max(max,arr[0]);
        }else{
            max=Math.max(max,arr[0]);
            dp[0]=arr[0];
        }
        for(int i=1;i<arr.length;i++){
             max=Math.max(max,arr[i]);
             int sum=dp[i-1]+arr[i];
             if(sum<0){
                dp[i]=0;
             }else{
                dp[i]=sum;
            }
            max=Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
