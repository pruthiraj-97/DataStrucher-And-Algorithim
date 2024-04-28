import java.util.*;
public class kthelementoftwosortedarray {
    public static long kth(int arr1[],int arr2[],int k){
        if(arr1.length>arr2.length){
            return kth(arr2,arr1,k);
        }
       
        int x = Math.max(0,k-arr2.length), y = Math.min(k,arr1.length);
        while(x<=y){
            int cut1=(x+y)/2;
            int cut2=k-cut1;
            int l1=(cut1==0)?Integer.MIN_VALUE:arr1[cut1-1];
            int l2=(cut2==0)?Integer.MIN_VALUE:arr2[cut2-1];
            int r1=(cut1==arr1.length)?Integer.MAX_VALUE:arr1[cut1];
            int r2=(cut2==arr2.length)?Integer.MAX_VALUE:arr2[cut2];
            // System.out.println(l1);
            // System.out.println(l2);
            // System.out.println(r1);
            // System.out.println(r2);
            if(l1<=r2&&l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                y=cut1-1;
            }else{
                x=cut1+1;
            }
            //break;
        }
        return 0;

    }
    public static void main(String[] args) {
        int arr1[]={1,4,8,10};
        int arr2[]={2,3,6,7,9};
        System.out.println(kth(arr1,arr2,5));

    }
    
}
