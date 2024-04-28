import java.util.*;
class pair implements Comparable<pair>{
    int day;
    int price;
    pair(int day,int price){
        this.day=day;
        this.price=price;
    }
    public int compareTo(pair p){
        return this.price-p.price;
    }
}
public class jobscheduling {
    public static void main(String[] args) {
        Comparator<int[]> com=new Comparator<int[]>() {
            public int compare(int a[],int b[]){
                if(a[0]>b[0]) return 1;
                else if(a[0]<b[0]) return -1;
                else{
                    if(a[1]<b[1]) return 1;
                    else return -1;
                }
            }
        };
        int arr[][]={{4,20},{1,10},{1,40},{1,30}};
        Arrays.sort(arr,com);
        PriorityQueue<pair> pq=new PriorityQueue<>();
        int time=1;
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
           int val=arr[i][1];
           if(time>arr[i][0]){
             pair p=pq.peek();
             int price=p.price;
             if(price<val){
                 pq.poll();
                 time--;
                 pq.add(new pair(time,val));
                 sum-=p.price;
                 count--;
                 sum+=val;
                 count++;
             }
           }else{
             pq.add(new pair(time,val));
             sum+=val;
             count++;
           }
           time++;
        }
        System.out.println(count);
        System.out.println(sum);

    }
}
