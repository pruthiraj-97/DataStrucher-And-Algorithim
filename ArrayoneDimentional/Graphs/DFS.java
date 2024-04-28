import java.util.*;
public class DFS {
    static List<Integer> ans=new ArrayList<>();
    public static void dfs(List<List<Integer>> adj,int visit[],int node){
        visit[node]=1;
        ans.add(node);
        for(int num:adj.get(node)){
            if(visit[num]==0){
                 dfs(adj,visit,num);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
