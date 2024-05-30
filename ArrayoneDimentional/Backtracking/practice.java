import java.util.*;
public class practice {
    public static void reverse(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp;
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
         int arr[]={1,5,2,3,7,3,8};
         reverse(arr);
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
    }
}
