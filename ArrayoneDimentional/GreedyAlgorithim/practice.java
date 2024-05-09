import java.util.*;
public class practice {
    public static int f(int arr[],int k){
        Arrays.sort(arr);
        int count=0;
        int totalSum=0;
        int n=arr.length-1;
        while(k>0){
         if(arr[n]-count>0){
          totalSum+=arr[n]-count;
          count++;
          k--;
          n--;
         }else{
            break;
         }
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1};
        System.out.println(f(arr,2));;
    }
}
