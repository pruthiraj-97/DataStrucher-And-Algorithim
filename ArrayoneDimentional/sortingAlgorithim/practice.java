import java.util.*;
public class practice {
	public static void merge(int arr[],int s,int mid,int e,Map<Integer,Integer> mp){
        int left[]=new int[mid-s+1];
        int right[]=new int[e-mid];
        for(int i=0;i<left.length;i++) left[i]=arr[i+s];
        for(int i=0;i<right.length;i++) right[i]=arr[i+mid+1];
         int i=0;
         int j=right.length-1;
         while(i<left.length&&j>=0){
             int count=0;
             while(j>=0&&right[j]>=left[i]){
                 j--;
             }
             count=count+j+1;
             if(mp.containsKey(left[i])){
                 mp.put(left[i],mp.get(left[i])+count);
             }else{
                 mp.put(left[i],count);
             }
             i++;
         }
           i=0;
           j=0;
           int x=s;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                arr[x++]=left[i++];
            }else{
                arr[x++]=right[j++];
            }
        }
        while(i<left.length) arr[x++]=left[i++];
        while(j<right.length) arr[x++]=right[j++];
        
    }
    public static void mergesort(int arr[],int s,int e, Map<Integer,Integer> mp){
             if(s>=e) return ;
             int count=0;
             int mid=(s+e)/2;
             mergesort(arr,s,mid,mp);
             mergesort(arr,mid+1,e,mp);
             merge(arr,s,mid,e,mp);
    }
    public static void main(String[] args) {
		int arr[]={5,2,6,1};
		int ref[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) ref[i]=arr[i];
        Map<Integer,Integer> mp=new HashMap<>();
        mergesort(arr,0,arr.length-1,mp);
        List<Integer> ans=new ArrayList<>();
		int x=0;
		for(int i=0;i<arr.length;i++){
            if(mp.containsKey(ref[i])){
                ans.add(mp.get(ref[i]));
            }else{
                ans.add(0);
            }
        }
		System.out.println(mp.containsKey(5));
      System.out.println(mp);
	  System.out.println(ans);
		
		
        
    }
    
}
