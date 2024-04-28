import java.util.*;
public class abcpattern {
    public static int count(String str,int i,String s,int prev){
         int take=0;
         int asci=(int)str.charAt(i);
         if(prev==0&&str.charAt(i)=='a'){
             take=count(str,i+1,s+str.charAt(i),i);
         }
         if(str.charAt(i)-str.charAt(prev)<=1){
            take=count(str,i+1,s+str.charAt(i),i);
         }
    }
    public static void main(String[] args) {
        String str="abcabc";
        Map<Character,Integer> mp=new HashMap<>();
        System.out.println(count(str,mp,0));
    }
}
