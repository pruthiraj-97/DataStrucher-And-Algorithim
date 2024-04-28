import java.util.*;
public class shortestLexicograficalstring {
    public static String cheak(String str1,String str2){
        if(str1.compareTo(str2)<0) return str1;
        return str2;
    }
    public static String helper(String str,int k){
           String ans="";
          for(int i=0;i<5;i++){
            ans=ans+1;
          }
          boolean flag=false;
          int j=0;
          int count=0;
          for(int i=0;i<str.length();i++){
               int asci=(int)str.charAt(i);
               if(asci-48==1){
                  count++;
               }
               if(count==k){
                flag=true;
                while(str.charAt(j)=='0'){
                    j++;
                }
                ans=cheak(ans,str.substring(j, i+1));
               // System.out.println(ans);
                while(count==k){
                   int asci1=(int)str.charAt(j);
                   if(asci-48==1){
                    count--;
                   }
                   j++;
               }
               }
          }
          if(flag==true) return ans;
          return "";

    }
    public static void main(String[] args) {
          String str1="100011";
         String str2="1101";
         System.out.println(cheak(str1,str2));
        // String str="100011001";
        // System.out.println(helper(str,3));
        //"10101101101111"
        
    }
}
     