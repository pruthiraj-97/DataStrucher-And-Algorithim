import java.util.*;
public class longestsubstring {
    public static int commonSubsequence(int i,int j,String str1,String str2,int dp[][]){
        if(i<0||j<0) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        if(str1.charAt(i)==str2.charAt(j)){
            return dp[i][j]=1+commonSubsequence(i-1,j-1,str1,str2,dp);
        }
        return dp[i][j]=Math.max(commonSubsequence(i-1,j,str1,str2,dp),commonSubsequence(i,j-1,str1, str2,dp));
    }
    public static void main(String[] args) {
        String str1="abcjklp";
        String str2="acjkp";
        int dp[][]=new int[str1.length()][str2.length()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=0;
            }
        }
         commonSubsequence(str1.length()-1,str2.length()-1,str1,str2,dp);
         for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
         }
    }
    
}
