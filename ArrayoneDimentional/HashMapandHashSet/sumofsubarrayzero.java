import java.util.*;
public class sumofsubarrayzero {
    public static long helper(long arr[]){
        int count=0;
        Map<Long,Integer> mp=new HashMap<>();
        int z=0;
        long s=(long)z;
        mp.put(s,1);
        long prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix=prefix+arr[i];
            if(mp.containsKey(prefix)){
                count=count+mp.get(prefix);
                mp.put(prefix,mp.get(prefix)+1);
            }else{
                mp.put(prefix,1);
            }
        }
         Long k=(long)count;
         return k;
    }
    public static void main(String[] args) {
        long arr[]={0,0,5,5,0,0};
        System.out.print(helper(arr));
        
    }
}
