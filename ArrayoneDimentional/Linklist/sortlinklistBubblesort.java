import java.util.*;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
    }
}
public class sortlinklistBubblesort {
      public static node sortList(node head) {
        if(head==null) return head;
        node flag=head;
        while(flag!=null){
            flag=flag.next;
        }
        while(head.next!=flag){
            node slow=head;
           node fast=head.next;
            boolean show=false;
            while(fast!=flag){
                if(slow.val>fast.val){
                    int temp;
                    temp=slow.val;
                    slow.val=fast.val;
                    fast.val=temp;
                    show=true;
                }
                if(fast.next==flag){
                    flag=fast;
                    break;
                }
                slow=slow.next;
                fast=fast.next;
            }
             if(show==false) break;
        }
        return head;
    }
    public static void show(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        node a1=new node(2);
        node a2=new node(6);
        node a3=new node(5);
        node a4=new node(4);
        node a5=new node(3);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        node head=sortList(a1);
        show(head);

    }
}
