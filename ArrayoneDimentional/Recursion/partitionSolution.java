import java.util.*;
public class partitionSolution {
    static List<Integer> ans=new ArrayList<>();
    public static boolean isoperater(char ch){
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/') return true;
        return false;
    }
    public static int evaluate(int left,int right,char ch){
        if(ch=='+') return left+right;
        if(ch=='-')  return left-right;
        if(ch=='*') return left*right;
        return left/right;
    }
    public static boolean isvalidNumber(String str,int i,int j){
        for(int x=i;x<=j;x++){
            char ch=str.charAt(x);
            if(ch>57||ch<48) return false;
        }
        return true;
    }
    public static int f(String str,int i,int j,int dp[][]){
        if(isvalidNumber(str,i,j)){
            return Integer.parseInt(str.substring(i, j+1));
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int max=Integer.MIN_VALUE;
        for(int x=i;x<=j;x++){
            char ch=str.charAt(x);
            if(isoperater(ch)){
              int left=f(str,i,x-1,dp);
              int right=f(str,x+1,j,dp);
              max=Math.max(max, evaluate(left,right,ch));
            }
        }
        return dp[i][j]=max;
    }
    public static void main(String[] args) {
        String str="20*3";
        int dp[][]=new int[str.length()][str.length()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(f(str,0,str.length()-1,dp));;

    }
}
