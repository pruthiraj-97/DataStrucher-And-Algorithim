import java.util.*;
public class practice {
    public static void helper(int arr[]){
       
    }
    public static void main(String[] args) {
        String str="}{{}}{{{";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(st.size()==0){
                st.push(ch);
            }else{
                if(ch=='{') st.push(ch);
                else{
                    if(st.peek()=='{') st.pop();
                    else st.push(ch);
                }
            }
        }
        System.out.println(st);
        int count=0;
        if(st.size()%2!=0) System.out.println(-1);
        while(st.size()>0){
            char c1=st.pop();
            char c2=st.pop();
            if(c1=='{'&&c2=='{' || c1=='}'&&c2=='}') count++;
            else count=count+2;
        }
        System.out.println(count);
    }
}
