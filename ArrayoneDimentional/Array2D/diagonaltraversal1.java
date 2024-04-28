import java.util.*;
public class diagonaltraversal1 {
    public static ArrayList<Integer> f(int arr[][],int i,int j){
        ArrayList<Integer> a=new ArrayList<>();
        while(i>=0&&j<arr[0].length){
           a.add(arr[i][j]);
           i--;
           j++;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> ans=new ArrayList<>();
        int m=arr.length;
        int n=arr[0].length;
        int i=0;
        int j=0;
        boolean flag=true;
        while(i<m&&j<n){
           ArrayList<Integer> a=f(arr,i,j);
           if(flag==true){
            for(int k=0;k<a.size();k++){
                ans.add(a.get(k));
            }
           }else{
              int x=a.size()+ans.size()-1;
              int y=ans.size();
              for(int k=a.size()-1;k>=0;k--){
                ans.add(a.get(k));
              }
           }
           if(i==arr.length-1){
           // i++;
            j++;
           }else{
            i++;
           }
           flag=!flag;
        }
        System.out.println(ans);
    }
}
