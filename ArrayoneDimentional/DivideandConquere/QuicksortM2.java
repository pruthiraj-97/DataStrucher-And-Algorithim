import java.util.*;
public class QuicksortM2 {
    public static int partition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l;
        for(int j=l+1;j<=h;j++){
             if(arr[j]>=pivot){
                i=i+1;
                int temp;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
             }
        }
        int temp;
        temp=arr[l];
        arr[l]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void sort(int arr[],int l,int h){
        if(l<h){
        int pi=partition(arr,l,h);
        sort(arr,l,pi-1);
        sort(arr,pi+1,h);
    }
    }
    public static void main(String[] args) {
        int arr[]={4,7,1,9,6,3};
        sort(arr,0,5);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
