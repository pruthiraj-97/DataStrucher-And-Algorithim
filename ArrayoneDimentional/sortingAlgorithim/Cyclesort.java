import java.util.*;
public class Cyclesort {
    public static void sort(int arr[]){
       int i=0;
       while(i<arr.length){
        if(arr[i]==i+1) i++;
        else{
            int idx=arr[i]-1;
            int temp;
            temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
       }
    }
    public static void main(String[] args) {
        int arr[]={5,1,2,6,4,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
