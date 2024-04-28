import java.util.*;
public class fibonaciM1 {
   public static void heap(int arr[],int i){
         int largest=i;
         int left=2*i+1;
         int right=2*i+2;
         if(left<arr.length&&arr[left]>arr[largest]){
            largest=left;
         }
         if(right<arr.length&&arr[right]>arr[largest]){
            largest=right;
         }
         if(largest!=i){
            int temp;
            temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            heap(arr,largest);
         }
   }
   public static void main(String[] args) {
         int arr[]={4, 10, 3, 5, 1,6};
         for(int i=arr.length/2-1;i>=0;i--){
            heap(arr,i);
         }
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
   }
}
