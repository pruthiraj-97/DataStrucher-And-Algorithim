import java.util.*;
public class print {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int[][] array = {
            {3, 9},
            {2, 5},
            {1, 8},
            {5, 4},
            {5, 7},
            {6, 2}
        };

        // Define a custom Comparator to sort based on the first column and then the second column.
        Comparator<int[]> customComparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // Compare based on the first column.
                int cmp = Integer.compare(o1[0], o2[0]);
                if (cmp == 0) {
                    // If the first column values are equal, compare based on the second column.
                    cmp = Integer.compare(o1[1], o2[1]);
                }
                return cmp;
            }
        };

        // Sort the 2D array using the customComparator.
        Arrays.sort(array, customComparator);

        // Print the sorted array.
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
