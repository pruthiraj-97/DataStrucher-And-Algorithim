import java.util.*;
public class AddBinarystring {
    public static void main(String[] args) {
        String str1="1101";
        String str2="111";
        String ans="";
        int c=0;
        int i=str1.length()-1;
        int j=str2.length()-1;
        while(i>=0&&j>=0){
            int num1= str1.charAt(i)- '0';
            int num2= str2.charAt(j)- '0';
            int sum=num1+num2+c;
            if(sum<=1){
              ans=sum+ans;
              c=sum/2;
            }else{
               ans=sum%2+ans;
               c=sum/2;
            }
            i--;
            j--;
        }
        System.out.println(ans);
        while(i>=0){
            int sum=str1.charAt(i)- '0'+c;
            if(sum<=1){
              ans=sum+ans;
              c=sum/2;
            }else{
               ans=sum%2+ans;
               c=sum/2;
            }
            i--;
        }
         while(j>=0){
            int sum=str2.charAt(j)- '0'+c;
            if(sum<=1){
              ans=sum+ans;
              c=sum/2;
            }else{
               ans=sum%2+ans;
               c=sum/2;
            }
            j--;
        }
        if(c>0){
            ans=c+ans;
        }
        System.out.println(ans);
    }
}
