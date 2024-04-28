import java.util.*;
public class intersectioninterval {
    public static void main(String[] args) {
        int arr[][]={{1,2},{2,3}};
        int ans[]=arr[0];
        for(int i=0;i<ans.length;i++){
         //   System.out.print(ans[i]+" ");
        }
        LinkedList<int[]> merge =new LinkedList<>();
        merge.add(new int[]{1,2,3});
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(1, 3);
        System.out.println(a);
    }
}
