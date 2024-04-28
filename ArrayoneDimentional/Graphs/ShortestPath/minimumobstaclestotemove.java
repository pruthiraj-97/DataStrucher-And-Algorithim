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
        return this.dis-p.dis;    // min heap
    }
}
public class minimumobstaclestotemove {
    public static void main(String[] args) {
        int arr[][]={{0,1,0,0,0},{0,1,0,1,0},{0,0,0,1,0}};
        int obst[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                obst[i][j]=Integer.MAX_VALUE;
            }
        }
        PriorityQueue<pair> pq=new PriorityQueue<>();
        int os=arr[0][0];
        obst[0][0]=os;
        pq.add(new pair(0,0,os));
        while(pq.size()>0){
            pair p=pq.poll();
            int r=p.r;
            int c=p.c;
            int dis=p.dis;
            if(r+1<arr.length){
                int v=(arr[r+1][c]==1)?1:0;
                int val=dis+v;
                if(val<obst[r+1][c]){
                    obst[r+1][c]=val;
                 pq.add(new pair(r+1, c,val));
                }
            }
            if(c+1<arr[0].length){
                int v=(arr[r][c+1]==1)?1:0;
                int val=dis+v;
                if(val<obst[r][c+1]){
                    obst[r][c+1]=val;
                 pq.add(new pair(r, c+1,val));
                }
            }
            if(r-1>=0){
                int v=(arr[r-1][c]==1)?1:0;
                int val=dis+v;
                if(val<obst[r-1][c]){
                    obst[r-1][c]=val;
                 pq.add(new pair(r-1, c,val));
                }
            }
            if(c-1>=0){
                int v=(arr[r][c-1]==1)?1:0;
                int val=dis+v;
                if(val<obst[r][c-1]){
                    obst[r][c-1]=val;
                 pq.add(new pair(r, c-1,val));
                }
            }
        }
        int ans=obst[arr.length-1][arr[0].length-1];
        System.out.println(ans);
    }
}
