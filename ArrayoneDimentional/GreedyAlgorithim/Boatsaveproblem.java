import java.util.*;
public class Boatsaveproblem {
    public static int minimum(int arr[],int limit){
       int count=0;
        // for(int i=1;i<arr.length;i++){
        //     int j=i;
        //     while(j>0&&arr[j]<arr[j-1]){
        //         int temp;
        //         temp=arr[j];
        //         arr[j]=arr[j-1];
        //         arr[j-1]=temp;
        //         j--;
        //     }
        // }
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<=j){
           int max=0;
           max=arr[i]+arr[j];
           if(max<=limit){
            count++;
              i++;
              j--;
           }else if(limit>=max-arr[i]){
            max=max-arr[i];
            count++;
            j--;
           }else if(limit>=max-arr[j]){
             max=max-arr[j];
             count++;
                i++;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2};
        System.out.println(minimum(arr,3));
        
    }
    
}
