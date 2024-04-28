import java.util.Arrays;

public class countpairpairs {
    public static void main(String[] args) {
        int arr[]={0,1,7,4,4,5};
        int l=3;
        int u=6;
        int ans=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            //int ans=0;
            int x=i+1;
            int y=arr.length-1;
            int idx1=-1;
            int idx2=-1;
            int low=l-arr[i];
            while(x<=y){
                int mid=(x+y)/2;
                if(arr[mid]>=low){
                    idx1=mid;
                    y=mid-1;
                }else{
                    x=mid+1;
                } 
            }
            x=i+1;
            y=arr.length-1;
            int high=u-arr[i];
            while(x<=y){
                int mid=(x+y)/2;
                if(arr[mid]<=high){
                    idx2=mid;
                    x=mid+1;
                }else{
                    y=mid-1;
                } 
            }
           // System.out.println(idx1+" "+idx2);
            if(idx1!=-1&&idx2!=-1&&idx2>=idx1){
               ans=ans+idx2-idx1+1;
            }
           
        }
        System.out.println(ans);
        
    }
}
