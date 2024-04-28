import java.util.*;
public class differenceinGrid {
    public static int[][] f(int arr[][]){
        int row[]=new int[arr.length];
        int col[]=new int[arr[0].length];
        int ans[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    row[i]++;
                    col[i]++;
                }else{
                    row[i]--;
                    col[i]--;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=row[i]+col[j]
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
