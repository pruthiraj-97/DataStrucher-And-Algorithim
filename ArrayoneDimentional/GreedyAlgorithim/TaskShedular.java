import java.util.*;
class pair implements Comparable<pair>{
    int fre;
    Character ch;
    pair(int fre,Character ch){
        this.fre=fre;
        this.ch=ch;
    }
    public int compareTo(pair p){
        return p.fre-this.fre;
    }
    
}
public class TaskShedular {
    public static int cout(char ch[]){
        int c=0;
        int k=2;
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            if(mp.containsKey(ch[i])) mp.put(ch[i],mp.get(ch[i])+1);
            else mp.put(ch[i], 1);
        }
        int track[]=new int[26];
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(var v:mp.entrySet()){
            pq.add(new pair(v.getValue(),v.getKey()));
        }

        while(pq.size()>0){

            PriorityQueue<pair> pq2=new PriorityQueue<>();

            while(pq.size()>0){
                 pair p1=pq.poll();
                  int j=track[p1.ch-'A'];
                 if(j==0||track[j]+k+1<=c+1){
                track[j]=c+1;
              //  c++;
                if(p1.fre>1){
                    pq2.add(new pair(p1.fre-1,p1.ch));
                }
                break;
            }else{
                pq2.add(p1);
            }
            }

            c++;
             while(pq2.size()>0){
                pq.add(pq2.poll());
            }
        }
        
        return c;
        
       // return 5;
    }
    public static void main(String[] args) {
        char ch[]={'A','A','A','B','B','B'};
        System.out.println(cout(ch));
        
    }
}
