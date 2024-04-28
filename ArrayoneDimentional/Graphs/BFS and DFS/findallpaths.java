import java.util.*;
public class findallpaths {
    static List<List<Integer>> ans=new ArrayList<>();
    public static void  dfs(List<List<Integer>> adj,int node,List<Integer> arr,int n){
         if(node==n){
            ans.add(arr);
            return ;
         }
         for(int val:adj.get(node)){
            arr.add(val);
            dfs(adj,val,arr,n);
         }
         int x=arr.size()-1;
         arr.remove(x);
    }
    public static void main(String[] args) {
        
    }
}
