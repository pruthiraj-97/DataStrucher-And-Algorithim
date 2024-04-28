import java.util.*;
public class longestpalindromicsubstring {
    public static int maxLength(String str){
        boolean  dp[][]=new boolean[str.length()][str.length()];
        for(int i=0;i<dp.length;i++){
            dp[i][i]=true;
        }
        int n=str.length()-1;
        int length=str.length();
        for(int diff=1;diff<=n;diff++){
            for(int i=0;i<str.length();i++){
                int j=i+diff;
                if(j<str.length()){
                       if(diff==1){
                        if(str.charAt(i)==str.charAt(j)){ 
                            dp[i][j]=true;
                            length++;
                        }
                       }else{
                        if(str.charAt(i)==str.charAt(j)&&dp[i+1][j-1]==true){
                            dp[i][j]=true;
                            length++;
                        }
                       }
                    }
                }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return length;
    }
       public static void main(String[] args) {
          String str="baab";
          System.out.println(maxLength(str));

       }
    }