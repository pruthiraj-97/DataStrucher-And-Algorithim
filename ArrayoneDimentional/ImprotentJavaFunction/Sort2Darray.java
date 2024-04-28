import java.util.*;
public class Sort2Darray {
    public static void main(String[] args) {
        // Comparator<int[]> com = new Comparator<int[]>() { // bubble sort 
        //     public int compare(int[] arr1, int[] arr2) {
        //         if (arr1[1] > arr2[1]) return 1;
        //         return -1;
        //     }
        // };
        // int arr[][]={{1,2,4},{5,1,2},{7,8,1}};
        // Arrays.sort(arr,com);
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        Comparator<Long> com=new Comparator<Long>() {
            public int compare(Long x,Long y){
                if(x<y) return 1;
                return -1;
            }
        };
        List<String> ls=new ArrayList<>();
        ls.add("pruthi");
        ls.add("jotish");
        ls.add("sarthak");
        ls.add("bapun");
        
        System.out.println(ls);
    }
}
