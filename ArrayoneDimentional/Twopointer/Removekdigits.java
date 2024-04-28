import java.util.*;
public class Removekdigits {
    public static void main(String[] args) {
        String str="10200";
        int k=1;
        int x=0;
        Deque<Integer> st=new ArrayDeque<>();
        int i=0;
        while(i<str.length()&&x<k){
              char ch=str.charAt(i);
            int asci=(int)ch;
            int ans=asci-48;
           if(st.size()==0){
            st.addLast(ans);
           }else if(st.peekLast()>ans){
             st.pollLast();
             st.addLast(ans);
             x++;
           }else{
            st.addLast(ans);
           }
           i++;
      }
        System.out.println(st);
        while(i<str.length()){
             char ch=str.charAt(i);
            int asci=(int)ch;
            int ans=asci-48;
            st.addLast(ans);
            i++;

        }
        while(x<k){
            st.pollLast();
            x++;
        }
        while(st.size()>0&&st.peekFirst()==0){
            st.pollFirst();
        }
        String s="";
        if(st.size()==0){
            s=s+"0";
            System.out.println(s);
        }
        while(st.size()>0){
            s=s+st.pollFirst();
        }
        System.out.println(s);
        
        
    }
    
}
