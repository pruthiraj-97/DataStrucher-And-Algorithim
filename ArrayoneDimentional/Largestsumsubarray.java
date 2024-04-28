import java.util.*;
public class Largestsumsubarray {
    public static int maxSumSubarray(int arr[]){
        int currsum=0;
        int max=currsum;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum<=0){
                currsum=0;
                max=Math.max(max,currsum);
            }else{
                max=Math.max(max,currsum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,3,-1,4,-3};
        System.out.println(maxSumSubarray(arr));
        
    }
    
}
