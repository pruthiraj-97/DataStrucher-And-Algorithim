import java.util.*;
public class practice {
    public static void main(String[] args) {
        String str= "ababcbacadefegdehijhklij";
        List<Integer> ans=new ArrayList<>();
        int arr[][]=new int[26][2];
        for(int i=0;i<26;i++){
            arr[i][0]=-1;
            arr[i][1]=-1;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(arr[ch-'a'][0]==-1){
                arr[ch-'a'][0]=i;
                arr[ch-'a'][1]=i;
            }else{
                arr[ch-'a'][1]=i;
            }
        }
         Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        LinkedList<int[]> merge =new LinkedList<>();
        for(int[] interval:arr){
            if(interval[0]==-1) continue;
            if(merge.isEmpty()||merge.getLast()[1]<interval[0]){
                merge.add(interval);
            }else{
                merge.getLast()[1]=Math.max(merge.getLast()[1],interval[1]);
            }
        }

        while(merge.size()>0){
            int a[]=merge.poll();
            ans.add(a[1]-a[0]+1);
        }
        System.out.println(ans);
        
    }
}
