import java.util.*;
public class grid {
    public static void isValid(int arr[][],int ans[][],int num[][],int i,int j,int k){
          int sum=0;
          for(int x=i;x<=i+2;x++){
            sum+=arr[x][j]+arr[x][j+1]+arr[x][j+2];
          }
          sum=sum/9;
          for(int x=i;x<i+3;x++){
            for(int y=j;y<j+3;y++){
                if(x+1<i+3&&Math.abs(arr[x+1][y]-arr[x][y])>k) return ;
                if(y+1<j+3&&Math.abs(arr[x][y+1]-arr[x][y])>k) return ;
                if(x-1>=i&&Math.abs(arr[x-1][y]-arr[x][y])>k) return ;
                if(y-1>=j&&Math.abs(arr[x][y-1]-arr[x][y])>k) return ;
            }
          }
          System.out.println("**");
          for(int x=i;x<i+3;x++){
            for(int y=j;y<j+3;y++){
                 ans[x][y]+=sum;
                 num[x][y]++;
            }
          }

    }
    public static int[][] f(int arr[][],int k){
        int ans[][]=new int[arr.length][arr[0].length];
        int num[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr[0].length-2;j++){
                isValid(arr, ans, num, i, j, k);
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                if(ans[i][j]==0){
                    ans[i][j]=arr[i][j];
                    num[i][j]++;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=ans[i][j]/num[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30},{15,25,35},{20,30,40},{25,35,45}};
        int k=12;
        int ans[][]=f(arr,k);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
