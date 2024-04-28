import java.util.*;
class pair{
    int num;
    int idx;
    pair(int num,int idx){
        this.num=num;
        this.idx=idx;
    }
}
public class Kthtrimelement {
    public static void main(String[] args) {
        int arr[][]= {{2,1},{2,2}};
        int ans[]=new int[arr.length];
        String str[]={"64333639502","65953866768"};
        int x=0;
        int n=str[0].length();

        Comparator<pair> com=new Comparator<pair>() {
            public int compare(pair p1,pair p2){
                if(p1.num>p2.num) return 1;
                else if(p1.num<p2.num){
                    return -1;
                }else{
                    if(p1.idx>p2.idx) return 1;
                    else return -1;
                }
            }
        };

        for(int i=0;i<arr.length;i++){
            List<pair> ls=new ArrayList<>();
            for(int j=0;j<str.length;j++){
                int s=n-arr[i][1];
                try {
                    int num=Integer.parseInt(str[j].substring(s,n));
                ls.add(new pair(num,j));
                } catch (Exception e) {
                    System.out.println("error");
                }
            }
            Collections.sort(ls,com);
           ans[x]=ls.get(arr[i][0]-1).idx;
           x++;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

        String s1="123";
        String s2="57";
        if(s1.compareTo(s2))
    }
}
