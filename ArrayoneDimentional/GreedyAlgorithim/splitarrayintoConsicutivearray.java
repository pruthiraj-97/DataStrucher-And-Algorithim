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
public class splitarrayintoConsicutivearray {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5};
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
           if(mp.containsKey(arr[i])){
               mp.put(arr[i],mp.get(arr[i])+1);
           }else{
               mp.put(arr[i],1);
           }
       }
       // System.out.println(mp);
       PriorityQueue<pair> ans=new PriorityQueue<>();
       for(var v:mp.entrySet()){
           ans.add(new pair(v.getKey(),v.getValue()));
       }

    }
}
