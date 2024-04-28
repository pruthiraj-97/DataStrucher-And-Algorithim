import java.util.*;
public class roundtrip {
    static int max=0;
    public static void dfs(List<List<Integer>> adj,int node,int prev,List<Integer> arr,int visit[]){
        for(int val:adj.get(node)){
            if(visit[val]==0){
                visit[val]=1;
                arr.add(val);
                dfs(adj,val,node,arr,visit);
                visit[val]=0;
                arr.remove(arr.size()-1);
            }
            else if(visit[val]==1&&prev!=val){
                for(int i=0;i<arr.size();i++){
                    System.out.print(arr.get(i)+" ");
                }
                System.out.println(val);
                System.out.println();
                
                max=Math.max(max,arr.size()+1);
                // return ;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,3},{5 ,3},{1 ,5},{2, 4},{4 ,5},{1,2}};
        int n=6;
        max=0;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            int r=arr[i][0];
            int c=arr[i][1];
            adj.get(r).add(c);
            adj.get(c).add(r);
        }
        int visit[]=new int[n];
        visit[1]=1;
        List<Integer> ar=new ArrayList<>();
        ar.add(1);
        dfs(adj,1,-1,ar,visit);
        System.out.println(max);
    }
}
