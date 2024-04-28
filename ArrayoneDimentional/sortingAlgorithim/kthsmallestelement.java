import java.util.*;
public class kthsmallestelement {
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
    public static int quicksort(int arr[],int l,int h,int k){
        int pi=partition(arr,l,h);
        if(pi==k-1){
            return arr[pi];
        }
        if((k-1)<pi){
        quicksort(arr,l,pi-1,k);
        }else{
        quicksort(arr,pi+1,h,k);
        }
        return -1;
    }
    public static void main(String[] args) {
         int arr[]={2,4,3,7,1,5,6};
       System.out.println(quicksort(arr,0,6,4));
        
    }
    
}
