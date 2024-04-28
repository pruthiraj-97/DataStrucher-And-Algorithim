import java.util.*;
class pair  implements Comparable<pair>{
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
public class practice { 
   
    public static void main(String[] args) {
        char arr[]={'A','A','A','B','B','B'};
        int n=2;
        Map<Character,Integer> mp=new HashMap<>();
        Map<Character,Integer> t=new HashMap<>();
       for(int i=0;i<arr.length;i++){
           if(mp.containsKey(arr[i])){
               mp.put(arr[i],mp.get(arr[i])+1);
               t.put(arr[i],0);
           }else{
               mp.put(arr[i],1);
           }
       }
       PriorityQueue<pair> ans=new PriorityQueue<>();
       for(var v:mp.entrySet()){
           ans.add(new pair(v.getKey(),v.getValue()));
       }
       int time=1;
       while(ans.size()>0){
           PriorityQueue<pair> pq=new PriorityQueue<>();
           while(ans.size()>0){
            // System.out.println("***");
               pair p=ans.poll();
               char ch=p.ch;
               int fre=p.frequency;
               if(t.get(ch)==0||t.get(ch)+n>time){
                System.out.println("**");
                   t.put(ch,time);
                   if(fre>1){
                       pq.add(new pair(ch,fre-1));
                   }
                   break;
               }else{
                   pq.add(p);
               }
           }
           time++;
           while(pq.size()>0){
               ans.add(pq.poll());
           }
       }
    }
}
