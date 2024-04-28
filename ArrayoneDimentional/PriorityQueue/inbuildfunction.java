import java.util.*;
public class inbuildfunction {
      public static void main(String[] args) {
        int arr[]={0,1};
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) ans.add(arr[i]);
        }
        System.out.println(ans);
        Collections.sort(ans);
        int a=-1;
        int x=0;
        int y=ans.size()-1;
        while(x<=y){
            int mid=(x+y)/2;
            if(ans.get(mid)==mid+1){
                a=ans.get(mid)+1;
                x=mid+1;
            }
            else if(ans.get(mid)>mid+1){
                y=mid+1;
            }
        }
        if(a==-1) System.out.println(ans.get(0)-1);
       System.out.println(a);
      
      }
        
    
    
}
