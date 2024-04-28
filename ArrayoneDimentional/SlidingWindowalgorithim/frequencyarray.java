import java.util.*;
public class frequencyarray {
    public static boolean cheak(int arr[],int k,int mid){
        int sum=0;
        for(int i=0;i<mid;i++){
            sum=sum+arr[i];
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i-j==k){
                sum=sum-arr[j];
                sum=sum+arr[i-1];
                j++;
            }
            if(i-j==mid-1){
                if(sum+k>=arr[i]*(i-j)){
               // if(mid==2){
               // System.out.println(k);
               // System.out.println(sum+k);
                return true;
               // }
                }
            }
        }
        return false;
        

 }
    public static void main(String[] args) {
        int arr[]={1,4,8,13};
        int k=5;
        int prefix[]=new int[arr.length];
        // sort array
        Arrays.sort(arr);
        //int i=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            prefix[i]=sum;
         }
         int x=1;
         int y=arr.length;
         int ans=-1;
         while(x<=y){
             int mid=(x+y)/2;
             if(cheak(arr,k,mid)){
                 ans=mid;
                 x=mid+1;
             }else{
                 y=mid-1;
             }
         }
         System.out.println(ans);
    }
}
