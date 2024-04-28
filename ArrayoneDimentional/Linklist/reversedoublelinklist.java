import java.util.*;

import javax.xml.transform.Source;
class node{
    int data;
    node next;
    node prev;
    node(int data){
        this.data=data;
    }
}
public class reversedoublelinklist {
    public static node reverse(node head){
        node previs=null;
        node curr=head;
        node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=previs;
            if(previs!=null){
            previs.prev=curr;
            }
            previs=curr;
            curr=after;
        }
        return previs;
    }
    public static void show(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        node a1=new node(1);
        node a2=new node(2);
        node a3=new node(3);
        node a4=new node(4);
        a1.next=a2;
        a2.prev=a1;
        a2.next=a3;
        a3.prev=a2;
        a3.next=a4;
        a4.prev=a3;
        node head=reverse(a1);
        show(head);

        
    }
    
}
