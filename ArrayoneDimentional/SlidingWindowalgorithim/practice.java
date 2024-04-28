import java.lang.reflect.Array;
import java.util.*;
public class practice {
    public static int f(int arr[],int k){
       List<Integer> ans=new ArrayList<>();
      int max=arr[0];
      for(int i=0;i<arr.length;i++){
        max=Math.max(max,arr[i]);
      }
       max=3;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==max){
            ans.add(i);
        }
      }
      if(ans.size()<k) return 0;
      int i=0;
      int j=k-1;
      int count=0;
      while(j<ans.size()){
         count++;
         count+=arr.length-ans.get(j)-1;
         count+=ans.get(i);

          count-=i;
         j++;
         i++;
         System.out.println(count);
      }
      return count;
    }



    public static void main(String[] args) {
        int arr[]={61,23,38,23,56,40,82,56,82,82,82,70,8,69,8,7,19,14,58,42,82,10,82,78,15,82};
         System.out.println(f(arr,2));
         Deque<Integer> dq=new ArrayDeque<>();
         TreeMap<Integer, String> treeMap = new TreeMap<>();

         // Adding elements to the TreeMap
         treeMap.put(3, "Three");
         treeMap.put(1, "One");
         treeMap.put(2, "Two");
 
         // Getting the first element (smallest key)
         System.out.println(treeMap.lastKey());
         class StockPrice {
          Map<Integer, Integer> mp = new HashMap<>();
          PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
          PriorityQueue<Integer> min=new PriorityQueue<>();
          int last=0;
          public StockPrice() {
              mp = new TreeMap<>();
              max=new PriorityQueue<>(Collections.reverseOrder());
              min=new PriorityQueue<>();
              last=0;
          }
          
          public void update(int time, int price) {
              last=Math.max(last,time);
              if(mp.containsKey(time)){
                  int val=mp.get(time);
                  max.remove(val);
                  min.remove(val);
              }
              max.add(price);
              min.add(price);
              mp.put(time,price);
              
          }
          
          public int current() {
              return mp.get(last);
          }
          
          public int maximum() {
              return max.peek();
          }
          
          public int minimum() {
              return min.peek();
          }
      }
        }
}
