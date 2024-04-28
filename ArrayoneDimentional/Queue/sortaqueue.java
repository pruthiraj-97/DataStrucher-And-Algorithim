import java.util.*;
public class sortaqueue {
    public static void show(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        while(q.size()>0){
            int temp=q.poll();
            while(st.size()>0&&st.peek()<temp){
                 q.add(st.pop());
            }
            st.push(temp);
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(4);
        q.add(1);
        q.add(9);
        q.add(7);
        show(q);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
    }
    
}
