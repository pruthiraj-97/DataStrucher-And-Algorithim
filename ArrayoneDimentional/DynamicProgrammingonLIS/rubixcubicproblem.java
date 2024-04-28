import java.util.*;
public class rubixcubicproblem {
    public static void main(String[] args) {
        int arr[][]={{50,145,20},{95,7,153},{5,23,712}};
        Arrays.sort(arr, (a, b) -> (a[0] + a[1] + a[2]) - (b[0] + b[1] + b[2]));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
