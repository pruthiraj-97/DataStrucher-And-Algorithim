import java.util.*;
public class medianoftwosortedarray {
    public static double median(int arr1[],int arr2[]){
        if(arr2.length>arr1.length){
            return median(arr2,arr1);
        }
        int x=0;
        int y=arr1.length;
        int med=(arr1.length+arr2.length+1)/2;
        while(x<=y){
            int cut1=(x+y)/2;
            int cut2=med-cut1;
            int l1=(cut1==0)?Integer.MIN_VALUE:arr1[cut1-1];
            int l2=(cut2==0)?Integer.MIN_VALUE:arr2[cut2-1];
            int r1=(cut1==arr1.length)?Integer.MAX_VALUE:arr1[cut1];
            int r2=(cut2==arr2.length)?Integer.MAX_VALUE:arr2[cut2];
            if(l1<=r2&&l2<=r1){
                if((arr1.length+arr2.length)%2!=0){
                    return Math.max(l1,l2);
                }else{
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
            }else if(l1>r2){
                y=cut1-1;
            }else{
                x=cut1+1;
            }
        }
        return 0.0;
    }
    public static void main(String[] args) {
        int arr1[]={1,4,6,7};
        int arr2[]={3,5,6,9,11,13};
        System.out.println(median(arr1,arr2));
        
    }
    
}
