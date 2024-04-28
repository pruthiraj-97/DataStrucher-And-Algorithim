public class singleelementinansortedarray {
    public static int singleelement(int arr[]){
        int n=arr.length;
        if(arr.length==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];

        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]){
                return arr[mid];
            }else if(mid%2!=0){
                if(arr[mid]!=arr[mid-1]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid]!=arr[mid+1]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
                }
                return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4};
        System.out.println(singleelement(arr));
    }
    
}
