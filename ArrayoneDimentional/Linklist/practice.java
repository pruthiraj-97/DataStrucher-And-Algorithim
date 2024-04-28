import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
public class practice {
    public static void show(node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void delete(node head,int idx){
        for(int i=1;i<idx-1;i++){
            head=head.next;
        }
        head.next=head.next.next;
    }
    public static void main(String[] args) {
       node a=new node(3);
       node a1=new node(5);
       node a2=new node(4);
       node a3=new node(6);
       a.next=a1;
       a1.next=a2;
       a2.next=a3;
       show(a);
       delete(a,2);
       System.out.println();
       show(a);


    }

    
}
