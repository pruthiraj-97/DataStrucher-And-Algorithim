import java.util.*;
public class ifpossibletosplitarray {
    public static boolean cheak(List<Integer> nums,int arr[],int i,int j,int m){
        if(j-i<=1) return true;
        int left=(i==0)?0:arr[i-1];
        int sum=arr[j]-left;
        // if(sum<m) return false;
        // if(nums.get(j)<nums.get(i)){
        //     return cheak(nums,arr,i,j-1,m);
        // }
        // else if(nums.get(i)<nums.get(j)){
        //     return cheak(nums,arr,i+1,j,m);
        // }else{
        //     return cheak(nums,arr,i+1,j,m)||cheak(nums,arr,i,j-1,m);
        // }
        boolean bn1=cheak(nums,arr,i,j-1,m);
        boolean bn2=cheak(nums,arr,i+1,j,m);
        return bn1||bn2;
    }

    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(2);
        nums.add(3);
        int arr[]=new int[nums.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums.get(i);
        }
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println(cheak(nums,arr,0,arr.length-1,6));
    }
}
