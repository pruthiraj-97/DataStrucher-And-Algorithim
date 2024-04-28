import java.util.*;
class pair{
    int row;
    int col;
    int dis;
    pair(int row,int col,int dis){
        this.row=row;
        this.col=col;
        this.dis=dis;
    }
}
public class Matrixof0and1 {
    public static void f(int arr[][]){
        int ans[][]=new int[arr.length][arr[0].length];
        boolean visit[][]=new boolean[arr.length][arr[0].length];
        Queue<pair> q=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    visit[i][j]=true;
                    q.add(new pair(i,j,0));
                }
            }
        }
        while (q.size()>0) {
            pair p=q.poll();
            int r=p.row;
            int c=p.col;
            int dis=p.dis;
            ans[r][c]=dis;
            if(c-1>=0&&visit[r][c-1]==false){
                visit[r][c-1]=true;
                q.add(new pair(r, c-1, dis+1));
            }
             if(c+1<arr[0].length&&visit[r][c+1]==false){
                visit[r][c+1]=true;
                q.add(new pair(r, c+1, dis+1));
            }
            if(r-1>=0&&visit[r-1][c]==false){
                visit[r-1][c]= true;
                q.add(new pair(r-1,c,dis+1));
            }
            if(r+1<arr.length&&visit[r+1][c]==false){
                visit[r+1][c]= true;
                q.add(new pair(r+1,c,dis+1));
            }
        } 
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
       


    }
    public static void main(String[] args) {
        int arr[][]={{0,0,0},{0,1,0},{0,0,0}};
        f(arr);
    }
}
