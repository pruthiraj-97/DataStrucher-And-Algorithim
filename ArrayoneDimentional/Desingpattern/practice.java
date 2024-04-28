import java.util.*;
class pair implements Comparable<pair>{
    int s;
    int m;
    int sum;
    pair(int s,int m,int sum){
        this.s=s;
        this.m=m;
        this.sum=sum;
    }
    public int compareTo(pair p){
        return p.sum-this.sum;
    }
}
public class practice {
    public static int f1(int s[],int m[]){
        int val=0;
        for(int i=0;i<s.length;i++){
            if(s[i]==m[i]) val++;
        }
        return val;
    }
    public static int f(int s[][],int m[][],int i,Set<Integer> st){
         if(i==s.length) return 0;
         int max=Integer.MIN_VALUE;
         for(int j=0;j<m.length;j++){
             if(!st.contains(j)){
                 int val=f1(s[i],m[j]);
                 st.add(j);
                 int sum=val+f(s,m,i+1,st);
                 max=Math.max(max,sum);
                 st.remove(j);
             }
         }
         return max;
    }

    public static int f(int s[],int m[]){
        
    }
    
    public static void main(String[] args) {
       PriorityQueue<pair> pq=new PriorityQueue<>();
       for(int i=0;i<s.length;i++){
           for(int j=0;j<m.length;j++){
             int val=f(s[i],m[j]);
             pq.add(new pair(i,j,val));
           }
       }
       int track[]=new int[s.length];
       Arrays.fill(track,-1);
       Set<Integer> st=new HashSet<>();
       int ans=0;
       while(pq.size()>0){
         pair p=pq.poll();
         if(!st.contains(p.m)&&track[p.s]==-1){
             track[p.s]=p.m;
             ans+=p.sum;
             st.add(p.m);
         }
       }
       return ans;
    }
}
