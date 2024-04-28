import java.util.*;
public class costofpushesKeyword {
    public static int f(String str[]){
        Map<String,Integer> mp=new HashMap<>();
        int arr[]=new int[str.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<str.length;i++){
         String s=str[i];
         if(mp.containsKey(s)){
           int t=mp.get(s);
           int x=(t-1<0)?0:arr[t-1];
           arr[i]=Math.min(x+1,arr[i]);
         }else{
            mp.put(s,i);
            int y=(i-1<0)?0:arr[i-1];
            arr[i]=Math.min(arr[i],1+y);
         }
        }
        // for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
       String str[]={"abc","def","abc","ajek","ghf","ajek","def","abc"};
       System.out.println(f(str));
    
        
    }
}
