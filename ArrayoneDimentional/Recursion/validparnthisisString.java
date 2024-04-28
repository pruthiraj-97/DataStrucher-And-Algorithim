import java.util.*;
public class validparnthisisString {
   public static int[] f(int arr[]){
    Set<Integer> st=new HashSet<>();
    PriorityQueue<Integer> pq=new PriorityQueue<>();
     int ans[]=new int[arr.length];
     for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            int j=i+1;
           for(j=i+1;j<arr.length;j++){
            if(st.contains(arr[j])) break;
           }
           if(j<arr.length){
           ans[i]=arr[j];
           st.remove(arr[j]);
           pq.remove(j);
           }else{
               if(pq.size()==0) ans[i]=1;
               else ans[i]=arr[pq.poll()];
           }
        }
        else{
            if(st.contains(arr[i])){
            System.out.println(st+" "+i);
             return new int[0];
            }
            else{
                st.add(arr[i]);
                ans[i]=-1;
                pq.add(i);
            }
        }
     }
     return ans;
   }
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        int arr[]={1,0,2,0,2,1};
        int ans[]=f(arr);
        for(int i=0;i<ans.length;i++) System.out.print(ans[i]+" ");
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverse(st);)
    }
}
