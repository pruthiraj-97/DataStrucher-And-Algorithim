import java.util.*;
public class p1 {
    public static boolean cheak(int visit[],String str){
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            if(visit[idx]==1) return false;
        }
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            visit[idx]=1;
        }
        return true;
    }
    public static void remove(int visit[],String str){
        for (int i = 0; i < str.length(); i++) {
            int idx=str.charAt(i)-'a';
            visit[idx]=0;
        }
    }
    public static int f(List<String> arr,int i,int visit[]){
         if(i==arr.size()) return 0;
         int take=Integer.MIN_VALUE;
         if(cheak(visit,arr.get(i))){
            take=arr.get(i).length()+f(arr,i+1,visit);
         }
         remove(visit,arr.get(i));
         int nottake=f(arr,i+1,visit);
         return Math.max(take,nottake);
    }
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("un");
        ls.add("iq");
        ls.add("ue");
        int visit[]=new int[26];
        System.out.println(f(ls,0,visit));
    }
}