import java.util.*;
public class rotatestring {
    public static boolean cheak(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        for(int i=0;i<str1.length();i++){
            String s1=str1.substring(i,str1.length());
            String s2=str2.substring(0,str2.length()-i);
            //String s3=
            String s3=str1.substring(0,i);
            String s4=str2.substring(s1.length(),str2.length());
            if(s1.equals(s2)){
                if(s3.equals(s4)){
                    return true;
                }else{
                    System.out.println(s3);
                    System.out.println(s4);
                }
            }
            else{

            }
        }
        return false;
       
        
    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="cdeab";
        System.out.println(cheak(str1,str2));
        
    }
    
}
