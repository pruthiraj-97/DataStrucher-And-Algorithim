public class howmanytimesarrayrotead {
    public static int roted(int arr[]){
        int x=0;
        int ans=0;
        int y=arr.length-1;
        int n=arr.length-1;
        while(x<=y){
            int mid=(x+y)/2;
            if(arr[mid]>arr[n]){
                ans=mid+1;
                x=mid+1;
            }else{
                y=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={5,1,2,3,4};
        System.out.println(roted(arr));
    }
   
    
}
