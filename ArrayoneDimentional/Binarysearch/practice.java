import java.lang.annotation.Retention;
import java.util.*;
public class practice {
    public static long maxSum(int arr[],int x,int y,long prefix[]){
        // long max=Integer.MIN_VALUE;
        long sum=0;
        if(x==0) sum=prefix[y];
        else sum=prefix[y]-prefix[x-1];
       return sum;
    }
  public static long f(int arr[],int k,long prefix[]){
    Map<Integer,List<Integer>> mp=new HashMap<>();
    long max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        int sum1=arr[i]+k;
        int sum2=arr[i]-k;
        if(mp.containsKey(sum1)){
           for(int x=0;x<mp.get(sum1).size();x++){
           max=Math.max(max,maxSum(arr,mp.get(sum1).get(x),i,prefix));
           }
        }
        if(mp.containsKey(sum2)){
            for(int x=0;x<mp.get(sum2).size();x++){
                max=Math.max(max,maxSum(arr,mp.get(sum2).get(x),i,prefix));
                }
        }
        if(mp.containsKey(arr[i])) mp.get(arr[i]).add(i);
        else{
            List<Integer> ls=new ArrayList<>();
            ls.add(i);
             mp.put(arr[i],ls);
        }
    }
    if(max==Integer.MIN_VALUE) return 0;
    return max;
  }
   public static void main(String[] args) {
    int arr[]={-1,3,2,4,5};
    long prefix[]=new long[arr.length];
    prefix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
        prefix[i]=prefix[i-1]+arr[i];
    }
    
    int k=3;
         System.out.println(f(arr,k,prefix));
         


    }
}
