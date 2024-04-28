import java.util.*;
public class combinationSumTwo {
    static List<List<Integer>> com=new ArrayList<>();
        public static void f(int arr[],int i,int sum,List<Integer> ans){
        if(sum==0){
           List<Integer> ls=new ArrayList<>();
           for(int x=0;x<ans.size();x++){
            ls.add(ans.get(x));
           }
           com.add(ls);
           return ;
        }
        if(i>=arr.length) return ;
        for(int ind=i;ind<arr.length;ind++){
            if(i==ind||arr[ind]!=arr[ind-1]){
                if(sum-arr[ind]>=0){
                    ans.add(arr[ind]);
                    f(arr,ind+1,sum-arr[ind],ans);
                    ans.remove(ans.size()-1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        Arrays.sort(arr);
        com=new ArrayList<>();
        f(arr,0,8,new ArrayList<>());
        System.out.println(com);
    }
}
