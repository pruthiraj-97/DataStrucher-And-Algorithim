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
public class kmostfrequentelementList {
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
        List<pair> ans=new ArrayList<>();
        for(var v:mp.entrySet()){
            ans.add(new pair(v.getKey(),v.getValue()));
        }
         Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
            pair p=ans.get(i);
            System.out.println(p.value+" "+p.frequency);
        }
        int a[]=new int[k];
        int x=0;
        for(int i=ans.size()-1;i>=ans.size()-k;i--){
            pair p=ans.get(i);
            a[x++]=p.value;
        }
        System.out.println();
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int kkk[]={1,2,3};
        int f=kkk['C'-'A'];
        System.out.println(f+"++++");
    }
}
