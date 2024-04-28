import java.util.*;
public class maximizegreatnessofanarray {
    public static int findIndex(int arr[],int t){
        int x=0;
        int y=arr.length-1;
        while(x<=y){
            int mid=(x+y)/2;
            if(arr[mid]==t){
                return mid;
            }else if(arr[mid]<t){
                x=mid+1;
            }else{
                y=mid-1;
            }
        }
        return -1;
    }
    public static int countNumber(int num[]){
        int arr[]=new int[num.length];
        for(int i=0;i<num.length;i++){
            arr[i]=num[i];
        }
        int count=0;
        Arrays.sort(arr);
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<num.length;i++){
           int ans=findIndex(arr,num[i]);
           System.out.print(ans+" ");
           int j=ans+1;
           while(j<arr.length&&arr[j]==arr[ans]||st.contains(j)){
               j++;
           }
           if(j!=arr.length){
                st.add(j);
                count++;
           }
        }
        System.out.println(st);
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,1,3,1};
        System.out.println(countNumber(arr));
    }
}
