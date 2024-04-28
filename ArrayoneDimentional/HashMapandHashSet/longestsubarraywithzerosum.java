import java.util.*;
public class longestsubarraywithzerosum {
    public static int maxzero(int arr[]){
        Map<Integer,Integer> mp=new HashMap<>();
        int prefix=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(prefix==0){
                max=Math.max(max,i+1);
            }
            if(mp.containsKey(prefix)){
                max=Math.max(max,i-mp.get(prefix));
            }
            if(!mp.containsKey(prefix)){
                 mp.put(prefix,i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        //System.out.println(maxzero(arr));
        char ch=(char)(97+25);
        System.out.println(ch);
        List<String> ans=new ArrayList<>();
        ans.add("gss");
        ans.add("asd");
        ans.add("ebs");
          List<String> ar =new ArrayList<>();
          ar.add(ans.get(0));
          for(int i=1;i<ans.size();i++){
            String s=""+ans.get(i);
            String t=""+ar.get(0);
            if(s.compareTo(t)<0){
               ar.add(0, s);
            }
          }
          String s="pruthi";
          //reverse(s);  
          System.out.println(ar.get(0));
          String original = "Hello, World!";
  String reversed = reverseString(original);
   System.out.println(reversed);
   
        
    }
}
