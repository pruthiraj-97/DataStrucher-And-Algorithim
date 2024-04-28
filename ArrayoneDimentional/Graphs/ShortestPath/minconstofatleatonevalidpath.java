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
public class minconstofatleatonevalidpath {
    public static int f(int arr[][]){
        int dis[][]=new int[arr.length][arr[0].length];
        PriorityQueue<pair> pq=new PriorityQueue<>((x,y) -> x.dis - y.dis);
        for(int i=0;i<dis.length;i++){
            for(int j=0;j<dis[0].length;j++){
                dis[i][j]=Integer.MAX_VALUE;
            }
        }
        pq.add(new pair(0,0,0));
        dis[0][0]=0;
        while(pq.size()>0){
            pair p=pq.poll();
            int r=p.r;
            int c=p.c;
            int co=p.dis;
            if(r+1<arr.length){
                int cost=(arr[r][c]==3)?0:1;
                cost+=co;
                if(dis[r+1][c]>cost){
                    dis[r+1][c]=cost;
                    pq.add(new pair(r+1,c,cost));
                }
            }
            if(c+1<arr[0].length){
                int cost=(arr[r][c]==1)?0:1;
                cost+=co;
                if(dis[r][c+1]>cost){
                    dis[r][c+1]=cost;
                    pq.add(new pair(r,c+1,cost));
                }
            }
            if(c-1>=0){
                int cost=(arr[r][c]==2)?0:1;
                cost+=co;
                if(dis[r][c-1]>cost){
                    dis[r][c-1]=cost;
                    pq.add(new pair(r,c-1,cost));
                }
            }
            if(r-1>=0){
                int cost=(arr[r][c]==4)?0:1;
                cost+=co;
                if(dis[r-1][c]>cost){
                    dis[r-1][c]=cost;
                    pq.add(new pair(r-1,c,cost));
                }
            }
        }
        return dis[arr.length-1][arr[0].length-1];
    }
    public static void main(String[] args) {
        int arr[][]={{1,1,1,1},{2,2,2,2},{1,1,1,1},{2,2,2,2}};
        System.out.println(f(arr));
    }
}
