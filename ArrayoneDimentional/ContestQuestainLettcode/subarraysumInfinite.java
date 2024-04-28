import java.util.*;
public class subarraysumInfinite {
    public int minSizeSubarray(int[] arr, int t) {
        int ans[]=new int[arr.length+arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            ans[i+arr.length]=arr[i];
        }
        int min=Integer.MAX_VALUE;
        Map<Integer,Integer> mp=new HashMap<>();
        int prefix=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
              sum+=arr[i];
        }
        //if(sum%t==0) return sum/t*(arr.length);
        int x=t;
        int l=t/sum;
        t=t%sum;
        for(int i=0;i<ans.length;i++){
            prefix+=ans[i];
            if(prefix==t) min=Math.min(min,i+1);
            if(mp.containsKey(prefix-t)){
                min=Math.min(min,(i-mp.get(prefix-t)));
            }
            mp.put(prefix,i);
        }
        if(x%sum==0) return (x/sum)*(arr.length);
        if(min==Integer.MAX_VALUE) return -1;
        return min+(l*arr.length);

    }
    public static void main(String[] args) {
        
    }
}
