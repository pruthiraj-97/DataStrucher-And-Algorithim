import java.util.*;
class pair implements Comparable<pair>{
    char ch;
    int frequency;
    pair(char ch,int frequency){
        this.ch=ch;
        this.frequency=frequency;
    }
    public int compareTo(pair p){
        return p.frequency-this.frequency;
    }
}
public class sortcharacterbyfrequency {
    public static void main(String[] args) {
        String str="tree";
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }else{
                mp.put(ch,1);
            }
        }
        List<pair> ans=new ArrayList<>();
        for(var v:mp.entrySet()){
           ans.add(new pair(v.getKey(),v.getValue()));
        }
        Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
            pair p=ans.get(i);
            System.out.println(p.ch+" "+p.frequency);
        }
        String s="";
        for(int i=0;i<ans.size();i++){
            pair p=ans.get(i);
            for(int j=1;j<=p.frequency;j++){
                 s=s+p.ch;
            }
        }
        System.out.print(s);
    }
}
