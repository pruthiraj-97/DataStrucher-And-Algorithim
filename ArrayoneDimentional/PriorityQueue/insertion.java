import java.util.*;
public class insertion {
    static int n=0;
    static int heap[]=new int[100];
    public static void swap(int x,int y){
        int temp;
        temp=heap[x];
        heap[x]=heap[y];
        heap[y]=temp;
    }
    public static void  delete(){
            n--;
            heap[0]=heap[n];
            int i=n;
            while(i<=(n-1)/2){
              int max=(heap[2*i+1]>heap[2*i+2])?2*i+1:2*i+2;
              swap(i,max);
              i=max;
            }
    }
    public static void insert(int x){
        heap[n]=x;
        int i=n;// current index
        int parent=(i-1)/2; // parent index
        while(i>0&&heap[parent]<heap[i]){
            int temp;
            temp=heap[parent];
            heap[parent]=heap[i];
            heap[i]=temp;
            i=parent;
            parent=(i-1)/2;
        }
        n++;
    }
    public static void show(){
        for(int i=0;i<n;i++){
            System.out.print(heap[i]+" ");
        }
    }
    public static void main(String[] args) {
        insert(40);
        insert(30);
        insert(50);
        insert(5);
        insert(10);
        insert(60);
        show();
        System.out.println();
        delete();
        show();
        
    }
    
}
