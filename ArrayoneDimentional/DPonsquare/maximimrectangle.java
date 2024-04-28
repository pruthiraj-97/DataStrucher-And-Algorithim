import java.util.*;
public class maximimrectangle {
    public static void main(String[] args) {
        int arr[][]={{0 ,1 ,1 ,0},{1, 1, 1, 1},{1, 1, 1, 1},{1, 1, 0, 0}};
        int dp[][] = new int[arr[0].length][arr[0].length];
        int max=0;
        for(int i=0;i<arr[0].length;i++){
            int count0=0;
            int count1=0;
            for(int j=i;j<arr[0].length;j++){
                 if(arr[0][j]==0){
                    count0++;
                 }else{
                    count1++;
                 }
                 
                if(count0==0){
                    dp[i][j]=count1;
                }
                max=Math.max(max,dp[i][j]);
            }
        }
        for(int k=1;k<arr.length;k++){
            for(int i=0;i<arr[0].length;i++){
                int count0=0;
                int count1=0;
                for(int j=i;j<arr[0].length;j++){
                     if(arr[k][j]==0){
                        count0++;
                     }else{
                        count1++;
                     }
                     if(count0==0){
                        dp[i][j]=count1+dp[i][j];
                     }else{
                        dp[i][j]=0;
                     }
                     max=Math.max(max,dp[i][j]);
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println(max);
    }
}
