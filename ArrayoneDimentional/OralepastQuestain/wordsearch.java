import java.util.*;
public class wordsearch {
    public static void main(String[] args) {
        String s="the quick the brown quick brown the frog";
        String w1="quick";
        String w2="frog";
        String str[]=s.split(" ");
        int arr[]={-1,-1};
       int min=Integer.MAX_VALUE;
       for(int i=0;i<str.length;i++){
            String st=str[i];
            if(st.equals(w1)){
                if(arr[1]!=-1){
                    min=Math.min(min,i-arr[1]-1);
                }
                arr[0]=i;
            }
            if(st.equals(w2)){
                if(arr[0]!=-1){
                    min=Math.min(min,i-arr[0]-1);
                }
                arr[1]=i;
            }
       }
       System.out.println(min);
       Comparator<pair> com =new Comparator<>() {
            
       };
    }
}
