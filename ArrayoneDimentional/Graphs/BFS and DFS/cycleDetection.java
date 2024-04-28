import java.util.*;
public class cycleDetection {
    public static boolean f(List<List<Integer>> adj,int visit[],int curr,int prev){
        for(int node:adj.get(curr)){
           if(visit[node]==0){
               if(f(adj, visit, node, curr)) return true;
           }
           else if(visit[node]==1&&node!=prev) return true;
        }
        return false;
   }
    public static void main(String[] args) {
        
    }
}
