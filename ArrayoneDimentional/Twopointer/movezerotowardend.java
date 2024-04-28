import java.util.*;
public class movezerotowardend {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int i=0;
        int j=i+1;
        while(i<arr.length-1&&j<arr.length){
            if(arr[i]==0&&arr[j]!=0){
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }else{
                while(j<arr.length&&arr[j]==0){
                    j++;
                }
                if(j!=arr.length){
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j++; 
                }
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
