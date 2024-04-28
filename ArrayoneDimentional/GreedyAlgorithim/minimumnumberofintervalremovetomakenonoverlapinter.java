import java.util.*;
public class minimumnumberofintervalremovetomakenonoverlapinter {
    public static void main(String[] args) {
        int Intervals[][]={{1, 2}, {2, 3}, {3, 4}, {1, 3}};
     Arrays.sort(Intervals,(a,b)->Integer.compare(a[0],b[0]));
      LinkedList<int[]> ll=new LinkedList<>();
      int x=0;
        for(int interval[]:Intervals){
            if(ll.isEmpty()||ll.getLast()[1]<=interval[0]){
              ll.add(interval);
            }else{
               ll.getLast()[1]=Math.min(ll.getLast()[1],interval[0]);
               x++;
            }
        }
        return x;

    }
    
}
