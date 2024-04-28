import java.util.*;
public class minimumswaptosaparate {
    public static void main(String[] args) {
        String str="101";
        int arr[]=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }
        for(int i=0;i<str.length();i++){
            System.out.print(arr[i]+" ");
        }
        long count=0;
        for(int i=1;i<str.length();i++){
            int j=i;
            while(j>0&&arr[j]==0&&arr[j-1]==1){
                count++;
                int temp;
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
         }
        }
        System.out.println(count);
    }
}
