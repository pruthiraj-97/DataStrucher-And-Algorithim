import java.util.*;
public class validtriplatesum {
    public static void main(String[] args) {
        int arr[]={1, 4, 45, 6, 10, 8};
        int z=13;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            // neglating same intitial value
            if(i>0&&arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<z){
                    j++;
                }
                else if(sum>z){
                    k--;
                }
                else{
                    ArrayList<Integer> a=new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[j]);
                    a.add(arr[k]);
                    ans.add(a);
                    j++;
                    k--;
                    while(j<k&&arr[j]==arr[j-1]) j++;
                    while(j<k&&arr[k]==arr[k+1]) k--;
                }
            }
        }
        System.out.print(ans);
    }
}
