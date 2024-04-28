import java.util.*;
public class largestodnumberinastring {
        public static String largestOddNumber(String str) {
    for(int i=str.length()-1;i>=0;i--){
        char ch=str.charAt(i);
        int asci=(int)ch;
        int num=asci-48;
        if(num%2!=0){
            String ans=str.substring(0, i+1);
            return ans;
            }
        } 
    

    return "";
}
    public static void main(String[] args) {
        String str="4206";
        System.out.println(largestOddNumber(str));

        
    }
    
}
