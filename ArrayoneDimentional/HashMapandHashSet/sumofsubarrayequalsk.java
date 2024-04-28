import java.util.*;
public class sumofsubarrayequalsk {
    public static int show(int arr[],int k){
    Map<Integer,Integer> mp=new HashMap<>();
    int sum=0;
    int prefix=0;
    for(int i=0;i<arr.length;i++){
        prefix+=arr[i];
        if(prefix==k){
            sum++;
        }
        else if(mp.containsKey(prefix-k)){
            sum=sum+mp.get(prefix-k);
        }else if(mp.containsKey(prefix)){
            mp.put(prefix,mp.get(prefix)+1);
        }else if(!mp.containsKey(prefix)){
            mp.put(prefix,1);
        }
    }
    mp.entrySet();
    return sum;
}
    public static void main(String[] args) {
        int arr[]={10, 2, -2, -20, 10};
        System.out.println(show(arr,-10));
        
    }
    
}
