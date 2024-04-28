import java.util.*;
public class deleteinsertrandom {
    public static void main(String[] args) {
         int arr[]={1,5,2,3,7};
         Random r=new Random();
         int n=r.nextInt(arr.length);
         System.out.println(arr[n]);
    }
}
