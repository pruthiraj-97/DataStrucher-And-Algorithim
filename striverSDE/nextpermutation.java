import java.util.*;
public class nextpermutation {
    public static void reverseArray(int arr[],int i,int j){
        int x=i;
        int y=j;
        while(x<y){
            int temp;
            temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;
        }
    }
    public static void nextPermutation(int arr[]){
        int idx=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverseArray(arr,0,arr.length-1);
            return;
        }
        for(int i=arr.length-1;i>=idx+1;i--){
            if(arr[i]>arr[idx]){
                int temp;
                temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                break;
            }
        }
        reverseArray(arr, idx+1, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,4,3,0,0};
        nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
