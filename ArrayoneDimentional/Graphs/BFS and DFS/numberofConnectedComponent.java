import java.util.*;
public class numberofConnectedComponent {
    public static void dfs(int arr[][],int r,int c,int visit[][]){
        visit[r][c]=1;
        if(r-1>=0&&arr[r-1][c]==1&&visit[r-1][c]==0){
            dfs(arr,r-1,c,visit);
        }
        if(r+1<arr.length&&arr[r+1][c]==1&&visit[r+1][c]==0){
            dfs(arr,r+1,c,visit);
        }
        if(c-1>=0&&arr[r][c-1]==1&&visit[r][c-1]==0){
            dfs(arr,r,c-1,visit);
        }
         if(c+1<arr[0].length&&arr[r][c+1]==1&&visit[r][c+1]==0){
            dfs(arr,r,c+1,visit);
        }
        if(r-1>=0&&c-1>=0&&arr[r-1][c-1]==1&&visit[r-1][c-1]==0){
            dfs(arr, r-1, c-1, visit);
        }
        if(r-1>=0&&c+1<arr[0].length&&arr[r-1][c+1]==1&&visit[r-1][c+1]==0){
            dfs(arr, r-1, c+1, visit);
        }
        if(r+1<arr.length&&c+1<arr[0].length&&arr[r+1][c+1]==1&&visit[r+1][c+1]==0){
            dfs(arr, r+1, c+1, visit);
        }
        if(r+1<arr.length&&c-1>=0&&arr[r+1][c-1]==1&&visit[r][c-1]==0){
            dfs(arr, r+1, c-1, visit);
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1, 1, 1},{0, 1, 0},{1, 0, 1}};
        int visit[][]=new int[arr.length][arr[0].length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1&&visit[i][j]==0){
                    count++;
                    dfs(arr,i,j,visit);
                }
            }
        }
        System.out.println(count);
    }
}
