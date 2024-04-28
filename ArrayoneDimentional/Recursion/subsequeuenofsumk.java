import java.util.*;
public class subsequeuenofsumk {
    static int cou=0;
    public static boolean count(int arr[],int i,int t,List<Integer> ans,int sum){
        
         if(i==arr.length){
            if(t==sum){
                System.out.println(ans);
                return true;
            }else{
                return false;
            }
         }
         ans.add(arr[i]);
          if(count(arr,i+1,t+arr[i],ans,sum)==true){
            return true;}
         ans.remove(ans.size()-1);
         if(count(arr,i+1,t,ans,sum)==true){
            return true;
         }
         return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        cou=0;
        List<Integer> ans=new ArrayList<>();
        count(arr,0,0,ans,2);
        System.out.println(cou);
    }
}
