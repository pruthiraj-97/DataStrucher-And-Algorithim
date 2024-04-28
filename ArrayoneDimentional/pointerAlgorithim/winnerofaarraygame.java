import java.util.*;
public class winnerofaarraygame {
    public static int f(int arr[],int x){
        Map<Integer,Integer> mp=new HashMap<>();
        int i=0;
        int j=1;
        int k=arr.length-1;
        int winn=0;
        int max=arr[0];
        for(int z=0;z<arr.length;z++){
            max=Math.max(max,arr[z]);
        }
        while(i<arr.length){
            if(arr[i]==max) return max;
            if(arr[i]>arr[j]){
                k=j;
                j=j+1;
                winn++;
            }else{
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                k=j;
                j=j+1;
                winn=1;
            }
            if(winn==x||arr[i]==max) return arr[i];
        }
        return-1;
    }
    public static void main(String[] args) {
        int arr[]={3,2,1};
        System.out.println(f(arr,10));
    }
}
