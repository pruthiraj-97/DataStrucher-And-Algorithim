import java.util.*;
class pair  implements Comparable<pair>{
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
public class topkfrequentelementM2 {
    PriorityQueue<Integer> p=new PriorityQueue<>();
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,5,4,3,3};
        int k=2;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{   
                mp.put(arr[i],1);
            }
        }
        System.out.println(mp);
        PriorityQueue<pair> ans=new PriorityQueue<>();
        for(var v:mp.entrySet()){
            ans.add(new pair(v.getKey(),v.getValue()));
        }
        topkfrequentelementM2 m=new topkfrequentelementM2();
        m.p.add(3);
        m.p.add(56);
        System.out.println(m.p);
           int a[]=new int[k];
           int i=0;
           while(ans.size()>0){
            pair p=ans.poll();
               a[i++]=p.value;
               if(i==k) break;
           }
           for( i=0;i<a.length;i++){
               System.out.print(a[i]+" ");
           }
    }
}
