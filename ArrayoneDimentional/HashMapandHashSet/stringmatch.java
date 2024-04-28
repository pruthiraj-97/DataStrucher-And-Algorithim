import java.util.*;
public class stringmatch {
    public static boolean closeStrings(String str1, String str2) {
        Map<Character,Integer> mp1=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(mp1.containsKey(ch)){
                mp1.put(ch,mp1.get(ch)+1);
            }else{
                mp1.put(ch,1);
            }
        }
        Map<Character,Integer> mp2=new HashMap<>();
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(mp2.containsKey(ch)){
                mp2.put(ch,mp2.get(ch)+1);
            }else{
                mp2.put(ch,1);
            }
        }
        for(var v:mp1.entrySet()){
                boolean bn=true;
                char c=v.getKey();
                int x=v.getValue();
                  System.out.println(mp2);
                for(var k:mp2.entrySet()){
                    if(k.getValue()==x){
                        mp2.remove(k.getKey());
                        bn=false;
                        break;
                    }
                }
                if(bn==true) return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="cabbba";        ;
        String str2="abbccc";
        System.out.println(closeStrings(str1,str2));
    }
}
