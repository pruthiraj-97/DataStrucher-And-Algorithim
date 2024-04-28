import java.util.*;
public class practice {
   public static boolean cheak(List<Integer> arr,int l){
        int count=0;
        for(int i=0;i<arr.size();i++){
          count+=arr.get(i) - l + 1;
        }
        return count>=3;
   }
   public static int f(List<Integer> arr){
       int ans=0;
       int x=1;
       int y=arr.get(arr.size()-1);
       while(x<=y){
         int mid=(x+y)/2;
         if(cheak(arr,mid)){
            ans=Math.max(ans, mid);
            x=mid+1;
         }else{
            y=mid-1;
         }
       }
       System.out.println(ans);
       return ans;
   }
   public static int maxCount(String str){
         Map<Character,List<Integer>> mp=new HashMap<>();
         int j=0;
         int i=0;
         for(i=0;i<str.length()-1;i++){
             if(str.charAt(i)!=str.charAt(i+1)){
                if(mp.containsKey(str.charAt(i))){
                  mp.get(str.charAt(i)).add(i-j+1);
                }else{
                  List<Integer> ls=new ArrayList<>();
                  ls.add(i-j+1);
                  mp.put(str.charAt(i),ls);
                }
                j=i+1;
             }
         }
           if(mp.containsKey(str.charAt(i))){
                  mp.get(str.charAt(i)).add(i-j+1);
                }else{
                  List<Integer> ls=new ArrayList<>();
                  ls.add(i-j+1);
                   mp.put(str.charAt(i),ls);
                }
         int max=0;
         System.out.println(mp);
         for(var v:mp.entrySet()){
         Collections.sort(v.getValue());
         max=Math.max(max,f(v.getValue()));
        }
        if(max==0) return -1;
        return max;
   }
      public static void main(String[] args) {
        System.out.println(maxCount("aaaa"));
        c
      }
}
