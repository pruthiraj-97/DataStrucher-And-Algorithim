import java.util.*;
public class Quicksort {
    public static int partition(int arr[],int l,int h){
       int pivot=arr[l];
       int x=l;
       int i=l;
       for(int j=i+1;j<=h;j++){
           if(arr[j]<=pivot){
            i=i+1;
            int temp;
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
           }
       }
       int temp;
       temp=arr[x];
       arr[x]=arr[i];
       arr[i]=temp;
       return i;
    }
    public static void quicksort(int arr[],int l,int h){
        if(l>=h){
            return ;
        }
        int pi=partition(arr,l,h);
        quicksort(arr,l,pi-1);
        quicksort(arr,pi+1,h);

    }
    public static void main(String[] args) {
        int arr[]={2,4,3,7,1,5,6};
        quicksort(arr,0,6);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
