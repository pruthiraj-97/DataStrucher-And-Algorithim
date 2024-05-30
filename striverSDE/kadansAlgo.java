import java.util.*;
public class kadansAlgo {
    public static int maxSum(int arr[]){
        int max=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum<0){
                max=Math.max(max,currsum);
                currsum=0;
            }else{
                max=Math.max(max,currsum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(arr));
    }
}
