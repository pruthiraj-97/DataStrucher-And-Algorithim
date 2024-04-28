import java.util.*;
public class countinversion {
    static int count =0;
    public static void merge(int arr[],int x,int mid,int y){
            int left[]=new int[mid-x+1];
            int right[]=new int[y-mid];
            for(int i=0;i<left.length;i++){
                left[i]=arr[i+x];
            }
            for(int j=0;j<right.length;j++){
                right[j]=arr[mid+1+j];
            }
            int i=0;
            int j=0;
            while(i<left.length&&j<right.length){
                  while(i<left.length&&left[i]<=right[j]){
                    i++;
                  }
                  count+=left.length-i;
                  j++;
            }
            i=0;
            j=0;
            int s=x;
            while(i<left.length&&j<right.length){
                  if(left[i]<right[j]){
                    arr[x++]=left[i++];
                  }else{
                    arr[x++]=right[j++];
                  }
            }
            while(i<left.length) arr[x++]=left[i++];
            while(j<right.length) arr[x++]=right[j++];
    }
    public static void  count(int arr[],int x,int y){
             if(x>=y) return ;
             int mid=(x+y)/2;
             count(arr,x,mid);
             count(arr,mid+1,y);
             merge(arr,x,mid,y);
    }
    public static void main(String[] args) {
        int arr[]={2, 3, 4, 5, 6};
        for(int num:arr){
          System.out.println(num);
        }
        count=0;
        count(arr,0,arr.length-1);
        System.out.println(count);
       
       // For those who didn't understand why exactly(K) = atMost(K) - atMost(K-1) works....

    }
}
