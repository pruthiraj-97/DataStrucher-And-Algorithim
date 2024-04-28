import java.util.*;
public class maxjheight {
    public static void main(String[] args) {
        int arr[][]={{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        int a[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                a[i][j]=arr[i][j];
            }
        }
        int row[]=new int[arr.length];
        int col[]=new int[arr[0].length];
        for(int i=0;i<arr.length;i++){
            int max=arr[i][0];
            for(int j=0;j<arr[0].length;j++){
                max=Math.max(max,arr[i][j]);
            }
            row[i]=max;
        }
        for(int j=0;j<arr[0].length;j++){
            int max=arr[0][j];
            for(int i=0;i<arr.length;i++){
                max=Math.max(max,arr[i][j]);
                col[j]=max;
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==row[i]||arr[i][j]==col[j]){
                    a[i][j]=0;
                    continue;
                }
                a[i][j]=Math.min(row[i],col[j])-arr[i][j];
                //System.out.print(Math.min(row[i],col[j])-arr[i][j]+" ");
            }
            //System.out.println();
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                sum+=a[i][j];
            }
        }
        System.out.println(sum);
    }
}
