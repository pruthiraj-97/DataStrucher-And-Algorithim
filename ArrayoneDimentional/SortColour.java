import java.util.*;
public class SortColour {
    public static void sortcolour(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            if(arr[j]==0){
                while(j>0&&arr[j]==0&&arr[j-1]!=0){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }
            }else if(arr[j]==1){
                while(j>0&&arr[j]==1&&arr[j-1]!=0){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array length ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sortcolour(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
