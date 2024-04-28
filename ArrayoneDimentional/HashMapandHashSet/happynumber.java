import java.util.*;
public class happynumber {
    public static void f(int i,String s,int n){
        if(i==n){
            System.out.println(s);
            return ;
        }
        f(i+1,s+"1",n);
        f(i+1,s+"0",n);
    }
    public static void main(String[] args) {
        f(0,"",3);
        TreeSet<Integer> st
            = new TreeSet<>(); 
        st.add(4);
        st.add(5);
        st.add(6);
        st.add(8);
        st.add(7);
        System.out.println(st.contains(9));
          /*Iterator<Integer> iterator = st.iterator();
          int value = iterator.next();
          iterator.remove();
          System.out.println(value);*/
          System.out.println(st);
    }
}
