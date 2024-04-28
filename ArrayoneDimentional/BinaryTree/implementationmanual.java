import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class implementationmanual {
    public static void display(node root){
        if(root==null){
            return ;
        }
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        node root=new node(2);
        node a=new node(4);
        node b=new node(10);
        root.left=a;
        root.right=b;
        node c=new node(6);
        node d=new node(5);
        a.left=c;
        a.right=d;
        node e=new node(11);
        b.right=e;
        display(root);
        
        
    }
    
}
