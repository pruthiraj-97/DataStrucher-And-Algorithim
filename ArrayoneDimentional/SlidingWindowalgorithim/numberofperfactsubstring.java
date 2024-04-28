import java.util.*;
public class numberofperfactsubstring {
    public static int perfactString(String str,int k){
        Map<Character,Integer> mp=new HashMap<>();
        int total=0;
        int count=0;
        int j=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            total++;
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }else{
                mp.put(ch,1);
            }
            while(mp.get(ch)>k){
                char c=str.charAt(j);
                mp.put(c,mp.get(c)-1);
                if(mp.get(c)==0) mp.remove(c);
                j++;
                total--;
            }
            if(mp.size()*k==total){
                count++;
                System.out.println(str.substring(j, i+1));
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String str="1102021222";
        System.out.println(perfactString(str,2));
        
    }
}
