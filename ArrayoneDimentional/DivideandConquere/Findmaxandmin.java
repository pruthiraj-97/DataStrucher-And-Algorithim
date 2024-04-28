import java.util.*;
public class Findmaxandmin {
    public static int f(int arr[]){
        int x=0;
        int y=arr.length-1;
        int ans=0;
        while(x<=y){
            int mid=(x+y)/2;
            if(arr[mid]==0){
                ans=mid;
                x=mid+1;
            }else{
                y=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,1,1};
        System.out.println(f(arr));
    }
}
