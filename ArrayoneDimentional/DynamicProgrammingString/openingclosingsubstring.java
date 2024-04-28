import java.util.*;
public class openingclosingsubstring {
    public static int maxLength(String str){
        int max=0;
        int dp1[]=new int[str.length()];
        int dp2[]=new int[str.length()];
        if(str.charAt(0)=='<'||str.charAt(0)=='?') dp1[0]=1;
        int n=str.length();
        if(str.charAt(n-1)=='>') dp2[n-1]=0;
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='<'||ch=='?'){
                dp1[i]=1+dp1[i-1];
            }else{
                dp1[i]=0;
            }
        }
        for(int i=n-2;i>=0;i--){
            char ch=str.charAt(i+1);
            if(ch=='>'||ch=='?') dp2[i]=1+dp2[i+1];
        else{
            dp2[i]=0;
        }
    }
    for(int i=0;i<str.length();i++){
        if(dp1[i]==0||dp2[i]==0) continue;
        int v=dp1[i]+dp2[i];
        max=Math.max(max,v);
    }
    return max;
    }
    public static void main(String[] args) {
        String str="";
        System.out.println(maxLength(str));
    }
}
