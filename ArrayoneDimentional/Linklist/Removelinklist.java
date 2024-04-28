import java.util.*;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
    }
}
public class Removelinklist {
    public static node remove(node head){
        node slow=head;
        node fast=head.next;
        while(slow!=null){
        while(fast!=null&&fast.val==slow.val){
            fast=fast.next;
        }
        slow.next=fast;
        slow=fast;
        if(slow==null){
            break;
        }
        fast=slow.next;
    }
    return head;
    }
    public static void show(node head){
        if(head==null){
            System.out.println("null");
            return;
        }
       // node temp=head;
        System.out.print(head.val+" ");
        node temp=head.next;
        while(temp!=head){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static node deleteNode(node head, int key) {
        if(head.next==head){
            if(head.val==key) return null;
        }
        node temp=head.next;
        while(temp.next!=head) temp=temp.next;

        if(head.val==key){
            node t=head.next;
            head.next=null;
            temp.next=t;
            return t;
        }
        temp=head;
        node temp1=head.next;
        while(temp1!=head){
            if(temp1.val==key){
                temp.next=temp1.next;
                break;
            }
            temp=temp.next;
            temp1=temp1.next;
        }
        return head;
        
    }
    public static void main(String[] args) {
        node a1=new node(1);
        // node a2=new node(7);
        // node a3=new node(2);
        // node a4=new node(3);
        // node a5=new node(4);
       // System.out.println(a1);
        // a1.next=a2;
        // a2.next=a3;
        // a3.next=a4;
        // a4.next=a5;
        a1.next=a1;
        node t=deleteNode(a1,1);
        show(t);
      // node head= remove(a1);
       //show(head);
        
        
        
        
    }
    
}
