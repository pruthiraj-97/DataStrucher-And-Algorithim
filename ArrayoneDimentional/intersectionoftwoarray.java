import java.util.*;
public class intersectionoftwoarray {
    public static void main(String[] args) {
        int arr1[]={1,2,2,1};
        int arr2[]={2,2};
        Map<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr1.length;i++){
            if(!mp.containsKey(arr1[i])){
               mp. put(arr1[i],i);
            }
        }
        System.out.print(mp.keySet()+" ");
        for(int i=0;i<arr2.length;i++){
            if(mp.containsKey(arr2[i])){
                st.push(arr2[i]);
                mp.remove(arr2[i]);
            }
        }
        System.out.println(st);
        int ans[]=new int[st.size()];
        int x=0;
        while(st.size()>0){
            ans[x++]=st.pop();
        }
        
    }
    
}
