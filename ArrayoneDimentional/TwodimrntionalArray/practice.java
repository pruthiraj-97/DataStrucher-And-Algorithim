import java.util.*;
public class practice {
    // public static String f(int x,int y){


    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="abcd";

        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int count=0;
        Map<Character,Integer> mp1=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
            mp.put(ch,mp.get(ch)-1);
            if(mp.get(ch)==0) mp.remove(ch);
            if(mp1.size()==mp.size()) count++;
        }
        System.out.println(count);
        
    }
}
