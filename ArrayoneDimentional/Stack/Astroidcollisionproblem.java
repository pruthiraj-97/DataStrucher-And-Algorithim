import java.util.*;
public class Astroidcollisionproblem {
    public static void collision(int arr[]){
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
             while(st.size()>0&&(arr[i]>0&&st.peek()<0)){
                if(Math.abs(arr[i])>Math.abs(st.peek())){
                      st.pop();
                }else{
                    break;
                }
             }
             if(st.size()==0) st.push(arr[i]);
             else if(Math.abs(arr[i])==Math.abs(st.peek())&&arr[i]>0&&st.peek()<0){
                  st.pop();
             }
             else if(arr[i]<0&&st.peek()>0){
                st.push(arr[i]);
             }else if(arr[i]*st.peek()>0){
                st.push(arr[i]);
             }
        }
        int ans[]=new int[st.size()];
        int x=0;
        while(st.size()>0){
            ans[x++]=st.pop();
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,10,-5};
        collision(arr);

    }
    
}
