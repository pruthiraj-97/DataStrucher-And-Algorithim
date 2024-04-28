import java.util.*;
public class searchinansortedarray {
    public static int search(int arr[],int k){
        int x=0;
        int y=arr.length-1;
        while(x<=y){
            int mid=(x+y)/2;
            if(arr[mid]==k){
                return mid;
            }
             if(arr[mid]<arr[y]){
                if(k>arr[mid]&&k<arr[y]){
                    x=mid+1;
                }
            }else{
                if(k<=arr[mid]&&k>=arr[x]){
                    y=mid-1;
                }else{
                    x=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,1,2};
        System.out.println(search(arr,5));
        
    }
    
}
