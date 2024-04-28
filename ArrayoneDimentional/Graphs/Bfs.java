import java.util.*;
public class Bfs {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q=new ArrayDeque<>(); 
        int visit[]=new int[adj.size()];
        q.add(0);visit[0]=1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(q.size()>0){
            int val =q.poll();
            ans.add(val);
            for(int node:adj.get(val)){
                 if(visit[node]==0){
                    visit[node]=1;
                    q.add(node);
                 }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();

       ArrayList<Integer> adj=new ArrayList<>();



    }
}
