import java.util.*;
class pair implements Comparable<pair>{
    int fre;
    Character ch;
    pair(int fre,Character ch){
        this.fre=fre;
        this.ch=ch;
    }
    public int compareTo(pair p){
       return p.fre-this.fre;
       
    }
}
public class longesthapystring {
    public static void main(String[] args) {
        int a=7;
        int b=1;
        int c=0;
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(a,'a'));
         pq.add(new pair(b,'b'));
          pq.add(new pair(c,'c'));
          String ans="";
          while(pq.size()>1){
            pair p1=pq.poll();
            pair p2=pq.poll();
            int f1=p1.fre;
            int f2=p2.fre;
            if(f1>1){
              ans=ans+p1.ch+p1.ch;
              f1=f1-2;
            }else if(f1>0){
                ans=ans+p1.ch;
                f1--;
            }
            if(f2>1&&f1<f2){
                ans=ans+p2.ch+p2.ch;
                f2=f2-2;
            }else if(f2>0){
                ans=ans+p2.ch;
                f2--;
            }
            if(f1>0){
                pq.add(new pair(f1,p1.ch));
            }
            if(f2>0){
                pq.add(new pair(f2, p2.ch));
            }
          }
          if(pq.size()>0){
            pair p=pq.poll();
            int i=0;
            int fre=p.fre;
            if(ans.length()==0||ans.charAt(ans.length()-1)!=p.ch){
            while(i<2&&fre>0){
                ans=ans+p.ch;
                i++;
                fre--;
            }
          }
        }
          System.out.println(ans);
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
    }
}
