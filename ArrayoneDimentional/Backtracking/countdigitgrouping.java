import java.util.*;
public class countdigitgrouping {
    public static int sum(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            int asci=(int)str.charAt(i)-48;
            sum+=asci;
        }
        return sum;
    }
    public static int f(int idx,String str,List<String> arr){
          if(idx==str.length()){
            if(arr.size()==1) return 1;
            int prev=Integer.MIN_VALUE;
            int curr=Integer.MAX_VALUE;
              for(int x=0;x<arr.size();x++){
                   curr=sum(arr.get(x));
                   if(curr<prev) return 0;
                   else{
                    prev=curr;
                   }
              }
              System.out.println(arr);
              return 1;
          }
          int count=0;
          for(int i=idx;i<str.length();i++){
            String s=str.substring(idx,i+1);
            arr.add(s);
            count+=f(i+1,str,arr);
            arr.remove(arr.size()-1);
          }
          return count;
    }
    public static void main(String[] args) {
        String str="12";
        System.out.println(f(0,str,new ArrayList<>()));
    }
}
