import java.util.*;
public class maximumValueInboundedarray {
    static int max=0;
    public static void f(int i,String str,List<String> ls,Set<String> st){
        if(i==str.length()){
            max=Math.max(max,ls.size());
            return ;
        }
        for(int x=i;x<str.length();i++){
            String s=str.substring(i,x+1);
            if(!st.contains(s)){
                st.add(s);
                ls.add(s);
                f(x+1,str,ls,st);
                st.remove(ls.size()-1);
                ls.remove(ls.size()-1);
            }
        }
    }
    public static void main(String[] args) {
       String str="aba";
       max=0;
       f(0,str,new ArrayList<>(),new HashSet<>());
       System.out.println(max);

    }
}
