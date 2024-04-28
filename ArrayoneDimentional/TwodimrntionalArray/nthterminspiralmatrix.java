import java.util.*;
public class nthterminspiralmatrix {
    public static int search(int arr[][],int k){
        int strow=0;
        int endrow=arr.length-1;
        int stcol=0;
        int endcol=arr[0].length-1;
        int x=k-1;
        int y=0;
        while(strow<=endrow&&stcol<=endcol){
        for(int i=stcol;i<=endcol;i++){
            if(x==y){
                return arr[strow][i];
            }
            y++;
        }
        strow++;
        for(int i=strow;i<=endrow;i++){
            if(x==y){
                return arr[i][endcol];
            }
            y++;
        }
        endcol--;
        if(strow<=endrow){
        for(int i=endcol;i>=stcol;i--){
            if(x==y){
                return arr[endrow][i];
            }
            y++;
        }
    }
        endrow--;
        if(stcol<=endcol){
        for(int i=endrow;i>=strow;i--){
            if(x==y){
                return arr[i][stcol];
            }
            y++;
        }
    }
        stcol++;
}
return -1;
       

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(search(arr,3));
    }
    
}
