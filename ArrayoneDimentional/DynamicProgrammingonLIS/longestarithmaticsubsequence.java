import java.util.*;
public class longestarithmaticsubsequence {
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};
        Map<Integer,Integer> dp[]=new  HashMap[n];
        for(int i=0;i<dp.length;i++){
            dp[i]=new HashMap<>();
            dp[i].clear();
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int diff=arr[i]-arr[j];
                if(dp[j].containsKey(diff)){
                    dp[i].put(diff,1+dp[j].get(diff));
                }else{
                    dp[i].put(diff,2);
                }
                max=Math.max(max,dp[i].get(diff));
            }
        }
        System.out.println(max);
    }
}
