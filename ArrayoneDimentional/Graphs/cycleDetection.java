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
        List<List<Integer>> adj=new ArrayList<>();
        int visit[]=new int[adj.size()];
        boolean flag=false;
        for(int i=0;i<adj.size();i++){
            if(visit[i]==0){
                visit[i]=1;
                boolean bn=f(adj, visit, i, -1);
                if(bn==true){
                    flag=true;
                    break;
                }
            }
        }
    }
}
