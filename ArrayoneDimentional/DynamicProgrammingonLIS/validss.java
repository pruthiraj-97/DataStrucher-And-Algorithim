import java.util.*;
public class validss {
    public static void f(int n,int x,int y){
    int arr[][]=new int[n][n];
        // arr[x-1][y-1]=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i!=j) arr[i][j]=(int)1e9;
            }
        }
        for(int i=0;i<n-1;i++){
            arr[i][i+1]=1;
            arr[i+1][i]=1;
        }
        if(x!=y){
        arr[x-1][y-1]=1;
        arr[y-1][x-1]=1;
        }
        
        for(int k=0;k<arr.length;k++){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    arr[i][j]=Math.min(arr[i][j],arr[i][k]+arr[k][j]);
                }
            }
        }
        int ans[]=new int[n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>=1e9||arr[i][j]==0) continue;
                int dis=arr[i][j];
                ans[dis-1]++;
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        f(4,1,1);
    }
}
