import java.util.*;
public class KadansAlgoToprintsubarray {
    public static int maxSum(int arr[]){
    int j=0,i=0,maxi=0,maxj=0;
    int curr=0;
    int max=Integer.MIN_VALUE;
    for(i=0;i<arr.length;i++){
        curr+=arr[i];
        if(curr<0){
            if(curr>max){
                max=curr;
                maxi=i;
                maxj=j;
            }
            j=i+1;
            curr=0;
        }else if(curr>max){
                max=curr;
                maxi=i;
                maxj=j;
            }
        }
        
     List<Integer> ans=new ArrayList<>();
     for(i=maxj;i<=maxi;i++){
        ans.add(arr[i]);
     }
      
     System.out.println(ans);
     return max;
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-1,-3,-9,-2,-1};
        System.out.println(maxSum(arr));
    }
}
