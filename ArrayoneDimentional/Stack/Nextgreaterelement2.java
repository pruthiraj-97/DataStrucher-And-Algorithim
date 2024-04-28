import java.util.*;
public class Nextgreaterelement2 {
    public static void next(int arr[]){
        int ans[]=new int[arr.length];
    Stack<Integer> st=new Stack<>();
    for(int i=arr.length-1;i>=0;i--){
        while(st.size()>0&&arr[i]>=st.peek()){
            st.pop();
        }
        if(st.size()>0){
           ans[i]=st.peek();
        }else{
            int max=arr[i];
            for(int j=0;j<=i;j++){
               if(arr[j]>max){
                max=arr[j];
                break;
               }
            }
            if(max!=arr[i]){
                ans[i]=max;
            }else{
                ans[i]=-1;
            }
        }
        st.push(arr[i]);
    }
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
    }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        next(arr);
        
    }
    
}
