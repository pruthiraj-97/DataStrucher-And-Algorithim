import java.util.*;
public class kthlargestintegerstring {
    public static int partition(String arr[],int s,int e){
        int pi=s;
        int i=pi;
        for(int j=i+1;j<=e;j++){
            if(arr[j].length()>arr[pi].length()){
                i++;
                String st=arr[i];
                arr[i]=arr[j];
                arr[j]=st;
            }else if(arr[j].length()==arr[pi].length() && arr[j].compareTo(arr[pi])>0){
                i++;
                String st=arr[i];
                arr[i]=arr[j];
                arr[j]=st;
            }
        }
        String temp=arr[pi];
        arr[pi]=arr[i];
        arr[i]=temp;
        System.out.println(i);
        return i;
    }
    public static String f(String arr[],int i,int j,int k){
        if(i>j) return "";
        int pi=partition(arr, i, j);
         if(pi==k) return arr[pi];
        if(pi<k) return f(arr,pi+1,j,k);
        else  return f(arr,i,pi-1,k);
    }
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        String arr[]={"233","97"};
       System.out.println(f(arr,0,arr.length-1,2));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
