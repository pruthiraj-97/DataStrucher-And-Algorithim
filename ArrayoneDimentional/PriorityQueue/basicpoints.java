import java.util.*;
public class basicpoints {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(6);
        pq.add(6);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.remove(2);
        System.out.println(arr);
        
    }
}
