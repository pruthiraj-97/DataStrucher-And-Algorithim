import java.util.*;
class pair{
    int row;
    int col;
    int t;
    pair(int row,int col,int t){
        this.row=row;
        this.col=col;
        this.t=t;
    }
}
public class RottenOrange {
    public static int findMinTime(int arr[][]){
    //    sc n*m  tc n*m


       Queue<pair> q=new ArrayDeque<>();
       int visit[][]=new int[arr.length][arr[0].length];
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==2){
                q.add(new pair(i,j,0));
                visit[i][j]=2;
            }
        }
       }
        int n=arr.length;
       int m=arr[0].length;
       int max=0;
       while(q.size()>0){
       pair p=q.poll();
       int t=p.t;
       max=Math.max(max,t);
       int r=p.row;
       int c=p.col;
       if(c-1>=0&&arr[r][c-1]==1&&visit[r][c-1]!=2){
        q.add(new pair(r,c-1,t+1));
        visit[r][c-1]=2;
       }
       if(c+1<m&&arr[r][c+1]==1&&visit[r][c+1]!=2){
        q.add(new pair(r,c+1,t+1));
        visit[r][c+1]=2;
       }
       if(r-1>=0&&arr[r-1][c]==1&&visit[r-1][c]!=2){
        q.add(new pair(r-1,c,t+1));
        visit[r-1][c]=2;
       }
       if(r+1<n&&arr[r+1][c]==1&&visit[r+1][c]!=2){
        q.add(new pair(r+1,c-1,t+1));
        visit[r+1][c]=2;
       }
       }

       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==1&&visit[i][j]!=2) return -1;
           System.out.print(visit[i][j]+" ");
        }
        System.out.println();
       }

       return max;
    }
    public static void main(String[] args) {
        int arr[][]={{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(findMinTime(arr));
    }
}
