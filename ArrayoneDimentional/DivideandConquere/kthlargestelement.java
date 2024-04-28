import java.util.*;
class pair implements Comparable<pair>{
    public int compareTo(pair p){
       
    }
}
public class kthlargestelement {
     public static int partition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l;
        for(int j=i+1;j<=h;j++){
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
     public static int quick(int arr[],int l,int h,int k){
       int pi=partition(arr,l,h);
       if(pi==k-1){
        return arr[pi];
       }else if(pi<k-1){
        return quick(arr,pi+1,h,k);
       }else{
        return quick(arr,l,pi-1,k);
       }
      
     }
    public static void main(String[] args) {
         int arr[]={4,1,2,6,3,5};
       System.out.println(quick(arr,0,5,4));
       System.out.println(31415%13);
       System.out.println("123".compareTo("345")>0);
    }
    
}
