import java.util.*;
public class Ansysternode {
     public static void bfs(List<List<Integer>> ans,int node,List<List<Integer>> adj){
        Queue<Integer> q=new ArrayDeque<>();
        Set<Integer> st=new HashSet<>();
        q.add(node);
        st.add(node);
        while(q.size()>0){
            int temp=q.poll();
            if(temp!=node){
                ans.get(temp).add(node);
            }
            for(int val:adj.get(temp)){
                if(!st.contains(val)){
                q.add(val);
                st.add(val);
                }
            }
        }
     }
    public static Stack<Integer> topo(List<List<Integer>> adj){
        int v=adj.size();
        int ans[]=new int[v];
        int indegree[]=new int[v];
        for(int i=0;i<adj.size();i++){
            for(int val:adj.get(i)){
                indegree[val]++;
            }
        }
        Stack<Integer> st=new Stack();
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int x=0;
        while(q.size()>0){
            int node=q.poll();
            st.add(node);
            for(int val:adj.get(node)){
                indegree[val]--;
                if(indegree[val]==0){
                    q.add(val);
                }
            }
        }
        return st;
    }
    public static void main(String[] args) {
       int arr[][]={{0,3},{0,4},{1,3},{2,4},{2,7},{3,5},{3,6},{3,7},{4,6}};
       int n=8;
       List<List<Integer>> adj=new ArrayList<>();
       for(int i=0;i<n;i++){
          adj.add(new ArrayList<>());
       }
       for(int i=0;i<arr.length;i++){
        adj.get(arr[i][0]).add(arr[i][1]);
       }
       Stack<Integer> st=topo(adj);
       System.out.println(st);
       List<List<Integer>> ans=new ArrayList<>();
       for(int i=0;i<n;i++){
        ans.add(new ArrayList<>());
       }
       
    //    while(st.size()>0){
    //      bfs(ans,st.pop(),adj);
    //    }
    for(int i=0;i<n;i++){
        bfs(ans,i,adj);
    }
       for(int i=0;i<adj.size();i++){
        Collections.sort(ans.get(i));
       }
       System.out.println(ans);
    } 
}
