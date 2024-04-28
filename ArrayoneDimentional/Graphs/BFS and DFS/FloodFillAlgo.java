import java.util.*;
class pair{
    int row;
    int col;
    pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
public class FloodFillAlgo {
    public static void floodFill(int arr[][],int newColor,int sr,int sc){
        int val=arr[sr][sc];
         boolean visit[][]=new boolean[arr.length][arr[0].length];
        Queue<pair> q=new ArrayDeque<>();
        q.add(new pair(sr,sc));
        arr[sr][sc]=newColor;
        int n=arr.length;
        int m=arr[0].length;
        visit[sr][sc]=true;
        while(q.size()>0){
            pair p=q.poll();
            int r=p.row;
            int c=p.col;
            if(c-1>=0&&arr[r][c-1]==val&&visit[r][c-1]==false){
                arr[r][c-1]=newColor;
                visit[r][c-1]=true;
                q.add(new pair(r,c-1));
            }
            if(c+1<m&&arr[r][c+1]==val&&visit[r][c+1]==false){
                arr[r][c+1]=newColor;
                 visit[r][c+1]=true;
                q.add(new pair(r,c+1));
            }
            if(r-1>=0&&arr[r-1][c]==val&&visit[r-1][c]==false){
                arr[r-1][c]=newColor;
                 visit[r-1][c]=true;
                q.add(new pair(r-1,c));
            }
            if(r+1<n&&arr[r+1][c]==val&&visit[r+1][c]==false){
                arr[r+1][c]=newColor;
                 visit[r+1][c]=true;
                q.add(new pair(r+1,c));
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,1,0},{1,0,1}};
        floodFill(arr, 2,1,1);
    }
}
