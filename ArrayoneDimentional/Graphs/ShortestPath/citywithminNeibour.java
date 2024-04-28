import java.util.*;

import javax.print.attribute.HashAttributeSet;
public class citywithminNeibour {
    public static void main(String[] args) {
        int n = 5;
        int arr[][]={{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}};
        int adj[][]=new int[n][n]; // distance
        int maxDis = 2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    adj[i][j]=(int)(1e9);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            int s=arr[i][0];
            int e=arr[i][1];
            int dis=arr[i][2];
            if(dis<=maxDis){
            adj[s][e]=dis;
            adj[e][s]=dis;
            }
        }
        List<Set<Integer>> visit=new ArrayList<>();
        for(int i=0;i<n;i++){
           visit.add(new HashSet<>());
        }
        for(int k=0;k<adj.length;k++){
            for(int i=0;i<adj.length;i++){
                for(int j=0;j<adj.length;j++){
                    if(adj[i][k]+adj[k][j]<=maxDis){
                        adj[i][j]=Math.min(adj[i][j],adj[i][k]+adj[k][j]);
                    }
                }
            }
        }
        for(int i=0;i<adj.length;i++){
            for(int j=0;j<adj[0].length;j++){
                if(adj[i][j]==(int)(1e9)||i==j) adj[i][j]=-1;
            }
            System.out.println();
        }
        int count=Integer.MAX_VALUE;
        int idx=0;
        for(int i=0;i<adj.length;i++){
            int c=0;
            for(int j=0;j<adj[0].length;j++){
                System.out.print(adj[i][j]+" ");
                if(adj[i][j]!=-1) c++;
            }
            if(count>c){
                count=c;
                idx=i;
            }else if(c==count){
                idx=Math.max(idx,i);
            }
            System.out.println();
        }
        System.out.println(idx);
   }
}
