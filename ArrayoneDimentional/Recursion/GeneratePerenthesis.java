import java.util.*;
public class GeneratePerenthesis {
    static   List<String> ans=new ArrayList<>();
    public static void f(int op,int cl,int n,String s){
            if(op==n&&cl==n){
                ans.add(s);
                return ;
            }
            if(op<n){
                f(op+1,cl,n,s+'(');
            }
            if(cl<op) f(op,cl+1,n,s+")");
    }
    public static void main(String[] args) {
        //List<String> ans=new ArrayList<>();
        int n=1;
        f(0,0,n,"");
        System.out.println(ans);

    }
}
