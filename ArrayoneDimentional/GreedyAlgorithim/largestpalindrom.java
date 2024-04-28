import java.util.*;
public class largestpalindrom {
    public static boolean cheak(String str){
        int arr[]=new int[10];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int asci=(int)ch;
            arr[asci-48]++;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) count++;
        }
        return count==1;
    }
    public static String f(String str){
         int arr[]=new int[10];
        for(int i=0;i<str.length();i++){
            int ch=str.charAt(i)-'0';
            System.out.println(ch);
            int asci=((int)ch)-48;
            arr[ch]++;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) count++;
        }
        String str1="";
        String str2="";
        int x=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]%2!=0) x=i;
            int y=arr[i]/2;
            while(y>0){
                str1=str1+i;
                str2=str2+i;
                y--;
            }
        }
        System.out.println(str1+" "+str2);
        if(x!=-1) str1=str1+x;
        for(int i=str2.length()-1;i>=0;i--){
            str1=str1+str2.charAt(i);
        }
        return str1;
    }
    public static void main(String[] args) {
        String str="444947137";
        if(!cheak(str)){
            System.out.println(-1);
        }else{
            System.out.println(1);
        }
        System.out.println(f(str));
    }
}
