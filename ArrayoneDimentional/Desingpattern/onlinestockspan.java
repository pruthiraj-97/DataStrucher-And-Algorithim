import java.util.*;
class pair{
    int idx;
    int price;
    pair(int idx,int price){
        this.idx=idx;
        this.price=price;
    }
}
class stock{
    static Stack<pair> st;
    static int idx=-1;
    stock(){
       idx=-1;
      st=new Stack<>();
    }
    public int span(int price){
         idx++;
         pair p=new pair(idx,price);
         while(st.size()>0&&st.peek().price<=p.price) st.pop();
         if(st.size()==0){
            st.add(p);
            return idx+1;
         }else{
            int val=idx-st.peek().idx;
            st.add(p);
            return val;
         }
    }
}
public class onlinestockspan {
    public static void main(String[] args) {
        stock st=new stock();
        System.out.println(st.span(100));
        System.out.println(st.span(180));
          stock st1=new stock();
          System.out.println();
        System.out.println(st1.span(100));
        System.out.println(st1.span(80));

        
    }
}
