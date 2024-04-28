import java.util.*;
public class quicksort {
    public static int partition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l;
        for(int j=i+1;j<=h;j++){
            if(arr[j]<=pivot){
                i=i+1;
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp;
        temp=arr[l];
        arr[l]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void quick(int arr[],int l,int h){
        if(l<h){
        int pi=partition(arr,l,h);
        quick(arr,l,pi-1);
        quick(arr,pi+1,h);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,6,3,5};
        quick(arr,0,5);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
