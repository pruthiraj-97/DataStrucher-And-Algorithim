import java.util.*;
public class Dpstring {
    public static int length(String str){
        boolean dp[][]=new boolean[str.length()][str.length()];
        for(int i=0;i<dp.length;i++){
            dp[i][i]=false;
        }
        int max=0;
        for(int diff=1;diff<=str.length()-1;diff++){
            for(int i=0;i<str.length();i++){
                 int j=i+diff;
                 if(j<str.length()){
                    char ch1=str.charAt(i);
                    char ch2=str.charAt(j);
                    if(diff==1){
                        if((ch1=='<'||ch1=='?')&&(ch2=='?'||ch2=='>')){
                            dp[i][j]=true;
                            max=Math.max(max,j-i+1);
                        }
                    }
                    else if((ch1=='<'||ch1=='?')&&(ch2=='?'||ch2=='>')){
                        if(dp[i+1][j-1]==true){
                            dp[i][j]=true;
                            max=Math.max(max,j-i+1);
                        }
                    }
                 }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str="<>>>";
        System.out.println(length(str));
    }
}
