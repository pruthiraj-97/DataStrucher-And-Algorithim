import java.util.*;
public class countofsubarraysumequaszero{
    public static int countzero(int arr[]){
        int count=0;
        int prefix=0;
        Map<Integer,Integer> mp=new HashMap<>();
         Map<Integer,Integer> mp1=new HashMap<>();
        

        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(mp.containsKey(prefix)){
            count+=mp.get(prefix);
            mp.put(prefix,mp.get(prefix)+1);
            }else{
               mp.put(prefix,1);
            }
        }
        return count;
    }
    public static void main(String[] args){
        int arr[]={2,-1,-1,3,-1,5,-2};
        System.out.println(countzero(arr));

        
    }
    
}
