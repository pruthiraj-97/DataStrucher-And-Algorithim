import java.util.*;
import java.util.*;
class pair  implements Comparable<pair>{
    int value;
    int frequency;
    pair(int value,int frequency){
        this.value=value;
        this.frequency=frequency;
    }
    public int compareTo(pair p){
        return p.value-this.value;
    }
}
public class reductionoperationtoarrayequal {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3};
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{   
                mp.put(arr[i],1);
            }
        }
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(var v:mp.entrySet()){
            pq.add(new pair(v.getKey(),v.getValue()));
        }
        System.out.println(pq.peek().value);
        int count=0;
        while(pq.size()>1){
             pair p1=pq.poll();
             pair p2=pq.poll();
             count+=p1.frequency;
             System.out.println("*****");
             pq.add(new pair(p2.value,p2.frequency+p1.frequency));
        }
        System.out.println(count);
    }
}
