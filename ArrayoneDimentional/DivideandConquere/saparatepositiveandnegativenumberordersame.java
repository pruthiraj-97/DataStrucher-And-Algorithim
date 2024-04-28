import java.util.*;
public class saparatepositiveandnegativenumberordersame {
    public static void partition(int arr[],int l,int mid,int h){
        int i=l;
        int j=mid+1;
        while(i<=mid&&arr[i]<0){
            i++;
        }
        while(i<=mid&&j<=h){
            if(arr[i]>0&&arr[j]<0){
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;

            }else{
                break;
            }
        }

    }
    public static void saparate(int arr[],int l,int h){
        if(l==h){
            return ;
        }
        int mid=(l+h)/2;
        saparate(arr,l,mid);
        saparate(arr,mid+1,h);
        partition(arr,l,mid,h);
    }
    public static void main(String[] args) {
        int arr[]={1,-3,9-7,-11};
        saparate(arr,0,4);
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }

    }
    
}
//-20 ,-4, -13, -5, 19 ,7 ,11, 3