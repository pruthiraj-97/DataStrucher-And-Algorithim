import java.util.*;
public class pritntpathsfromGraph {
    public static void dfs(int visit[],List<List<Integer>> adj,int node,int des,List<Integer> arr){
        visit[node]=1;
        arr.add(node);
        if(node==des){
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
            arr.remove(arr.size()-1);
            visit[node]=0;
            return ;
        }
        for(int val:adj.get(node)){
            if(visit[val]==0){
                dfs(visit, adj,val, des, arr);
                if(arr.size()>0){
                    arr.remove(arr.size()-1);
                }
                visit[val]=0;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{0,3},{1,2},{0,1},{0,2}};
        int n=4;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            int r=arr[i][0];
            int c=arr[i][1];
            adj.get(r).add(c);
            adj.get(c).add(r);
        }
        int visit[]=new int[n];
        dfs(visit,adj,2,3,new ArrayList<>());
    }
}
