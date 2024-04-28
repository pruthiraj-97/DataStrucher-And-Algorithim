import java.util.*;
public class Activityselectionproblem {
    public static void main(String[] args){
        // Your two arrays
        int[] array1 = {3, 1, 4, 2};
        int[] array2 = {9, 7, 1, 8};

        // Create an array of indices
        Integer[] indices = new Integer[array1.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // Sort the indices array based on the values in array1
        Arrays.sort(indices, Comparator.comparingInt(index -> array2[index]));

        // Create new sorted arrays based on the sorted indices
        int[] sortedArray1 = Arrays.stream(indices).mapToInt(i -> array1[i]).toArray();
        int[] sortedArray2 = Arrays.stream(indices).mapToInt(i -> array2[i]).toArray();

        // Print the sorted arrays
        System.out.println("Sorted Array1: " + Arrays.toString(sortedArray1));
        System.out.println("Sorted Array2: " + Arrays.toString(sortedArray2));
    }
}

    

