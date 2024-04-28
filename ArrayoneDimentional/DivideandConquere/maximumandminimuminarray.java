import java.util.*;
public class maximumandminimuminarray {
    public static int maximum(int arr[],int l,int h){
        if(l==h){
            return arr[l];
        }
        int mid=(l+h)/2;
        int max1=maximum(arr,l,mid);
        int max2=maximum(arr,mid+1,h);
        return Math.max(max1,max2);
    }
    public static void main(String[] args) {
        int arr[]={4,1,7,2,4,3};
        System.out.println(maximum(arr,0,5));
    }
    
}
