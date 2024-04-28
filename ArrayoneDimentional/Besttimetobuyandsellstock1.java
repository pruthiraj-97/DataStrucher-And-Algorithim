import java.util.*;
public class Besttimetobuyandsellstock1{
    public static int maxProfit(int arr[]){
         int max=0;
         int buyPrice=Integer.MAX_VALUE;
         for(int i=0;i<arr.length;i++){
            if(arr[i]<buyPrice){
                buyPrice=arr[i];
            }else{
                max=Math.max(max,arr[i]-buyPrice);
            }
         }
         return max;
    }
    public static void main(String[] args) {
        int arr[]={3,4,2,5,7};
        System.out.println(maxProfit(arr));
        
    }
    
}
