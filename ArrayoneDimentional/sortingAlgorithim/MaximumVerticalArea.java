import java.util.*;
public class MaximumVerticalArea {
    public static int findMaxArea(int arr[][]){
          int max=0;
          for(int i=0;i<arr.length-1;i++){
            int curr=Math.abs(arr[i][0]-arr[i+1][0]);
            max=Math.max(max,curr);
          }
          return max;
    }
    public static void main(String[] args) {
        int arr[][]={{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        Comparator<int[]> com=new Comparator<int[]>() {
            public int compare(int a1[],int a2[]){
                 if(a1[0]>=a2[0]) return 1;
                 return -1;
            }
        };
        Arrays.sort(arr,com);
        System.out.println(findMaxArea(arr));
    }
}
