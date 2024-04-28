import java.util.*;
public class Ternarysearch {
    public static int f(int arr[],int t){
        int x=0;
        int y=arr.length-1;
        while(x<=y){
            int mid1=x+(y-x)/3;
            int mid2=y-(y-x)/3;
            if(arr[mid1]==t) return mid1;
            if(arr[mid2]==t) return mid2;
            if(t<arr[mid1]) y=mid1-1;
            else if(t>arr[mid2]) x=mid2+1;
            else{
                x=mid1+1;
                y=mid2-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,8};
        System.out.println(f(arr,6));
    }
}
