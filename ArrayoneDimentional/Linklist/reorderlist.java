import java.util.*;

import org.w3c.dom.Node;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
public class reorderlist {
    public static node reverse(node head){
        node curr=head;
        node prev=null;
         node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public static void show(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
           temp=temp.next;
        }
    }
    public static void main(String[] args) {
        node head=new node(1);
        node a2=new node(2);
        node a3=new node(3);
        node a4=new node(4);
        head.next=a2;
        a2.next=a3;
        a3.next=a4;
         node a5=new node(5);
         a4.next=a5;
         if(head==null||head.next==null) return ;
         node h1=head;
         node h2=head.next;
         node t1=h1;
         node t2=h2;
        while(t1!=null&&t2!=null){
            t1.next=t2.next;
            if(t1==null) break;
            t1=t1.next;
             if(t1==null) break;
            t2.next=t1.next;
             if(t2==null) break;
            t2=t2.next;
        }
        h2=reverse(h2);
         node h=new  node(-1);
        node t=h;
        while(h1!=null&&h2!=null){
            h.next=h1;
            h1=h1.next;
            h=h.next;
            h.next=h2;
            h2=h2.next;
            h=h.next;
        }
        if(h1!=null) h.next=h1;
        
         show(t.next);


        
    }
    
}
