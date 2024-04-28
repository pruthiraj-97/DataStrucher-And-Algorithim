public class countsort {
    public static void countSort(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++) max=Math.max(max,arr[i]);
        int prefix[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            prefix[arr[i]]++;
        }
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i]+prefix[i-1];
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int v=prefix[arr[i]];
            ans[v-1]=arr[i];
            prefix[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={5,1,2,8,3,5,6,1,4};
        countSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
