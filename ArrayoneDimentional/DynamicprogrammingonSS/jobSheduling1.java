import java.util.*;
public class jobSheduling1 {
    public static int maxProfit(int arr[][],int i,int prev,int dp[][]){
        if(i>=arr.length) return 0;
        if(dp[i][prev]!=-1) return dp[i][prev];
        int take=Integer.MIN_VALUE;
        if(prev<arr[i][1]){
            take=arr[i][2]+maxProfit(arr,i+1,prev+1,dp);
        }
        int nottake=maxProfit(arr,i+1,prev,dp);
        return dp[i][prev]=Math.max(take,nottake);
    }
    public static void main(String[] args) {
        int arr[][]= {{1,2,100},{2,1,19},{3,2,27},
            {4,1,25},{5,1,15}};
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i][1]);
        }
        int dp[][]=new int[arr.length][max+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
        System.out.println(maxProfit(arr,0,0,dp));

        // Sort the array based on the values in the first column

        // Print the sorted array
        // for (int[] row : arr) {
        //     System.out.println(Arrays.toString(row));
        // }
        LinkedList<int[]> merge =new LinkedList<>();
        
        
    }
}
