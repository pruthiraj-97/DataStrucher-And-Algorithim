import java.util.*;
class pair{
    int r;
    int c;
    pair(int r,int c){
        this.r=r;
        this.c=c;
    }
}
public class mazepath2 {
    public static int f(int arr[][],int s[],int e[]){
        int visit[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<visit.length;i++){
            for(int j=0;j<visit[0].length;j++){
                visit[i][j]=Integer.MAX_VALUE;
            }
        }
        Queue<pair> q=new ArrayDeque<>();
        q.add(new pair(s[0],s[1]));
        visit[s[0]][s[1]]=0;
        while(q.size()>0){
            pair p=q.poll();
            int r=p.r;
            int c=p.c;
            if(r-1>=0&&arr[r-1][c]==0&&visit[r-1][c]>1+visit[r][c]){
                visit[r-1][c]=1+visit[r][c];
                q.add(new pair(r-1, c));
            }
            if(c-1>=0&&arr[r][c-1]==0&&visit[r][c-1]>1+visit[r][c-1]){
                visit[r][c-1]=1+visit[r][c];
                q.add(new pair(r, c-1));
            }
            if(r+1<arr.length&&arr[r+1][c]==0&&visit[r+1][c]>1+visit[r][c]){
                visit[r+1][c]=1+visit[r][c];
                q.add(new pair(r+1, c));
            }
            if(c+1<arr[0].length&&arr[r][c+1]==0&&visit[r][c+1]>1+visit[r][c]){
                visit[r][c+1]=1+visit[r][c];
                q.add(new pair(r, c+1));
            }
        }

        if(visit[e[0]][e[1]]>=Integer.MAX_VALUE) return -1;
        return visit[e[0]][e[1]];
    }
    public static void main(String[] args) {
        int arr[][]= {{ 0, 0, 0 }, { 0, 1, 0 }, { 1, 0, 0} };
        int s[]={0,0};
        int e[]={2,1};
        System.out.println(f(arr,s,e));
    }
}
