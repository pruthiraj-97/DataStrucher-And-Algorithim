import java.util.*;
public class BeautifulTowerProblem {
    public static int beautiful(int arr[],int pick){
        int sum=0;
        int min=arr[pick];
        int count=1;
        int j=pick+1;
        while(j<arr.length){
            if(arr[j]<min){
                sum+=count*min;
                count=0;
                 min=arr[j];
            }
            j++;
            count++;
        }
        sum+=count*min;
        int x=sum;
        if(pick==0) return sum;
        j=pick-1;
        min=arr[j];
        count=0;
        while(j>=0){
            if(arr[j]<min){
                sum+=count*min;
                count=0;
                 min=arr[j];
            }
            j--;
            count++;
        }
        sum+=count*min;
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={3,6,3,5,5,1,2,5,5,6};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,beautiful(arr,i));
        }
        System.out.println(max);
        
    }
}
