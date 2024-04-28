import java.util.*;
public class Matrixshiftmath {
    public static boolean cheak(int arr[][],int k){
        for(int i=0;i<arr.length;i++){
            int x=k%arr[0].length;
            int s=0;
            if(i%2==0){
               s=x;
            }else{
                s=arr[0].length-x;
            }
            for(int j=0;j<arr[0].length;j++){
                if(s==arr[0].length) s=0;
                if(arr[i][j]!=arr[i][s]){
                    System.out.println(arr[i][j]+" "+arr[i][s]);
                    return false; 
                }
                s++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,1,2},{5,5,5,5},{6,3,6,3}};
        System.out.println(cheak(arr,2));
    }
}
