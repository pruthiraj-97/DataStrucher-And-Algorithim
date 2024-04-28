import java.util.*;
public class countdigitgrouping {
    public static int f(String str,int i,int prev,int dp[][]){
        if(i==str.length()) return 1;
        if(dp[i][prev]!=-1) return dp[i][prev];
        int sum=0;
        int count=0;
        for(int idx=i;idx<str.length();idx++){
            sum+=str.charAt(i)-'0';
            if(sum>=prev){
                count+=f(str,idx+1,sum,dp);
            }
        }
        return dp[i][prev]=count;
    }
    public static void main(String[] args) {
        String str="1119";
        int dp[][]=new int[str.length()][100*9];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(f(str,0,0,dp));
    }
}
