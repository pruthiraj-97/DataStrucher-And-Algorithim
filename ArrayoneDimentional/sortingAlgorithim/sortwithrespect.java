import java.util.*;
public class sortwithrespect {
    public static void main(String[] args) {
        int arr1[]={2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int arr2[]={2, 1, 8, 3};
        Arrays.sort(arr1);
        Map<Integer,Integer> mp1=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(!mp1.containsKey(arr1[i])) mp1.put(arr1[i],i);
        }
        
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr2.length-1;i++){
            if(!mp.containsKey(arr2[i])){
                mp.put(arr2[i],arr2[i+1]);
            }
        }
        
        for(int i=0;i<arr1.length;i++){
            if(mp.containsKey(arr1[i])){
                int idx=mp1.get(mp.get(arr1[i]));
                System.out.print(arr1[i]+" "+idx);
                System.out.println();
                int j=i;
            while(j>=idx){
                int temp;
                temp=arr1[i];
                arr1[i]=arr1[idx];
                arr1[idx]=temp;
                j--;
                
            }
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println(mp1);
        System.out.println(mp);
    }
}
