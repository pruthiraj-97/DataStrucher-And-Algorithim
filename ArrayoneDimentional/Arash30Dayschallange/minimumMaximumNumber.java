import java.util.*;
public class minimumMaximumNumber {
    public static void f(String str,String a,String b,int k){
      List<Integer> ls1=new ArrayList<>();
      int n=a.length();
      int m=b.length();
      for(int i=0;i<=str.length()-a.length();i++){
        if(str.substring(i,i+n).equals(a)) ls1.add(i);
      }
      List<Integer> ls2=new ArrayList<>();
      for(int i=0;i<=str.length()-b.length();i++){
        if(str.substring(i,i+m).equals(b)) ls2.add(i);
      }
      List<Integer> ans=new ArrayList<>();
      for(int i=0;i<ls1.size();i++){
           for(int j=0;j<ls2.size();j++){
                if(Math.abs(ls2.get(j)-ls1.get(i))<=k){
                    ans.add(ls1.get(i));
                    break;
                }
           }
      }
      System.out.println(ans);
    }
    public static void main(String[] args) {
       int a=1000000000*8;
       PriorityQueue<pair> pq=new PriorityQueue<>(a,b->double.comp);
    }
}
