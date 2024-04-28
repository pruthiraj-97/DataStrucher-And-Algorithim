import java.util.*;
public class sorttwosaparatearray {
    public static void main(String[] args) {
        int arr[][]={{2,5,4},{1,5,1}};
        Comparator<int[]> com=new Comparator<int[]>() {
            public int compare(int arr1[],int arr2[]){
                if(arr1[0]>arr2[0]) return 1;
                else return -1;
            }
        };
        Arrays.sort(arr,com);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
