import java.util.*;
public class practice {
    public static boolean isSequence(String prev,String curr){
        if(prev.length()==curr.length()) return false;
        Set<Character> st=new HashSet<>();
        for(int i=0;i<curr.length();i++){
            st.add(curr.charAt(i));
        }
        for(int i=0;i<prev.length();i++){
            if(st.contains(prev.charAt(i))) st.remove(prev.charAt(i));
        }
        return st.size()==1;
    }
    public static int f(String str[],int curr,int prev){
        if(curr==str.length) return 0;
        int pick=Integer.MIN_VALUE;
        if(prev==-1||isSequence(str[prev],str[curr])){
            pick=1+f(str,curr+1,curr);
        }
        int notpick=f(str,curr+1,prev);
        return Math.max(pick,notpick);
    }
    public static void main(String[] args) {
       String str[]={"a","b","bdca","bca","bda"};
       Comparator<String> com=new Comparator<String>() { // aninimus class
            public int compare(String str1,String str2){ // sort on basic of bubble sort
               if(str1.length()>str2.length()) return 1;
               return -1;
            }
        };
       Arrays.sort(str,com);
       System.out.println(f(str,0,-1));

    }
}
