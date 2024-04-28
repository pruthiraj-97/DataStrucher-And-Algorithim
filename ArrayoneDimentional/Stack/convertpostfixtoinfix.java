import java.util.*;
public class convertpostfixtoinfix {
    public static void main(String[] args) {
        String str="AB*c+";
        Stack<String> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int asci=(int)ch;
            if((asci>=97||asci>=65)&&(asci<=122||asci<=97)){
                String s=""+ch;
                st.push(s);
            }else{
                String val2=st.pop();
                String val1=st.pop();
                String t="("+val1+ch+val2+")";
                st.push(t);
            }
        } 
        System.out.println(st.pop());
        
    }
    
}
