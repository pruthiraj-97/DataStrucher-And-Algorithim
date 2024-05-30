import java.util.*;
public class partitionuniquesubstring {
    public static boolean palindrom(String str,int x,int y){
        while(x<y){
            if(str.charAt(x)!=str.charAt(y)) return false;
            x++;
            y--;
        }
        return true;
    }
    public static void f(String str,int i,List<String> ans){
        for(int x=i;x<str.length();x++){
            if(palindrom(str,x,i)){
                ans.add(str.substring(i,x+1));
            }
            f(str,x+1,ans);
        }
    }
    public static void main(String[] args) {
       String str="aabaacd";
       List<String> ans=new ArrayList<>();
       f(str,0,ans);
       System.out.println(ans);
    }
}
