import java.util.*;
public class beforePermutation {
    public static void reverse(int arr[],int x,int y){
        while(x<=y){
            int temp;
            temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;
        }
    }
    public static void helper(int arr[]){
        int idx=-1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]<arr[i-1]){
                idx=i-1;
                break;
            }
        }
        if(idx==-1){
            reverse(arr, 0, arr.length-1);
            return ;
        }
        int i=arr.length-1;
        while(i>=0&&arr[i]>arr[idx]) i--;
          int temp;
          temp=arr[idx];
          arr[idx]=arr[i];
          arr[i]=temp;
          reverse(arr, idx+1, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,0,0,1,4,5};
        helper(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
