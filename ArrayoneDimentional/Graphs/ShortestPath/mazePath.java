import java.util.*;
class pair{
    int r;
    int c;
    int dis;
    pair(int r,int c,int dis){
        this.r=r;
        this.c=c;
        this.dis=dis;
    }
}
public class mazePath {
    public static int f(int arr[][],int dis[][]){
        Queue<pair> q=new ArrayDeque<>();
        q.add(new pair(0,0,0));
        dis[0][0]=0;
        int n=arr.length;
        int m=arr[0].length;
        while(q.size()>0){
            pair p=q.poll();
            int r=p.r;
            int c=p.c;
            int di=p.dis;
            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    int ro=r+i;
                    int co=c+j;
                    if(ro<n&&ro>=0&&co<m&&co>=0){
                        if(arr[ro][co]==0&&1+di<=dis[ro][co]){
                            q.add(new pair(ro,co,1+di));
                            dis[ro][co]=1+di;
                        }
                    }
                }
            }
        }

        for(int i=0;i<dis.length;i++){
            for(int j=0;j<dis[0].length;j++){
                System.out.print(dis[i][j]+" ");
            }
            System.out.println();
        }
        if(dis[n-1][n-1]==Integer.MAX_VALUE) return -1;
        else return 1+dis[n-1][n-1];
    }
    public static void main(String[] args) {
        int arr[][]= {{0,0,0},{1,1,0},{1,1,0}};
        int dis[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<dis.length;i++){
            for(int j=0;j<dis[0].length;j++){
                dis[i][j]=Integer.MAX_VALUE;
            }
        }
        System.out.println(f(arr,dis));
    }
}
