import java.util.*;
public class longestBitonicsubsequence {
    public static int  cheak(String str1,String str2){
        int count=0;
        int i=0;
        int j=0;
        while(i<str1.length()&&j<str2.length()){
            if(str1.charAt(i)!=str2.charAt(j)){
                count++;
            }
            i++;
            j++;
        }
        return count+Math.abs(str1.length()-str2.length());
    }
    public static List<String> function(String[] word, int[] arr) {
        int dp[]=new int[arr.length];
        int prev[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            prev[i]=i;
        }
        int max=0;
        int maxi=0;
        for(int i=0;i<arr.length;i++) dp[i]=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]!=arr[j]){
                    if(word[i].length()==word[j].length()&&cheak(word[j],word[i])==1){
                    if(dp[i]<1+dp[j]){
                        dp[i]=1+dp[j];
                        prev[i]=j;
                    }
                }
                }
            }
            if(max<dp[i]){
                max=Math.max(max,dp[i]);
                maxi=i;
            }

        }
           int j=maxi;
           List<String> ans=new ArrayList<>();
           while(j!=prev[j]){
            ans.add(0,word[j]);
            j=prev[j];
           }
          ans.add(0,word[j]);
        return ans;
    }
    
        public static void main(String[] args) {
            String word[]={"cbb","db","bdd","bd"};
            int groups[]= {2,3,4,3};
           System.out.println(function(word,groups));

        
    }
    
}
