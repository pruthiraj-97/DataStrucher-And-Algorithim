import java.util.*;
public class factorialcombination {
    static ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    public static void f(int n,int i,ArrayList<Integer> a,int pro){
        if(n==pro){
            ArrayList<Integer> ls=new ArrayList<>();
            for(int x=0;x<a.size();x++){
                ls.add(a.get(x));
            }
            ans.add(ls);
            return ;
        }
        if(i>=n) return ;
        if(pro*i<=n){
                a.add(i);
                f(n,i,a,pro*i);
                a.remove(a.size()-1);
            }
         f(n,i+1,a,pro);
    }
    public static void main(String[] args) {
        ans=new ArrayList<>();
        f(16,2,new ArrayList<>(),1);
        System.out.println(ans);
    }
}
