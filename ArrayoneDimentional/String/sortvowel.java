import java.util.*;
public class sortvowel {
    public static void main(String[] args) {
        String str="lEetcOde";
        ArrayList<Character> arr=new ArrayList<>();
        arr.add('E');
        arr.add('e');
        arr.add('e');
        arr.add('O');
        arr.add('a');
        arr.add('A');
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println(arr.contains('A'));
    }
}
