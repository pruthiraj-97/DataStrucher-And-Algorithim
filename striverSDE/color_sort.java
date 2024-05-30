import java.util.*;
public class color_sort {
    public static void swap(int arr[],int i,int j){
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
    }
    public static void color_sort(int arr[]){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<high){
            if(arr[mid]==1) mid++;
            else if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }else{
              swap(arr, mid, high);
              high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        color_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
