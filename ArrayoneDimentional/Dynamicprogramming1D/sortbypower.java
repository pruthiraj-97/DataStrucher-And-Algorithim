import java.util.*;
class pair{
    int val;
    int pow;
    pair(int val,int pow){
        this.val=val;
        this.pow=pow;
    }
}
public class sortbypower {
    public static int f(int num,Map<Integer,Integer> mp){
        if(num==1) return 0;
        if(mp.containsKey(num)) return mp.get(num);
        if(num%2==0){
            int ans=1+f(num/2,mp);
            mp.put(num,ans);
            return ans;
        }else{
            int ans=1+f(3*num+1,mp);
            mp.put(num,ans);
            return ans;
        }
    }
    public static void main(String[] args) {
        int lo=7;
        int hi=11;
        int dp[]=new int[3*1000+2];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        pair arr[]=new pair[hi-lo+1];
        Map<Integer,Integer> mp=new HashMap<>();
        int x=0;
        for(int i=lo;i<=hi;i++){
            arr[x++]=new pair(i,f(i,mp));
        }
        Comparator<pair> com=new Comparator<pair>() {
            public int compare(pair p1,pair p2){
                if(p1.pow>p2.pow) return 1;
                else if(p1.pow<p2.pow) return -1;
                else{
                    if(p1.val>p2.val) return 1;
                    else return 0;
                }
            }
        };
      Arrays.sort(arr,com);
      int k=4;
      for(int i=0;i<arr.length;i++){
        if(i>0&&arr[i].val==arr[i-1].val) continue;
        else if(k==1) {
            System.out.println(arr[i].val);
            break;
        }else{
            k--;
        }
      }
    }
}
