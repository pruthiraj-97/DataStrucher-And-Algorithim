import java.util.*;
public class DesignHasjmap {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(8);
        arr.set(0, 7);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
    }
}
