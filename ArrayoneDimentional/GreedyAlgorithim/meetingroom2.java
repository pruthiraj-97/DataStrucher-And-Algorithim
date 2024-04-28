import java.util.*;
public class meetingroom2 {
    public static void main(String[] args) {
        int[][] array = {
            {3, 9},
            {1, 7},
            {4, 1}
        };

        // Specify the column index based on which you want to sort (e.g., column 1)
        int columnIndexToSort = 1;

        // Use a custom comparator to sort the rows based on the specified column
        Arrays.sort(array, Comparator.comparingInt(row -> row[columnIndexToSort]));
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
