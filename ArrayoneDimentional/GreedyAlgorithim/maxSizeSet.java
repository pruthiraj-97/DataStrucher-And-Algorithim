import java.util.*;
public class maxSizeSet {
    public static int f(int arr1[],int arr2[]){
        Set<Integer> st1=new HashSet<>();
        Set<Integer> st2=new HashSet<>();
        for(int val:arr1){
           st1.add(val);
        }
         for(int val:arr2){
           st2.add(val);
        }
        
        Iterator<Integer> iterator1 = st1.iterator();
        while (st1.size()>arr1.length/2&&iterator1.hasNext()) {
            int val = iterator1.next();
            if(st2.contains(val)){
                st1.remove(val);
            }
        }
         Iterator<Integer> iterator2 = st1.iterator();
        while (st2.size()>arr1.length/2&&iterator2.hasNext()) {
            int val = iterator2.next();
            if(st1.contains(val)){
                st2.remove(val);
            }
        }
        int ans=Math.min(arr1.length/2,st1.size())+Math.min(arr2.length/2,st2.size());
        System.out.println(ans);
        return 0;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,3,2,3,2,3};
        f(arr1,arr2);
        
    }
}
