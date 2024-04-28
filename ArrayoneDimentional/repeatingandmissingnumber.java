import java.util.*;
public class repeatingandmissingnumber {
    public static void show(int arr[],int n){
        int ans[]=new int[2];
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],2);
            }else{
                mp.put(arr[i],1);
            }
        }
      
       
        for(int i=1;i<=n;i++){
            if(!mp.containsKey(i)){
                ans[0]=i;
            }else{
                 int x=mp.get(i);
                 if(x==2){
                    ans[1]=i;
                 }
            }
            
        }
        System.out.println(ans[0]+" "+ans[1]);



    }
    public static void main(String[] args) {
        int arr[]={1,3,2,4,6,2};
        show(arr,6);
        
    }
    
}
