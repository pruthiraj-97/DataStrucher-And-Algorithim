import java.util.*;
public class Buy_sell_stock1 {
    public static int max_price(int arr[]){
        int min=Integer.MAX_VALUE;
        int minArray[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            minArray[i]=min;
        }
        int max=-1;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]-minArray[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(max_price(arr));
    }
}
