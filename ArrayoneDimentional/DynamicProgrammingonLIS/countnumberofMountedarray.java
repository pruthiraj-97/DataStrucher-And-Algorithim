import java.util.*;
public class countnumberofMountedarray {
    public static int count(int arr[]){
        int dp1[]=new int[arr.length];
        int dp2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dp1[i]=1;
            dp2[i]=1;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                dp1[i]=1+dp1[i-1];
            }
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                dp2[i]=1+dp2[i+1];
            }
        }
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(dp1[i]==1||dp2[i]==1) continue;
            int m=dp1[i]-2;
            int n=dp2[i]-2;
            count+=(m+1)*(n+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={2,2,2};
        System.out.println(count(arr));
    }
}
