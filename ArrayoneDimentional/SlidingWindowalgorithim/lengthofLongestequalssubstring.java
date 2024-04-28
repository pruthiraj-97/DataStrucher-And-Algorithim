import java.util.*;
public class lengthofLongestequalssubstring {
    public static int f(List<Integer> arr,int k){
        int max=1;
        int count=1;
        int i=0;
        int j=1;
        for(j=1;j<arr.size();j++){
            k-=arr.get(j)-arr.get(j-1)-1;
            while(k<0&&i<j){
               count--;
               k+=arr.get(i+1)-arr.get(i);
               i++;
            }
            count++;
            max=Math.max(max,count);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,1,1};
     Map<Integer,List<Integer>> mp=new HashMap<>();
      for(int i=0;i<arr.length;i++){
        int num=arr[i];
        if(mp.containsKey(num)){
            mp.get(num).add(i);
        }else{
            List<Integer> ls=new ArrayList<>();
            ls.add(i);
            mp.put(arr[i],ls);
        }
      }
      int max=1;
      for(var v:mp.entrySet()){
         int ans=f(v.getValue(),k);
         max=Math.max(max,ans);
      }
      System.out.println(max);
    }
}
