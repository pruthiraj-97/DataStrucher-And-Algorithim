import java.util.*;
public class SortAStack {
    public static void sortstack(Stack<Integer> st){
          Stack<Integer> sort=new Stack<>();
          while(st.size()>0){
            int temp=st.pop();
            while(sort.size()>0&&sort.peek()<temp){
                 st.push(sort.pop());
            }
            sort.push(temp);
          }
          while(sort.size()>0){
            st.push(sort.pop());
          }
          System.out.println(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(1);
        st.push(3);
        st.push(9);
        st.push(7);
        sortstack(st);
        
    }
    
}
