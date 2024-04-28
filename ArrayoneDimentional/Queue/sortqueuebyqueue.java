import java.util.*;
public class sortqueuebyqueue {
    public static void sortQueue(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        while(q.size()>0){
           int top=q.poll();
           while(st.size()>0&&st.peek()<top){
            q.add(st.pop());
           }
           st.add(top);
        }
        while(st.size()>0){
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(5);
        q.add(1);
        q.add(3);
        q.add(34);
        q.add(11);

        sortQueue(q);
        System.out.println(q);

    }
}
