import java.util.*;
public class ppp {
    public static int f(int arr1[],int arr2[],int arr3[]){
        float s1=(float)((arr3[0]-arr2[0])/(arr3[1]-arr2[1]));
        float s2=(float)((arr3[0]-arr1[0])/(arr3[1]-arr1[1]));
        System.out.println(s1+" "+s2);
        if(s1==s2) return 0;
        int d1=arr3[0]-arr1[0]*arr3[0]-arr1[0]+arr3[1]-arr1[1]*arr3[1]-arr1[1];
        int d2=arr3[0]-arr2[0]*arr3[0]-arr2[0]+arr3[1]-arr2[1]*arr2[1]-arr1[1];
        System.out.println(d1+" "+d2);
        if(d1==d2) return 0;
        return 1;
    }
    public static int count(int arr[][]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=0;k<arr.length;k++){
                    if(i==k||j==k) continue;
                    count+=f(arr[i],arr[j],arr[k]);
                } 
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][]={{3,1},{1,3},{1,1}};
        // System.out.println(count(arr));
        long minValue = Long.MIN_VALUE;
        System.out.println(minValue);
    }
}
