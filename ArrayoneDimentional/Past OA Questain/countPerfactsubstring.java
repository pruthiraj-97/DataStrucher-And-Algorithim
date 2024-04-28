import java.util.*;
public class countPerfactsubstring {
    public static boolean f(Map<Character,Integer> mp,int k){
        for(var v:mp.entrySet()){
            if(v.getValue()!=k) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="1102021222";
        int count=0;
        int k=2;
        for(int i=0;i<str.length();i++){
            Map<Character,Integer> mp=new HashMap<>();
            for(int j=i;j<str.length();j++){
                char ch=str.charAt(j);
                if(mp.containsKey(ch)) mp.put(ch,mp.get(ch)+1);
                else mp.put(ch,1);
                if(f(mp,k)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
