import java.util.*;
public class makestringwith1and0 {
    static List<String> ans=new ArrayList<>();
    public static void f(String s,int n){
        if(s.length()==n){
            ans.add(s);
            return ;
        }
        f(s+'0',n);
        if(s.length()==0||s.charAt(s.length()-1)!='1'){
            f(s+'1',n);
        }
        
    }
    public static void main(String[] args) {
        int n=3;
        f("",n);
        System.out.println(ans);
    }
}
