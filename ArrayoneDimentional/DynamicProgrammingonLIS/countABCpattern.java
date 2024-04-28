import java.util.*;
public class countABCpattern {
    public static int f(String str,int i,String s){
       if(s.length()>0&&s.charAt(s.length()-1)=='c') {
        System.out.println(s);
        return 1;
       }
        if(i==str.length()){
            if(s.length()>0&&s.charAt(s.length()-1)=='c') {
                System.out.println(s);
                return 1;
            }
            return 0;
        }
        //if(dp[i]!=-1) return dp[i];
        int pick=0;
        if(s.length()==0&&str.charAt(i)=='a'){
            pick=f(str,i+1,s+str.charAt(i));
        }
        if(s.length()>0){
        if((int)str.charAt(i)-(int)s.charAt(s.length()-1)<=1){
            pick=f(str,i+1,s+str.charAt(i));
        }
    }
        int notpick=f(str,i+1,s);
        return pick+notpick;

    }
    public static void main(String[] args) {
        String str="abcabc";
        int dp[]=new int[str.length()];
        for(int i=0;i<dp.length;i++) dp[i]=-1;
        System.out.println(f(str,0,""));
        int arr[]={5,1,32,7};
        Integer array[] = { 1, 2, 3, 4, 5 };
        Arrays.sort(array, Collections.reverseOrder());
        for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
    }
}
