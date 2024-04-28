import java.util.*;
class pair{
    int node;
    int dis;
    pair(int node,int dis){
        this.node=node;
        this.dis=dis;
    }
}
public class shortestpathinundirect {
    public static int[] shortestpath(List<List<Integer>> adj,int n,int s){
        int dis[]=new int[n];
        for(int i=0;i<dis.length;i++) dis[i]=Integer.MAX_VALUE;
        dis[s]=0;
        Queue<Integer> q=new ArrayDeque<>();
        q.add(s);
        while(q.size()>0){
            int node=q.poll();
            for(int val:adj.get(node)){
                if(dis[val]>1+dis[node]){
                    dis[val]=1+dis[node];
                    q.add(val);
                }
            }
        }
        return dis;
    }
    public static void main(String[] args) {
        int arr[][]={{1, 2}, {2, 3}, {1, 3}, {2, 4}};
        int n=4;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
           adj.get(arr[i][0]-1).add(arr[i][1]-1);
           adj.get(arr[i][1]-1).add(arr[i][0]-1);
        }
        int disFromZero[]=shortestpath(adj, n, 0);
        int disFromLast[]=shortestpath(adj, n, n-1);
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(disFromLast[i]==Integer.MAX_VALUE||disFromZero[i]==Integer.MAX_VALUE)
            ans[i]=-1;
            else ans[i]=disFromLast[i]+disFromZero[i];
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
