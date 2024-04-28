import java.util.*;
public class resoursealocation {
    public static int cheak(int arr[],int sum){
        int count=0;
        int total=0;
        for(int i=0;i<arr.length;i++){
            if(total+arr[i]>sum){
                total=arr[i];
                count++;
            }else{
                total+=arr[i];
            }
        }
        count++;
        return count;
    }
    public static int f(int arr[],int k){
        int min=arr[0];
        int max=0;
        for(int i=0;i<arr.length;i++){
            min=Math.max(min,arr[i]);
            max+=arr[i];
        }
        int ans=-1;
        while(min<=max){
            int mid=(min+max)/2;
           int temp=cheak(arr,mid);
           if(temp>k){
             min=mid+1;
           }else if(temp<k){
             max=mid-1;
           }else{
            ans=mid;
            max=mid-1;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,2,2,6};
        System.out.println(f(arr,3));
    }
}
