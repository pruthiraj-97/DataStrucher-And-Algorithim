import java.util.*;
public class floorinansortedarray {
    public static int floor(int arr[],int k){
        int n=arr.length;
        if(k<arr[0]) return -1;
        if(k>arr[n-1]) return arr.length;
        int x=0;
        int y=n-1;
        int ans=arr.length;
        while(x<=y){
            int mid=(x+y)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                ans=mid;
                x=mid+1;
            }else{
                y=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1 ,2, 5, 7 ,12, 14};
        System.out.println(floor(arr,10));
    }
    
}
