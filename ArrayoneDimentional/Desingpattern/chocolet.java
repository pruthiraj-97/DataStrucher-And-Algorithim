import java.util.*;
public class chocolet {
    public static boolean isvalid(String str,int track[]){
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(var v:mp.entrySet()){
            char ch=v.getKey();
            if(track[ch-'a']<v.getValue()){
                return false;
            }
        }
        return true;
    }
    public static int value(String str,int arr[],int track[]){
        int val=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            val+=arr[ch-'a'];
            track[ch-'a']--;
        }
        return val;
    }
    public static void backtrack(String str,int track[]){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            track[ch-'a']++;
        }
    }
    public static int f(String[] word,int[] arr,int track[],int i){
        if(i==word.length) return 0;
        // pick
        int pick=0;
        if(isvalid(word[i],track)){
            int val=value(word[i],arr,track);
            pick+=val+f(word,arr,track,i+1);
        }
        backtrack(word[i],track);
        //notpick
        int notpick=f(word,arr,track,i+1);
        return Math.max(notpick,pick);
    }
    public static void main(String[] args) {
        int track[]=new int[26];
        for(int i=0;i<let.length;i++){
            char ch=let[i];
            track[ch-'a']++;
        }
        System.out.println();
        
    }
}
