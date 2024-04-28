import java.util.*;
public class peakvalueinboundedindex {
    public static int helper(int pick,int sum,int n){
        int sum1=sum;
       int idx=pick;
       int total=0;
       while(sum1>0&&idx>=0){
          total+=sum1;
          sum1--;
          idx--;
       }
       pick++;
       sum--;
       while(pick<n&&sum>0){
           total+=sum;
           sum--;
           pick++;
       }
       if(idx>=0) total+=sum1*(idx+1);
       if((n-pick)>0) total+=sum*(n-pick);
       System.out.println(total);
       return total;
    }
    public static void main(String[] args) {
        int maxSum=4;
        int n=4;
        int index=0;
        int x=1;
        int y=maxSum;
        int ans=-1;
        while(x<=y){
            int mid=(x+y)/2;
            int sum=helper(index,mid,n);
            if(sum<=maxSum){
                ans=mid;
                System.out.println(sum);
                x=mid+1;
            }else{
                y=mid-1;
            }
        }
        System.out.println(ans);
    }
}
