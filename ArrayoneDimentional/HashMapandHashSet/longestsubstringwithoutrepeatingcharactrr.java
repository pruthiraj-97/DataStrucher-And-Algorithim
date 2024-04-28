import java.util.*;
public class longestsubstringwithoutrepeatingcharactrr {
    public static int character(String str){
        if(str.length()==0){
            return 0;
        }
         int max=0;
         int j=0;
        Set<Character> st=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!st.contains(ch)){
                st.add(ch);
            }else{
                max=Math.max(max,st.size());
                while(j<i){
                    if(st.contains(ch)){
                        st.remove(str.charAt(j));
                        j++;
                    }else{
                        break;
                    }
                }
                st.add(ch);
            }
        }
        max=Math.max(max,st.size());
        st.clear();
        return max;
    }
    public static void main(String[] args) {
        String str="pwwkew";
        System.out.println(character(str));
        
    }
    
}
