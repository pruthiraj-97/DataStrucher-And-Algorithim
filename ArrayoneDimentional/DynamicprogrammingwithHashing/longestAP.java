import java.util.*;
public class longestAP {
    public static int findLongest(int arr[]){
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int diff=arr[j]-arr[i];
                int curr=arr[i];
                int count=2;
                int k=i-1;
                while(k>=0){
                    if(curr-arr[k]==diff){
                        count++;
                        curr=arr[k];
                    }
                    k--;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={20,1,15,3,10,5,8};
        System.out.println(findLongest(arr));
    }
}
