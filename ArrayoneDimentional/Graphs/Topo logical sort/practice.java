import java.util.*;
class pair{
    int r;
    int c;
    pair(int r,int c){
        this.r=r;
        this.c=c;
    }
}
public class practice {
    public static void bfs(int arr[][],int visit[][],Queue<pair> q){
        while(q.size()>0){
            pair p=q.poll();
            int r=p.r;
            int c=p.c;
          if(r+1<arr.length){
           if(visit[r+1][c]==0&&arr[r][c]<=arr[r+1][c]){
               visit[r+1][c]=1;
               q.add(new pair(r+1,c));
           }
        }
        if(c+1<arr[0].length){
            if(visit[r][c+1]==0&&arr[r][c]<=arr[r][c+1]){
                 visit[r][c+1]=1;
                q.add(new pair(r,c+1));
           }
        }
        if(r-1>=0){
             if(visit[r-1][c]==0&&arr[r][c]<=arr[r-1][c]){
                  visit[r-1][c]=1;
                q.add(new pair(r-1,c));
           }
        }
        if(c-1>=0){
            if(visit[r][c-1]==0&&arr[r][c]<=arr[r][c-1]){
                 visit[r][c-1]=1;
                  q.add(new pair(r,c-1));
               }
           }
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        int arr[][]={{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        int pac[][]=new int[arr.length][arr[0].length];
        int arl[][]=new int[arr.length][arr[0].length];
        Queue<pair> q1=new ArrayDeque<>();
        Queue<pair> q2=new ArrayDeque<>();
        int n=arr.length-1;
        int m=arr[0].length-1;
        for(int i=0;i<arr[0].length;i++){
            pac[0][i]=1;
            q1.add(new pair(0,i));
        }
        for(int i=0;i<arr.length;i++){
            pac[i][0]=1;
            q1.add(new pair(i,0));
        }
        for(int i=0;i<arr[0].length;i++){
            arl[n][i]=1;
            q2.add(new pair(n,i));
        }
        for(int i=0;i<arr.length;i++){
            arl[i][m]=1;
            q2.add(new pair(i,m));
        }
        bfs(arr,pac,q1);
        bfs(arr,arl,q2);
        for(int i=0;i<pac.length;i++){
            for(int j=0;j<pac[0].length;j++){
                if(pac[i][j]==1&&arl[i][j]==1){
                    List<Integer> ls=new ArrayList<>();
                    ls.add(i);
                    ls.add(j);
                    ans.add(ls);
                }
            }
        }
       System.out.println(ans);
    }
}
