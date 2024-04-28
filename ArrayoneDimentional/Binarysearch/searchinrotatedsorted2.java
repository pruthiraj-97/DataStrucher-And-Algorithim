import java.util.*;
public class searchinrotatedsorted2 {
    public static boolean search(int arr[],int t){
        int x=0;
        int y=arr.length-1;
        while(x<=y){
            int mid=(x+y)/2;
            if(arr[mid]==t){
                return true;
            }
            else if(arr[mid]==arr[x]&&arr[mid]==arr[y]){
                x++;
                y--;
            }else if(arr[mid]<=arr[y]){
                if(t>arr[mid]&&t<=arr[y]){
                    x=mid+1;
                }else{
                    y=mid-1;
                }
            }else{
                if(t<arr[mid]&&t>=arr[x]){
                    y=mid-1;
                }else{
                    x=mid+1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2,3,3};
        System.out.println(search(arr,2));

        
    }
    
}
