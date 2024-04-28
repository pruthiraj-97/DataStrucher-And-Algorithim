import java.util.*;
public class maximumcircularsum {
    public static void main(String[] args) {
        int arr[]={-3,-2,-3};
        int prefix[]=new int[arr.length];
        int maxfre[]=new int[arr.length];
        int max=Integer.MIN_VALUE;
        int curr=0;
        int sum=0;
        int m=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            sum+=arr[i];
            prefix[i]=sum;
            m=Math.max(m,sum);
            maxfre[i]=m;
            if(curr<0){
                max=Math.max(max,curr);
                curr=0;
            }else{
            max=Math.max(max,curr);
            }
        }
        int n=arr.length-1;
       // for(int i=0;i<arr.length;i++) System.out.print(prefix[i]+" ");
          for(int i=0;i<arr.length;i++) System.out.print(maxfre[i]+" ");
          System.out.println();
          for(int i=1;i<arr.length;i++){
            int s=prefix[n]-prefix[i-1];
            s+=maxfre[i-1];
            System.out.println(s);
            max=Math.max(max,s);
          }
       System.out.println(max);
       
    }
}
