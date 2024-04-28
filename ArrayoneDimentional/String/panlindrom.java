import java.util.*;
public class panlindrom {
    public static boolean palindrom(String str){
         String s="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int asci=(int)ch;
            if(ch=='_'){
                continue;
            }
            if((asci>=97||asci>=65)&&(asci<=122||asci<=90)){
                    s=s+Character.toLowerCase(ch);
            }
            if(asci>=48&&asci<=57){
                s=s+ch;
            }
        }
        int x=0;
        int y=s.length()-1;
        while(x<y){
            if(s.charAt(x)!=s.charAt(y)){
                return false;
            }
            x++;
            y--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="Marge, let's \\\"[went].\\\" I await {news} telegram.";
        System.out.print(palindrom(str));
       char c=']';
       int asci=(int)c;
       System.out.print(asci);
       int x=9;
       int y=(int)Math.sqrt(x);
       System.out.println(y);
    }
}
