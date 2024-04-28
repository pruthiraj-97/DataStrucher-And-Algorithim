import java.util.*;
class pair implements Comparable<pair>{
      int value;
      int frequency;
      pair(int value,int frequency){
        this.value=value;
        this.frequency=frequency;
      }

      public int compareTo(pair p){
        return p.frequency-this.frequency;
      }
}
public class sortarraybyfrequency {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(var v:mp.entrySet()){
            System.out.print(v.getKey());
            pq.add(new pair(v.getKey(),v.getValue()));
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(pq.size()>0){
             pair p=pq.poll();
             for(int i=1;i<=p.frequency;i++){
                ans.add(p.value);
             }
        }
        System.out.print(ans);
    }
}
