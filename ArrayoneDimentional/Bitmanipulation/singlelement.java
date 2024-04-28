import java.util.*;
public class singlelement {
    public static void main(String[] args) {
        int a=9;
        int b=9;
        System.out.println(0^b);
        int arr[]={2,1,2,5,6,5,7,7,6};
        int ans=-1;
       int xorr = 0;
        for (int i = 0; i < arr.length; i++) {
            xorr = xorr ^ arr[i];
          //  System.out.println(xorr);
        }
        System.out.println(xorr);
    }
}
