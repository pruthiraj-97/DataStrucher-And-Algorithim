import java.util.*;
public class practice {
    public static void main(String[] args) {
        int arr[]={0,1,2,4,5,7};
        List<String> ans=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
           int j=i+1;
           int curr=arr[i];
           while(j<arr.length-1&&arr[j]-curr==1){
               curr=arr[j];
               j++;
           }
           String s=Integer.toString(arr[i])+"->"+Integer.toString(arr[j-1]);
           ans.add(s);
           //if(j==arr.length) break;
           i=j-1;
       }  
       System.out.println(ans);
    }
}
