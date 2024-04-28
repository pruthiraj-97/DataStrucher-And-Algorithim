import java.util.*;
public class Beautifultower2 {
    public static void mounted(int arr[]){
        Stack<Integer> st=new Stack<>();
        int prev[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(st.size()>0&&arr[st.peek()]>arr[i]) st.pop();
            if(st.size()==0) prev[i]=-1;
            else prev[i]=st.peek();
            st.push(i);
        }

        st.clear();
        int next[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
              while(st.size()>0&&arr[st.peek()]>arr[i]) st.pop();
              if(st.size()==0) next[i]=arr.length;
              else next[i]=st.peek();
              st.push(i);
        }
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        int sufix[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
                int sum=arr[i]*(i-prev[i]);
                if(prev[i]!=-1) sum+=prefix[prev[i]];
                prefix[i]=sum;
        }
        for(int i=arr.length-1;i>=0;i--){
            int sum=arr[i]*(next[i]-i);
            if(next[i]!=arr.length) sum+=sufix[next[i]];
            sufix[i]=sum;
        }

        for(int i=0;i<arr.length;i++){
             int curr=0;
             if(prev[i]!=-1) curr+=prefix[prev[i]];
             curr+=arr[i]*(i-prev[i]);
             if(next[i]!=arr.length) curr+=sufix[next[i]];
             curr+=arr[i]*(next[i]-i);
             max=Math.max(max,curr-arr[i]);
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        int arr[]={5,3,4,1,1};
        mounted(arr);
    }
}
