import java.util.*;
public class lengthoflongestgoodsubarray {
   
    public static int f(int arr[],int k){
        int j=0;
         Map<Integer,Integer> mp=new HashMap<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
         int num=arr[i];
         if(mp.containsKey(num)) mp.put(num,mp.get(num)+1);
         else mp.put(num,1);
         while(mp.get(num)>k){
            int n=arr[j];
            mp.put(n,mp.get(n)-1);
            if(mp.get(n)==0) mp.remove(n);
            j++;
         }
         max=Math.max(max,i-j+1);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,2,1,2,1,2};
        System.out.println(f(arr,1));
    }
}
