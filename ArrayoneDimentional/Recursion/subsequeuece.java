import java.util.*;
public class subsequeuece {
    public static void helper(int arr[],int i,List<Integer> ans){
       if(i>=arr.length){
        System.out.println(ans);
        return ;
       }
       ans.add(arr[i]);
       helper(arr,i+1,ans);
       ans.remove(ans.size()-1);
        helper(arr,i+1,ans);
    }
    public static void main(String[] args) {
        int arr[]={3,1,2};
        List<Integer> ans=new ArrayList<>();
        helper(arr,0,ans);
    }
}
