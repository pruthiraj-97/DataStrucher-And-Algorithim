import java.util.*;
public class longestconsicutiveones {
    public static int consicutiveones(int arr[]){
        int max=0;
        Set<Integer> st=new HashSet<>();
        //int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                st.add(arr[i]);
            }else{
                max=Math.max(max,st.size());
                    st.clear();
                }
            }
          max=Math.max(max,st.size());
          return max;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(consicutiveones(arr));
        
    }
    
}
