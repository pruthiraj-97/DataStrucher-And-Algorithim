import java.util.*;
public class LongestLISprint {
    
    public static void main(String[] args) {
        int arr[]={1,3,5,4,7};
    
    int dp[]=new int[arr.length];
    int hash[]=new int[arr.length];
    for(int i=0;i<arr.length;i++){
        dp[i]=1;
        hash[i]=i;
    }
    int max=0;
    int maxi=0;
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<i;j++){
            if(arr[i]%arr[j]==0&&1+dp[j]>=dp[i]){
                dp[i]=1+dp[j];
                hash[i]=j;
            }
        }
        if(dp[i]>max){
            max=dp[i];
            maxi=i;
        }
    }
     for(int i=0;i<hash.length;i++) System.out.println(dp[i]+" ");
    List<Integer> ans=new ArrayList<>();
    int j=maxi;
    while(hash[j]!=j){
       // System.out.println(arr[j]);
        ans.add(arr[j]);
        j=hash[j];
    }
    ans.add(arr[j]);
    Collections.reverse(ans);
    System.out.println(ans);
    }
    
}
