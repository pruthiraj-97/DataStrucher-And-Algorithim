import java.util.*;
class node{
    int val;
    node next;
    node prev;
    node(int val){
        this.val=val;
    }
}
public class removeduplicatesfromdoublylinklist {
    public static node duplicates(node head){
        if(head==null||head.next==null){
            return head;
        }
         
          Deque<Integer> dq=new ArrayDeque<>();
          node temp=head;
          while(temp!=null){
            if(dq.size()==0){
                dq.addLast(temp.val);
            }else if(temp.val==dq.peekLast()){
                dq.pollLast();
                dq.addLast(temp.val);
            }else{
              dq.addLast(temp.val);
            }
            temp=temp.next;
          }
          node t=new node(-1);
          node h=t;
          while(dq.size()>0){
            node z=new node(dq.pollFirst());
            t.next=z;
            z.prev=t;
            t=t.next;
          }
          h=h.next;
          return h;
    }
    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        node a1=new node(1);
        node a2=new node(1);
        node a3=new node(1);
        node a4=new node(2);
        node a5=new node(3);
        node a6=new node(4);
        a1.next=a2;
        a2.prev=a1;
        a2.next=a3;
        a3.prev=a2;
        a3.next=a4;
        a4.prev=a3;
        a4.next=a5;
        a5.prev=a4;
        a5.next=a6;
        a6.prev=a5;
       node head= duplicates(a1);
       display(head);
;
        
    }
    
}
