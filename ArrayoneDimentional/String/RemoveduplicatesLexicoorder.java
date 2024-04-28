import java.util.*;
public class RemoveduplicatesLexicoorder {
    public static String remove(String str){
        String ans="";
        // frequency characater
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i),i);
            }else{
                mp.put(str.charAt(i),i);
            }
        }
        // visited hast set
        Stack<Integer> st=new Stack<>();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.charAt(i);i++){
            char ch=str.charAt(i);
            while(st.size()>0&&str.charAt(st.peek())>ch&&!set.contains(ch)){
                if(mp.get(str.charAt(st.peek()))!=st.peek()){
                    st.pop();
                }else{
                    break;
                }
            }
            if(!set.contains(ch)){
                set.add(ch);
                st.add(i);
            }
        }
        while(st.size()>0){
            ans=ans+str.charAt(st.pop());
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="cbacdcbc";
        System.out.println(remove(str));
    }
}
