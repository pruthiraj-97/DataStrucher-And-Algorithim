import java.util.*;
public class fractionKnapsack {
    public static float  f(int arr[][],int wt){
        float ans=0;
        for(int i=0;i<arr.length;i++){
            if(wt<arr[i][1]){
                float f=(float)wt/arr[i][1];
               ans=ans+(float)((f)*arr[i][0]);
               return ans;
            }else{
                ans=ans+(float)arr[i][0];
                wt-=arr[i][1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Comparator<int[]> com=new Comparator<int[]>() {
            public int compare(int arr1[],int arr2[]){
                float f1=(float)arr1[0]/arr1[1];
                float f2=(float)arr2[0]/arr2[1];
                if(f1<f2) return 1;
                return 0;
            }
        };
        int arr[][] ={{60, 10}, {100, 20}, {120, 30}}; // profit/weight
        Arrays.sort(arr,com);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][0]+" "+arr[i][1]);
            System.out.println();
        }
        System.out.println(f(arr,50));
    }
}
