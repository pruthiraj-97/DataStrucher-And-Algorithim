import java.util.*;
public class TabulationLCS {
    public static void main(String[] args) {
        String str="aubba";
        int dp[][]=new int[str.length()][str.length()];
        for(int i=0;i<str.length();i++) dp[i][i]=1;
        int n=str.length()-1;
        int max=0;
        for(int diff=1;diff<=n;diff++){
            for(int i=0;i<str.length();i++){
                int j=i+diff;
                if(j>=str.length()) continue;
                if(diff==1){
                    if(str.charAt(i)==str.charAt(j)){
                        dp[i][j]=2;
                    }else{
                        dp[i][j]=1;
                    }
                }else{
                    if(str.charAt(i)==str.charAt(j)){
                        dp[i][j]=2+dp[i+1][j-1];
                    }else{
                        dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
                    }
                }
                max=Math.max(max,dp[i][j]);
            }
        }
        System.out.println(max);
    }
}
