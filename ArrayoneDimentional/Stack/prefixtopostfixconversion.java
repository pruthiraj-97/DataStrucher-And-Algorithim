import java.util.*;
public class prefixtopostfixconversion {
    public static void main(String[] args) {
        String str = "ABC/-AK/L-*";
        Stack<String> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int asci=(int)ch;
            if(asci>=65&&asci<=90){
                String s=""+ch;
                st.push(s);
            }else{
                String val2=st.pop();
                String val1=st.pop();
                String t=ch+val1+val2;
                st.push(t);
            }
        }
        System.out.println(st.peek());
    }
    
}
