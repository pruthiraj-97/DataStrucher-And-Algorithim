import java.util.*;
public class countsubsequenceLIS {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,5,4,7,2};
        int dp[]=new int[arr.length];
        Map<Integer,Integer> mp=new HashMap<>();
         for(int i=0;i<dp.length;i++) dp[i]=1;
         int max=1;
         for(int i=0;i<dp.length;i++){
             for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                    max=Math.max(max,dp[i]);
                    if(mp.containsKey(dp[i])){
                        mp.put(dp[i],mp.get(dp[i])+1);
                    }else{
                        mp.put(dp[i],1);
                    }
                }
             }
         }
         int count=0;
         int maxi=0;
         for(var v:mp.entrySet()){
             if(v.getKey()>=maxi){
                 maxi=v.getKey();
                 count=v.getValue();
             }
         }
         //return count;
         System.out.println(mp);
    }
}
