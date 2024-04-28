import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        String str="hello    world   ";
        Stack<String> st=new Stack<>();
        int i;
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                continue;
            }
            String s="";
            while(i<str.length()&&str.charAt(i)!=' '){
                s=s+str.charAt(i);
                i++;
                
            }
            st.push(s);
        }
        String ans="";
        while(st.size()>0){
            ans=ans+st.pop();
            if(st.size()!=0){
                ans=ans+" ";
            }
        }
        System.out.println(ans);
        
        
        
    }
}
