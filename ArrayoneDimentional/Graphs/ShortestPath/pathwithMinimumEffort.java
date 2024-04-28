import java.util.*;
class pair implements Comparable<pair>{
    int r;
    int c;
    int dis;
    pair(int r,int c,int dis){
        this.r=r;
        this.c=c;
        this.dis=dis;
    }
    public int compareTo(pair p){
        return this.dis-p.dis;
    }
}
public class pathwithMinimumEffort {
    public static int minEffort(int arr[][],int visit[][]){
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(0,0,0));
        visit[0][0]=0;
        int n=arr.length;
        int m=arr[0].length;
        while(pq.size()>0){
            pair p=pq.poll();
            int r=p.r;
            int c=p.c;
            int dis=p.dis;
            if(r+1<n){
                if(Math.max(dis,Math.abs(arr[r+1][c]-arr[r][c]))<visit[r+1][c]){
                    visit[r+1][c]=Math.max(dis,Math.abs(arr[r+1][c]-arr[r][c]));
                    pq.add(new pair(r+1,c,visit[r+1][c]));
                }
            }
            if(c+1<m){
                if(Math.max(dis,Math.abs(arr[r][c+1]-arr[r][c]))<visit[r][c+1]){
                    visit[r][c+1]=Math.max(dis,Math.abs(arr[r][c+1]-arr[r][c]));
                    pq.add(new pair(r,c+1,visit[r][c+1]));
                }
            }
            if(r-1>=0){
                if(Math.max(dis,Math.abs(arr[r-1][c]-arr[r][c]))<visit[r-1][c]){
                    visit[r-1][c]=Math.max(dis,Math.abs(arr[r-1][c]-arr[r][c]));
                    pq.add(new pair(r-1,c,visit[r-1][c]));
                }
            }
             if(c-1>=0){
                if(Math.max(dis,Math.abs(arr[r][c-1]-arr[r][c]))<visit[r][c-1]){
                    visit[r][c-1]=Math.max(dis,Math.abs(arr[r][c-1]-arr[r][c]));
                    pq.add(new pair(r,c-1,visit[r][c-1]));
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(visit[i][j]+" ");
            }
            System.out.println();
        }
        return visit[n-1][m-1];
    }

    public static void main(String[] args) {
int arr[][]={{1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}};
        int visit[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<visit.length;i++){
            for(int j=0;j<visit[0].length;j++){
                visit[i][j]=Integer.MAX_VALUE;
            }
        }
        System.out.println(minEffort(arr, visit));

    }
}
