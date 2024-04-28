import java.util.*;
class pair {
    int node;
    int dis;
    pair(int node,int dis){
        this.node=node;
        this.dis=dis;
    }
}
public class numberOfrestrictedPath {
    public static boolean cheak(ArrayList<ArrayList<Integer>>adj,int node,int visit[],int curr){
        visit[node]=curr;
        for(int val:adj.get(node)){
            if(visit[val]!=-1&&visit[val]==curr){
                 return false;
            }else if(visit[val]==-1){
                int next=(curr==0)?1:0;
                if(!cheak(adj,val,visit,next)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<3;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);

        int visit[]=new int[3];
        for(int i=0;i<visit.length;i++){
            visit[i]=-1;
        }
        System.out.println(cheak(adj,0,visit,0));
    }
}
