import java.util.*;
public class Uniceelement {
    public static void max(int arr1[],int arr2[]){
        ArrayList<Integer> at=new ArrayList<>();
        HashSet<Integer> mp=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            if(!mp.contains(arr1[i])){
                mp.add(arr1[i]);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(!mp.contains(arr2[i])){
                mp.add(arr2[i]);
            }
        }
        for(int num:mp){
            at.add(num);
        }
        System.out.println(at);
        mp.c
       
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3};
        max(arr1,arr2);
    }
}
