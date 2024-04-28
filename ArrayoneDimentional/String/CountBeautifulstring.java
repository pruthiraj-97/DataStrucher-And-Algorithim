import java.util.*;
public class CountBeautifulstring {
    public static boolean f(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o') return true;
        return false;
    }
    public static boolean helper(String str,int k){
        int v=0;
        int c=0;
        for(int i=0;i<str.length();i++){
            if(f(str.charAt(i))) v++;
            else c++;
        }
        if(v==c&&(v*c)%k==0) return true;
        // if(v!=0&&c!=0){
        // if((v*c)%k==0) return true;
        
        return false;
    }
    public static int count(String str,int k){
        int count=0;
          for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                 if(helper(str.substring(i,j+1),k)) count++;
            }
          }
          return count;
    }
    public static void main(String[] args) {
        String str="baeyh";
        int k=2;
        System.out.println(count(str,k));
    }
}
