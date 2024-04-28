import java.util.*;
class pair implements Comparable<pair>{
    int val;
    String s;
    pair(String s,int val){
        this.s=s;
        this.val=val;
    }
    public int compareTo(pair p){
       return p.val-this.val;
       
    }
}
public class kthlargestintegerinstring {
    public static void main(String[] args) {
        String str[]={"2","21","12","1"};
        //System.out.print(str[0].compareTo(str[1]));
        PriorityQueue<pair> pq=new PriorityQueue<>();
        int k=3;
        for(int i=0;i<str.length;i++){
            int a=Integer.valueOf(str[i]);
            pq.add(new pair(str[i],a));
        }
        for(int i=1;i<k;i++){
            pq.poll();
        }
        pair p=pq.poll();
        System.out.print(p.s);
        //
        int[] array1 = {3, 1, 4, 1, 5, 9, 2, 6};
        int[] array2 = {10, 20, 30, 40, 50, 60, 70, 80};

        // Create an array of indices
        Integer[] indices = new Integer[array1.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // Sort indices based on the values in array1
        Arrays.sort(indices, Comparator.comparingInt(i -> array1[i]));

        // Create sorted arrays based on the sorted indices
        int[] sortedArray1 = Arrays.stream(indices).mapToInt(i -> array1[i]).toArray();
        int[] sortedArray2 = Arrays.stream(indices).mapToInt(i -> array2[i]).toArray();

        // Print the sorted arrays
        System.out.println("Sorted array1: " + Arrays.toString(sortedArray1));
        System.out.println("Sorted array2: " + Arrays.toString(sortedArray2));
        List<int[]> ans=new ArrayList<>();
        
    }
}
