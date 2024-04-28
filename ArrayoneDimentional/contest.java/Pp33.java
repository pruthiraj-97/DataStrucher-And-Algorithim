import java.util.*;
public class Pp33 {
    public static boolean cheak(int arr[]){
        for(int i=1;i<arr.length;i++){
             if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    public static boolean f(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int count=0;
            for(int j=0;j<arr.length-i-1;j++){
                int bit1=Integer.bitCount(arr[j]);
                int bit2=Integer.bitCount(arr[j+1]);
                if(arr[j+1]<arr[j]&&bit1==bit2){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
            boolean flag=cheak(arr);
            if(flag) return true;
            if(!flag&&count==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={8,4,2,30,15};
        System.out.println(f(arr));
        
     }
}
