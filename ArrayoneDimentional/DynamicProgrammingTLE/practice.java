import java.util.*;
public class practice {
    public static void main(String[] args) {
        int n=17;
        int dp[]=new int[n+1];
        for(int i=1;i<dp.length;i++) dp[i]=(int)1e9;
        for(int i=1;i<=n;i++){
            String str=""+i;
            for(int j=0;j<str.length();j++){
                int num=str.charAt(j)-'0';
                dp[i]=Math.min(dp[i],1+dp[i-num]);
            }
        }
        System.out.println(dp[n]);
    }
}
