import java.util.*;
public class slidingwindowmunimum {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        // Getting the last element (largest element)
        Integer lastElement = treeSet.first();

        // Printing the result
        System.out.println("Last Element: " + lastElement);
        System.out.println(treeSet);

    }
}
