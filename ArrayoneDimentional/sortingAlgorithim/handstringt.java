import java.util.*;
public class handstringt {
    public static boolean cheak(int arr[],int k){
        TreeMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        while(mp.size()>0){
            
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,2,3,4,7,8};
        System.out.println(cheak(arr,3));
    }
}
