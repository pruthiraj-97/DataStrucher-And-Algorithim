import java.util.*;
public class Treesumoptimal {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr); // merge sort O(nlogn);
        for(int i=0;i<arr.length;i++){
            if(i>0&&arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0){
                   j++;
                }
                else if(sum>0){
                    k--;
                }else{
                   ArrayList<Integer> a=new ArrayList<>();
                     a.add(arr[i]);
                     a.add(arr[j]);
                     a.add(arr[k]);
                     ans.add(a);
                     j++;
                     k--;
                     while(j<k&arr[j]==arr[j-1]) j++;
                     while(j<k&&arr[k]==arr[k+1]) k--;
                }
            }
        }
        System.out.println(ans);

    }
}
