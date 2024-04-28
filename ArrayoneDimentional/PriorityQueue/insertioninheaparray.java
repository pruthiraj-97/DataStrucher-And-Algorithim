import java.util.*;
public class insertioninheaparray {
    public static void swap(int arr[],int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void heapify(int arr[],int i){
        int parent=(i-1)/2;
        if(parent>0){
            if(arr[parent]<arr[i]){
                  int temp;
                  temp=arr[i];
                  arr[i]=arr[parent];
                  arr[parent]=temp;
                heapify(arr,parent);
            }
        }
    }
    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int insert(int arr[],int n,int val){
        arr[n]=val;
        heapify(arr,n);
        n++;
        return n;
    }
    public static void main(String[] args) {
         int max=100;
         int arr[]=new int[max];
         arr[0]=100;
         arr[1]=70;
         arr[2]=60;
         arr[3]=50;
         arr[4]=55;
         int n=5;
         print(arr,4);
         n=insert(arr,n,80);
         System.out.println();
         print(arr,n);

    }
    
}
