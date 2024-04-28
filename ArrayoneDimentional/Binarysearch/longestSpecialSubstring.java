import java.util.*;
public class longestSpecialSubstring {
    public static boolean cheak(List<Integer> arr,int l){
        int count=0;
        for(int i=0;i<arr.size();i++){
          if(arr.get(i)-l + 1>0){
              count+=arr.get(i)-l + 1;
          }
        }
        return count>=3;
   }
   public static int f(List<Integer> arr,int n){
       int ans=0;
       int x=1;
       int y=n;
       while(x<=y){
         int mid=(x+y)/2;
         if(cheak(arr,mid)){
            ans=Math.max(ans, mid);
            x=mid+1;
         }else{
            y=mid-1;
         }
       }
       return ans;
   }
    public int maximumLength(String str) {
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
        for(var v:mp.entrySet()){
         max=Math.max(max,f(v.getValue(),str.length()));
        }
        if(max==0) return -1;
        return max;
    }
    public static void main(String[] args) {
        
    }
}
