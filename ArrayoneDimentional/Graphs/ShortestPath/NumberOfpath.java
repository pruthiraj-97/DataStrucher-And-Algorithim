import java.util.*;
public class NumberOfpath {
    public static void main(String[] args) {
        int arr[][]={{1,2},{3},{3},{}}};
        List<List<Integer>> adj=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
       for(int i=0;i<n;i++){
           adj.add(new ArrayList<>());
       }
        for(int i=0;i<arr.length;i++){
           adj.get(arr[i][0]).add(arr[i][1]);
       }
    }


