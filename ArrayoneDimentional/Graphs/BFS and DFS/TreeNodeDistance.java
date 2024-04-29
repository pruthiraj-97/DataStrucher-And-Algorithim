import java.util.*;
public class TreeNodeDistance {
    public static List<List<Integer>> createList(int arr[][],int n){
       List<List<Integer>> adj=new ArrayList<>();
       for(int i=0;i<n;i++){
         adj.add(new ArrayList<>());
       }
       for(int i=0;i<arr.length;i++){
          adj.get(arr[i][0]).add(arr[i][1]);
          adj.get(arr[i][1]).add(arr[i][0]);
       }
       return adj;
    }
    public static int findNodeDistance(List<List<Integer>> adj,int n){
        Queue<Integer> q=new ArrayDeque<>();
        q.add(n);
        int x=0;
        int sum=0;
        Set<Integer> st=new HashSet<>();
        q.add(n);
        while (q.size()>0) {
            int s=q.size();
            while(s>0){
                sum+=x;
                int temp=q.poll();
                st.add(temp);
                for(int num:adj.get(temp)){
                    if(!st.contains(num)){
                        st.add(num);
                        q.add(num);
                    }
                }
                s--;
            }
           x++;
        }
       return sum;
    } 
    public static void main(String[] args) {
        int arr[][]={{0,1},{0,2},{2,3},{2,4},{2,5}};
        List<List<Integer>> adj=createList(arr, 6);
        System.out.println(adj);
        int ans[]=new int[6];
        for(int i=0;i<6;i++){
            ans[i]=findNodeDistance(adj,i);
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
