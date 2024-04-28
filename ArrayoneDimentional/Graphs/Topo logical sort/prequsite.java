import java.util.*;
public class prequsite {
    public static boolean dfs(List<List<Integer>> adj,int node,Set<Integer> st){
        st.add(node);
        for(int val:adj.get(node)){
            if(st.contains(val)) return false;
            return dfs(adj,val,st);
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][]={{1,0},{0,1}};
        int N=4;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            adj.get(arr[i][0]).add(arr[i][1]);
        }
        for(int i=0;i<adj.size();i++){
            Set<Integer> st=new HashSet<>();
            boolean flag=dfs(adj,i,st);
            if(flag==false){
                System.out.print("not happen");
                break;
            }
        }
    }
}
