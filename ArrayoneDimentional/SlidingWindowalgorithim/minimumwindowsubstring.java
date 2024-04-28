import java.util.*;
public class minimumwindowsubstring {
    public static boolean isValid(Map<Character,Integer> mp,Map<Character,Integer> mp1,String str){
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(mp.get(ch)>mp1.get(ch)) return false;
        }
        return true;
    }
    public static String f(String s,String t){
        Map<Character,Integer> mp=new HashMap<>();
        Map<Character,Integer> mp1=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(mp.containsKey(ch)) mp.put(ch,mp.get(ch)+1);
            else mp.put(ch,1);
            mp1.put(ch,0);
        }
        String str="";
        int min=Integer.MAX_VALUE;
        int count=0;
        int j=0;
        int i=0;
        for(i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(mp1.containsKey(ch)){
             mp1.put(ch,mp1.get(ch)+1);
             count++;
            }
            while(count>=t.length()){
                char c=s.charAt(j);
                if(mp1.containsKey(c)){
                    if(mp1.get(c)>mp.get(c)){
                    mp1.put(c,mp1.get(c)-1);
                    count--;
                    }
                    else{
                        break;
                    }
                }
                j++;
                }
            
            if(count>=t.length()&& isValid(mp,mp1,t)){
                min=Math.min(min,i-j+1);
                str=s.substring(j,i+1);
            }
        }
        System.out.println(mp1);
        System.out.println(str);
        System.out.println(min);
        return str;

    }
    public static void main(String[] args) {
        System.out.println(f("ADOBECODEBANC","ABC"));
    }
}
