import java.util.*;
public class minimumcosttree {

    public static void main(String[] args) {
       int[] arr = {1,2,3,4 };
       int target =2;
       int index = -1; // If the element is not found, index will remain -1

       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == target) {
               index = i;
               break;
           }
       }

       if (index != -1) {
           System.out.println("Element found at index: " + index);
       } else {
           System.out.println("Element not found in the array.");
       }
       public static void main(String[] args) {
        String s='ks';
        s.substring(index)
       }
    }
}
