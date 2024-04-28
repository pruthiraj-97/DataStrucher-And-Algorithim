import java.util.*;
public class practice {
    static int count=0;
    public static void f(int node,int arr[],int dis[]){
        Queue<Integer> q=new ArrayDeque<>();
        dis[node]=0;
        q.add(node);
        while(q.size()>0){
            int t=q.poll();
            int val=arr[t];
            if(val!=-1&&1+dis[t]<dis[val]){
                dis[val]=1+dis[t];
                q.add(val);
            }
        }
    }
    public static void main(String[] args) {
       int arr[]={4,4,8,-1,9,8,4,4,1,1};
       int dis1[]=new int[arr.length];
        int dis2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dis1[i]=Integer.MAX_VALUE;
            dis2[i]=Integer.MAX_VALUE;
        }
        int node1=5;
        int node2=6;
        f(node1,arr,dis1);
        f(node2,arr,dis2);
        long max=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<dis1.length;i++){
            if(dis1[i]==Integer.MAX_VALUE || dis2[i]==Integer.MAX_VALUE) continue;
            long temp=dis1[i]+dis2[i];
            if(temp<max){
                max=temp;
                idx=i;
            }
        }
        for(int i=0;i<dis1.length;i++){
            System.out.print(dis1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<dis2.length;i++){
            System.out.print(dis2[i]+" ");
        }
    }
}
