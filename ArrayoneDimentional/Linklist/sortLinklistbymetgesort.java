import java.util.*;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
    }
}
public class sortLinklistbymetgesort {

    public static node findmiddle(node head){
        if(head==null||head.next==null){
            return head;
        }
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static node merge(node head1,node head2){
           node result=null;
           if(head1==null){
            return head2;
           }
           if(head2==null){
            return head1;
           }
           if(head1.val<=head2.val){
            result=head1;
            result.next=merge(head1.next,head2);
           }else{
             result=head2;
            result.next=merge(head1,head2.next);
           }
           return result;
 
    }
    public static node mergesort(node head){
         if(head==null||head.next==null) return head;
         node middle=findmiddle(head);
         node middlenext=middle.next;
         middle.next=null;
        node left= mergesort(head);
         node right=mergesort(middlenext);
        node ans=  merge(left,right);
        return ans;


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
       node head= mergesort(a1);
       show(head);

        
    }
}
