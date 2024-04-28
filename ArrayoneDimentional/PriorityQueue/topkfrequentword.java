import java.util.*;
class pair implements Comparable<pair>{
    int frequency;
    String str;
    pair(String str,int frequency){
        this.frequency=frequency;
        this.str=str;
    }
    public int compareTo(pair p){
        return p.frequency-this.frequency;
    }
}
public class topkfrequentword {
    public static void main(String[] args) {
         String word[]={"i","love","leetcode","i","love","coding"};
         int k=2;
             List<String> ans=new ArrayList<>();
        PriorityQueue<pair> pq=new PriorityQueue<>();
        Map<String,Integer> mp=new HashMap<>();
        for(int i=0;i<word.length;i++){
            if(mp.containsKey(word[i])){
                mp.put(word[i],mp.get(word[i])+1);
            }else{
                mp.put(word[i],1);
            }
        }
        for(var v:mp.entrySet()){
            pq.add(new pair(v.getKey(),v.getValue()));
        } 
        for(int i=1;i<=k;i++){
            pair p=pq.poll();
            ans.add(p.str);
        }
        System.out.print(ans);
    }
}
