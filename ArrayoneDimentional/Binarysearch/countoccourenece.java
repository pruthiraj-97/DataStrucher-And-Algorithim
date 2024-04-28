import java.util.*;
public class countoccourenece {
    public static int occourence(int arr[],int t){
        // first cooourence
        int x1=-1;
        int x2=-1;
        int x=0;
        int y=arr.length-1;
        while(x<=y){
            int mid=(x+y)/2;
            if(arr[mid]==t){
                x1=mid;
                y=mid-1;
            }else if(arr[mid]<t){
                x=mid+1;
            }else if(arr[mid]>t){
                y=mid-1;
            }
        }

        // last occourence
        x=0;
        y=arr.length-1;
        while(x<=y){
            int mid=(x+y)/2;
            if(arr[mid]==t){
                x2=mid;
                x=mid+1;
            }else if(arr[mid]>t){
                y=mid-1;
            }else if(t>arr[mid]){
                x=mid+1;
            }
        }
       
        if(x1==-1||x2==-1){
            return 0;
        }else{
            return x2-x1+1;
        }
    }
    public static void main(String[] args) {
        int arr[]={1};
         System.out.println( occourence(arr,4));
        
    }
    
}
