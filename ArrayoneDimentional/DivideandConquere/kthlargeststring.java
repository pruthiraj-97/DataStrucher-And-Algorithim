import java.math.BigInteger;
import java.util.*;
public class kthlargeststring {
    public static void main(String[] args) {
        Comparator<String> com=new Comparator<String>() {
            public int compare(String s1,String s2){
                if(s1.length()<s2.length()) return 1;
                else{
                    if(s1.length()==s2.length()&&s1.compareTo(s2)<0) return 1;
                    else return -1;
                }
            }
        };
        String arr[]={"2","21","12","1"};
        // Arrays.sort(arr,com);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int k=3;
        BigInteger[] a = new BigInteger[arr.length];
        PriorityQueue<BigInteger> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            a[i]=new BigInteger(arr[i]);
        }
        for (int i = 0; i < a.length; i++) {
            pq.add(a[i]);
            if(pq.size()>k) pq.poll();
        }
        BigInteger result=pq.peek();
        System.out.println(result.toString());
    }
}
