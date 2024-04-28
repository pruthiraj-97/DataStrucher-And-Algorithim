import java.util.*;
public class findmedianofanunsortedarray {
    public static int partition(int arr[],int x,int y){
        int pi=x;
        int i=x;
        for(int j=x+1;j<=y;j++){
            if(arr[j]<arr[pi]){
                i++;
                int temp;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp;
        temp=arr[pi];
        arr[pi]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static int findMedian(int arr[],int x,int y,int n){
        if(x>y) return -1;
        int pi=partition(arr, x, y);
        if(pi==n/2) return arr[pi];
        if(pi<n/2) return findMedian(arr, pi+1, y, n);
        else return findMedian(arr, x, pi-1, n);
    }
    public static void main(String[] args) {
        int arr[]={5,1,2,3,4,7,9};
        int odd=findMedian(arr, 0, arr.length-1, arr.length);
        List<Integer> a={1,3};
        System.out.println(a);
    }
}
