import java.util.*;
public class combinationalsum {
    static List<List<Integer>> ans=new ArrayList<>();
    public static void f(List<Integer> a,int arr[],int x,int sum,int t){
        if(sum==t){
            System.out.println(a);
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<a.size();i++){
               ls.add(a.get(i));
            }
            ans.add(ls);
            return ;
        }
        for(int i=x;i<arr.length;i++){
            if(sum+arr[i]<=t){
                a.add(arr[i]);
                f(a,arr,i,sum+arr[i],t);
                a.remove(a.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        ans=new ArrayList<>();
        f(new ArrayList<>(),arr,0,0,7);
        System.out.println(ans);
    }
}
