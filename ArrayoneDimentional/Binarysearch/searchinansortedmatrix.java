import java.util.*;
public class searchinansortedmatrix {
    public static int[] search(int arr[][],int t){
        int x=0;
        int y=arr.length*arr[0].length-1;
        int m=arr[0].length;
        int anr[]=new int[2];
        while(x<=y){
            int mid=(x+y)/2;
            int ans=arr[mid/m][mid%m];
            if(ans==t){
                anr[0]=mid/m;
                anr[1]=mid%10;
            }else if(ans>t){
                y=mid-1;
            }else{
                x=mid+1;
            }
        }
        anr[0]=-1;
        anr[1]=-1;
        return anr;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int ans[]=search(arr,4);
        System.out.print(ans[0]+" "+ans[1]);
        
    }
    
}
