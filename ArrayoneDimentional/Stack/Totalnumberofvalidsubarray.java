import java.util.*;
public class Totalnumberofvalidsubarray {
    public static int validsubarray(int arr[]){
        Stack<Integer> st=new Stack<>();
        int next[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(st.size()>0&&arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0)  next[i]=arr.length;
            else next[i]=st.peek();
            st.push(i);
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=count+next[i]-i;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,3,5};
        System.out.println(validsubarray(arr));
        
    }
    
}
