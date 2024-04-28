import java.util.*;
public class concartination {
    public static void main(String[] args) {
        String str1="aabc";
        String str2="aabadabc";
        int dp[][]=new int[str2.length()+1][str1.length()+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str2.charAt(i-1)==str1.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        for(int i=0;i<dp.length;i++){
          for(int j=0;j<dp[0].length;j++){
            System.out.print(dp[i][j]+" ");
          }
          System.out.println();
        }

        boolean a[]=new boolean[str2.length()];
        int i=dp.length-1;
        int j=dp[0].length-1;
        int x=a.length-1;
        while(i>0&&j>0){
            if(str2.charAt(i-1)==str1.charAt(j-1)){
                  a[i-1]=true;
                  i--;
                  j--;
            }else{
                if(dp[i-1][j]>dp[i][j-1]){
                    i--;
                }else{
                    j--;
                }
            }
        }
        i=0;
        String s="";
        for(i=0;i<a.length;i++){
            if(a[i]==false) s=s+str2.charAt(i);
        }
        System.out.println(s);
        String str3="abad";
        System.out.println(s.equals(str3));

    }

}
