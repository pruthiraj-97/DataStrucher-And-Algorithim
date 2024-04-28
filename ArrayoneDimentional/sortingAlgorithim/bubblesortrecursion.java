import java.util.*;
public class bubblesortrecursion {
    public static void bubble(int arr[],int i,int j){
        if(i==arr.length||j==0){
            return ;
        }
        if(arr[j]<arr[j-1]){
            int temp;
            temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
            bubble(arr,i,j);
        }
        i=i+1;
        j=i;
        bubble(arr,i,j);
    }
    public static void main(String[] args) {
        int arr[]={4 ,1, 3, 9, 7};
        bubble(arr,1,1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
