import java.util.*;
public class partitionuniquesubstring {
    public static int f(int idx,List<String> arr,String str){
        if(idx==str.length()) return 0;
        int max=Integer.MIN_VALUE;
        for(int i=idx;i<str.length();i++){
            String s=str.substring(idx,i+1);
            if(!arr.contains(s)){
                arr.add(s);
                int ans=1+f(i+1,arr,str);
                max=Math.max(max,ans);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(f(0,new ArrayList<>(),"aba"));
    }
}
