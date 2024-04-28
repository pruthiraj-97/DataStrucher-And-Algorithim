import java.util.*;
public class counttotalnumberofinversion {
    public static int partition(int arr[],int l,int mid,int h){
        int swap=0;
        int left[]=Arrays.copyOfRange(arr, l, mid+1);
        int right[]=Arrays.copyOfRange(arr, mid+1, h+1);
        for(int i=0;i<left.length;i++){
            left[i]=arr[i+l];
        }
        for(int i=0;i<right.length;i++){
            right[i]=arr[mid+1+i];
        } 
        int i=0;
        int j=0;
        int k=l;
        while(i<left.length&&j<right.length){
            if(arr[i]<=arr[j]){
                arr[k++]=arr[i++];
            }else{
                arr[k++]=right[j++];
                swap+=(mid+l)-(l+i);
            }
        }
       return swap;

    }
    public static int inversion(int arr[],int l,int h){
        int count =0;
        if(l<h){
          int mid=(l+h)/2;
          count+= inversion(arr,l,mid);
          count+=inversion(arr,mid+1,h);
          count+=partition(arr,l,mid,h);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,6,3,5};
        System.out.println(inversion(arr,0,5));
    }
    
}
