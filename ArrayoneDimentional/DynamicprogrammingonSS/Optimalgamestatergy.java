import java.util.*;
public class Optimalgamestatergy {
    // public static int f(int arr[],int i,int j,int dp[][]){
    //     if(i==j) return arr[i];
    //     if(i>j) return 0;
    //     if(dp[i][j]==-1) return dp[i][j];
    //     int s1=arr[i]+Math.min(f(arr,i+2,j,dp),f(arr,i+1,j-1,dp));
    //     int s2=arr[j]=Math.min(f(arr,i,j-2,dp),f(arr,i+1,j-1,dp));
    //     return dp[i][j]=Math.max(s1,s2);
    // }
    // public static long f(String str,int prev,int curr,int c,int dp[][][]){
    //     if(curr==str.length()){
    //         if(c==3) return 1;
    //         return 0;
    //     }
    //     if(dp[prev+1][curr][c]!=-1) return dp[prev+1][curr][c];
    //     long pick=0;
    //     if(prev==-1||str.charAt(prev)!=str.charAt(curr)){
    //        pick=f(str,curr,curr+1,c+1,dp);
    //     }
    //     long notpick=f(str,prev,curr+1,c,dp);
    //     return dp[prev+1][curr][c]=pick+notpick;

    // }
    public static void main(String[] args) {
       
    String str="001101";
    int dp1[][]=new int[str.length()][2];
    int dp2[][]=new int[str.length()][2];
    int i=0;
    int j=str.length()-1;
    while(i<str.length()){
        char ch1=str.charAt(i);
        char ch2=str.charAt(j);
        if(ch1=='0'){
            dp1[i][0]=(i-1<0)?1:dp1[i-1][0]+1;
        }else{
            dp1[i][0]=(i-1<0)?0:dp1[i-1][0];
        }
        if(ch1=='1'){
            dp1[i][1]=(i-1<0)?1:dp1[i-1][1]+1;
        }else{
            dp1[i][1]=(i-1<0)?0:dp1[i-1][1];
        }
        if(ch2=='0'){
            dp2[j][0]=(j+1>=str.length())?1:dp2[j+1][0]+1;
        }else{
            dp2[j][0]=(j+1>=str.length())?0:dp2[j+1][0];
        }
        if(ch2=='1'){
            dp2[j][1]=(j+1>=str.length())?1:dp2[j+1][1]+1;
        }else{
            dp2[j][1]=(j+1>=str.length())?0:dp2[j+1][1];
        }
        i++;
        j--;
    }
    for(i=0;i<dp1.length;i++){
        System.out.println(dp2[i][0]+" "+dp2[i][1]);
    }
    long count=0;
    for( i=1;i<str.length()-1;i++){
        char ch=str.charAt(i);
        if(ch=='0'){
            count+=dp1[i-1][1]*dp2[i+1][1];
            System.out.println(count);
        }else{
          count+=dp1[i-1][0]*dp2[i+1][0];
          System.out.println(count);
        }
    }
    System.out.println(count);
    }
}
