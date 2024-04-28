import java.util.*;
public class dicecombination {
    public static int f(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        int count=0;
        for(int i=1;i<=6;i++){
            count+=f(n-i);
        }
        return count;
    }
    public static void main(String[] args) {
        int n=3;
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(j<=i){
                    dp[i]=dp[i]+dp[i-j];
                }
            }
        }
        System.out.println(dp[n]);
        System.out.println(f(n));
    }
}
