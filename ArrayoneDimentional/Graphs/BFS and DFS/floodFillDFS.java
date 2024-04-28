import java.util.*;
public class floodFillDFS {
    public static void f(int arr[][],int color,int r,int c,boolean visit[][],int val){
        arr[r][c]=color;
        visit[r][c]=true;
        if(c-1>=0&&arr[r][c-1]==val&&visit[r][c-1]==false){
            f(arr,color,r,c-1,visit,val);
        }
        if(c+1<arr[0].length&&arr[r][c+1]==val&&visit[r][c+1]==false){
            f(arr,color,r,c+1,visit,val);
        }
        if(r-1>=0&&arr[r-1][c]==val&&visit[r-1][c]==false){
            f(arr,color,r-1,c,visit,val);
        }
        if(r+1<arr.length&&arr[r+1][c]==val&&visit[r+1][c]==false){
            f(arr,color,r+1,c,visit,val);
        }
    }
    public static void main(String[] args) {
        int arr[][]={{0,0,0},{0,0,0}};
        boolean visit[][]=new boolean[arr.length][arr[0].length];
        f(arr, 0,0,0, visit,arr[0][0]);


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
