import java.util.*;
public class minimumTimeColorBallon {
    public static int f(int i,int j,int arr[],String str){
        if(j>=arr.length) return 0;
        if(str.charAt(i)==str.charAt(j)){
            int c1=arr[i]+f(i+1,j+1,arr,str);
            int c2=arr[j]+f(i,j+1,arr,str);
            return Math.min(c1,c2);
        }
        return f(i+1,j+1,arr,str);
    }
    public static void main(String[] args) {
        String str="aabaa";
        int arr[]={1,2,3,4,1};
        System.out.println(f(0,1,arr,str));
    }
}
