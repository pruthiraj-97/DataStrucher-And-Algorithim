import java.util.*;
public class practice {
    static ArrayList<String> ans=new ArrayList<>();
public static void f(String str,int i,String s1,String s2){
    if(i==str.length()){
        ans.add(s2);
        return ;
    }
    f(str,i+1,s1+str.charAt(i),s2+str.charAt(i));
    int j=s1.length()-1
    while (j>=0&&s1.charAt(j)-'0'<=9&&s1.charAt(j)-'0'>=0) {
         j--;
    }
    int l=Math.min(j+1,s2.length());
    String st=s2.substring(0,l);
    int num=i-st.length()+1;
    int n=i-s1.length()+1;
    f(str,i+1,s1+n,st+num);
}
    public static void main(String[] args) {
       ans=new ArrayList<>();
       f("code",0,"","");
       System.out.println(ans);
       System.out.println('3'-'2');
       System.out.println('d'-'0');
    }
}
