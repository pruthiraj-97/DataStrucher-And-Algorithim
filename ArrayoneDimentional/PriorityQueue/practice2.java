import java.util.*;
public class practice2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(6);
        pq.remove(3);
        System.out.println(pq.contains(8));

    }
}
