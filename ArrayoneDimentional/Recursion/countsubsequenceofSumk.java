import java.util.*;
public class countsubsequenceofSumk {
    public static int count(int arr[],int i,int sum,int t){
        if(i==arr.length){
            if(t==sum) return 1;
            return 0;
        }
        int pic=count(arr,i+1,sum+arr[i],t);
        int notpic=count(arr,i+1,sum,t);
        return pic+notpic;
    }
    public static void main(String[] args) {

          int arr[]={1,2,1};
          System.out.println(count(arr,0,0,4));
    }
}
