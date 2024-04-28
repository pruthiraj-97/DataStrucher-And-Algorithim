import java.util.*;
public class Nextgreaterelement1leetcode {
    public static int[] nextgrater(int arr1[],int arr2[]){
        Map<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[arr1.length];
        for(int i=arr2.length-1;i>=0;i--){
            while(st.size()>0&&arr2[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                mp.put(arr2[i],-1);
            }
            else{
                mp.put(arr2[i],st.peek());
            }
            st.push(arr2[i]);
        }
        
        for(int i=0;i<arr1.length;i++){
            ans[i]=mp.get(arr1[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[]={4,1,2};
        int arr2[]={1,3,4,2};
        nextgrater(arr1,arr2);
       
    }
    
}
